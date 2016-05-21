package com.jekainfinity.utill.wrapper;

import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JavaObjectFromString extends SimpleJavaFileObject{
    private String contents;

    protected JavaObjectFromString(String classname, String contents) throws URISyntaxException {
        super(new URI(classname), Kind.SOURCE);
        this.contents = contents;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
        return contents;
    }
}
