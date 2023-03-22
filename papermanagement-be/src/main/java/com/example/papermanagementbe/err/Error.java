package com.example.papermanagementbe.err;

public enum Error {
    SUCCESS_CODE("200","操作成功"),
    MANAGER_CEODE("0","管理员"),
    TEACHER_CEODE("1","教师"),
    STUDENT_CEODE("2","学生"),

    NO_HUMAN_ERR("201","该人员不存在"),
    REPEAT_CODE("202","人员重复添加"),
    FAILD_CODE("500","系统错误，请联系管理员");

    private String code;
    private String errormessage;

    Error(String code,String errormessage){
        this.code=code;
        this.errormessage=errormessage;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }
}
