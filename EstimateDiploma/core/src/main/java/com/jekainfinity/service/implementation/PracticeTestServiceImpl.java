package com.jekainfinity.service.implementation;

import com.jekainfinity.hibernate.bean.CompileInform;
import com.jekainfinity.hibernate.bean.PracticeTestBean;
import com.jekainfinity.hibernate.dao.PracticeTestDao;
import com.jekainfinity.hibernate.entity.tasks.PracticeTask;
import com.jekainfinity.service.PractiseTestService;
import com.jekainfinity.utill.mappers.Mapper;
import com.jekainfinity.utill.wrapper.JavaObjectFromString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Service;

import javax.tools.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service("practiceTestService")
public class PracticeTestServiceImpl implements PractiseTestService {

    @Autowired
    private PracticeTestDao practiceTestDao;

    @Autowired
    private Mapper mapper;

    public void savePracticeTest(PracticeTestBean practiceTestBean) {
        practiceTestDao.save(mapper.convertToPracticeTaskObject(practiceTestBean));
    }

    @Override
    public List<PracticeTask> getListPractice() {
        return practiceTestDao.listPractice();
    }

    @Override
    public Map<String, Integer> startChecking(String code, Integer practiceTestId) {
        return null;
    }

    @Override
    public void createFile(String code, String fileName) {
        createFileFromString(code, fileName);
    }

    @Override
    public CompileInform compileResult(String fileName) throws IOException {
            return checkForCompileError(fileName);
    }

    private CompileInform checkForCompileError(String fileName) throws IOException {

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector <JavaFileObject> diagnosticCollector = new DiagnosticCollector<>();
        StandardJavaFileManager manager = compiler.getStandardFileManager(diagnosticCollector, null, null);

        File javaFileObject = new File(fileName + ".java");
        Iterable<? extends  JavaFileObject> fileObjects = manager.getJavaFileObjectsFromFiles(Arrays.asList(javaFileObject));
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager,diagnosticCollector,null,null,fileObjects);

        Boolean result = task.call();
        CompileInform inform = new CompileInform();

        if(result){
            inform.setStatus(true);
            inform.setResult(getProgramRes(fileName));
        }else{
            inform.setStatus(false);

            List<String> listErr = new ArrayList<>();
            for(Diagnostic <? extends JavaFileObject> d : diagnosticCollector.getDiagnostics()){
                listErr.add(String.format("%s, line %d in %s", d.getMessage(null),d.getLineNumber(),d.getSource().getName()));
            }

            inform.setListErr(listErr);
        }

        return inform;
    }

    private File createFileFromString(String code, String fileName) {
        File file = null;
        try {
            file = new File(fileName + ".java");

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(code);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }

    private String getProgramRes(String filename) throws IOException {
        Process p = Runtime.getRuntime().exec("java " + filename);
        String line = null;
        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

        while ((line = in.readLine()) != null) {
            sb.append(line);
        }

        return sb.toString();
    }

}
