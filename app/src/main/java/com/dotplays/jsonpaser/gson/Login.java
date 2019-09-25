
package com.dotplays.jsonpaser.gson;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("Success")
    @Expose
    private Boolean success;
    @SerializedName("Data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("ItemCount")
    @Expose
    private Integer itemCount;
    @SerializedName("Exception")
    @Expose
    private java.lang.Exception exception;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public java.lang.Exception getException() {
        return exception;
    }

    public void setException(java.lang.Exception exception) {
        this.exception = exception;
    }

}
