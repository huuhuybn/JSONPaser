
package com.dotplays.jsonpaser.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exception {

    @SerializedName("ErrorCode")
    @Expose
    private Object errorCode;
    @SerializedName("ErrorMessage")
    @Expose
    private Object errorMessage;
    @SerializedName("ErrorDetail")
    @Expose
    private Object errorDetail;

    public Object getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(Object errorDetail) {
        this.errorDetail = errorDetail;
    }

}
