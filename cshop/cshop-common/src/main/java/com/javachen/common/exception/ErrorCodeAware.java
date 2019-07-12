package com.javachen.common.exception;

public interface ErrorCodeAware {
    public int getErrorCode();
    public String getErrorMsg();
    public ErrorCodeAware setErrorMsg(String errorMsg);
}
