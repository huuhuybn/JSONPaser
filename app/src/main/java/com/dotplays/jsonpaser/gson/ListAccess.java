
package com.dotplays.jsonpaser.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListAccess {

    @SerializedName("GROUPCODE")
    @Expose
    private Object gROUPCODE;
    @SerializedName("OBJECTCODE")
    @Expose
    private String oBJECTCODE;
    @SerializedName("LOGLUDTIME")
    @Expose
    private String lOGLUDTIME;
    @SerializedName("LOGLUBY")
    @Expose
    private String lOGLUBY;

    public Object getGROUPCODE() {
        return gROUPCODE;
    }

    public void setGROUPCODE(Object gROUPCODE) {
        this.gROUPCODE = gROUPCODE;
    }

    public String getOBJECTCODE() {
        return oBJECTCODE;
    }

    public void setOBJECTCODE(String oBJECTCODE) {
        this.oBJECTCODE = oBJECTCODE;
    }

    public String getLOGLUDTIME() {
        return lOGLUDTIME;
    }

    public void setLOGLUDTIME(String lOGLUDTIME) {
        this.lOGLUDTIME = lOGLUDTIME;
    }

    public String getLOGLUBY() {
        return lOGLUBY;
    }

    public void setLOGLUBY(String lOGLUBY) {
        this.lOGLUBY = lOGLUBY;
    }

}
