package com.zjh.tears.exception;

/**
 * Created by zhangjiahao on 2017/2/7.
 */
public class HTTPException extends Exception {
    protected int code;
    protected String errMessage;

    public HTTPException(Exception source, int code, String errMessage) {
        this.code = code;
        this.errMessage = errMessage;
        if(source != null) {
            this.setStackTrace(source.getStackTrace());
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
