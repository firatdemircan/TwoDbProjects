package com.works.utils.result;


import com.works.Model.enums.EResult;

public class Result<T> {

    private EResult eResult;
    private String message;
    private T data;

    public Result(EResult eResult, String message, T data) {
        this.eResult = eResult;
        this.message = message;
        this.data = data;
    }

    public Result(EResult eResult) {
        this.eResult = eResult;
    }

    public Result(EResult eResult, T data) {
        this.eResult = eResult;
        this.data = data;
    }

    public Result(EResult eResult, String message) {
        this.eResult = eResult;
        this.message = message;
    }
}
