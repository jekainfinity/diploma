package com.jekainfinity.hibernate.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompileInform {
    private boolean status;
    private List<String> listErr = new ArrayList<>();
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<String> getListErr() {
        return listErr;
    }

    public void setListErr(List<String> listErr) {
        this.listErr = listErr;
    }
}
