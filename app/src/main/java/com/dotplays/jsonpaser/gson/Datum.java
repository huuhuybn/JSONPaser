
package com.dotplays.jsonpaser.gson;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("USERCODE")
    @Expose
    private String uSERCODE;
    @SerializedName("CCCODE")
    @Expose
    private Object cCCODE;
    @SerializedName("STAFFNO")
    @Expose
    private Object sTAFFNO;
    @SerializedName("USERNAME")
    @Expose
    private String uSERNAME;
    @SerializedName("USERPASSWORD")
    @Expose
    private Object uSERPASSWORD;
    @SerializedName("PHONENO")
    @Expose
    private Object pHONENO;
    @SerializedName("FLAGSYSADMIN")
    @Expose
    private String fLAGSYSADMIN;
    @SerializedName("FLAGACTIVE")
    @Expose
    private String fLAGACTIVE;
    @SerializedName("LOGLUDTIME")
    @Expose
    private Object lOGLUDTIME;
    @SerializedName("LOGLUBY")
    @Expose
    private Object lOGLUBY;
    @SerializedName("STATUS")
    @Expose
    private Object sTATUS;
    @SerializedName("SessionId")
    @Expose
    private String sessionId;
    @SerializedName("ListAccess")
    @Expose
    private List<ListAccess> listAccess = null;
    @SerializedName("Roles")
    @Expose
    private Object roles;

    public String getUSERCODE() {
        return uSERCODE;
    }

    public void setUSERCODE(String uSERCODE) {
        this.uSERCODE = uSERCODE;
    }

    public Object getCCCODE() {
        return cCCODE;
    }

    public void setCCCODE(Object cCCODE) {
        this.cCCODE = cCCODE;
    }

    public Object getSTAFFNO() {
        return sTAFFNO;
    }

    public void setSTAFFNO(Object sTAFFNO) {
        this.sTAFFNO = sTAFFNO;
    }

    public String getUSERNAME() {
        return uSERNAME;
    }

    public void setUSERNAME(String uSERNAME) {
        this.uSERNAME = uSERNAME;
    }

    public Object getUSERPASSWORD() {
        return uSERPASSWORD;
    }

    public void setUSERPASSWORD(Object uSERPASSWORD) {
        this.uSERPASSWORD = uSERPASSWORD;
    }

    public Object getPHONENO() {
        return pHONENO;
    }

    public void setPHONENO(Object pHONENO) {
        this.pHONENO = pHONENO;
    }

    public String getFLAGSYSADMIN() {
        return fLAGSYSADMIN;
    }

    public void setFLAGSYSADMIN(String fLAGSYSADMIN) {
        this.fLAGSYSADMIN = fLAGSYSADMIN;
    }

    public String getFLAGACTIVE() {
        return fLAGACTIVE;
    }

    public void setFLAGACTIVE(String fLAGACTIVE) {
        this.fLAGACTIVE = fLAGACTIVE;
    }

    public Object getLOGLUDTIME() {
        return lOGLUDTIME;
    }

    public void setLOGLUDTIME(Object lOGLUDTIME) {
        this.lOGLUDTIME = lOGLUDTIME;
    }

    public Object getLOGLUBY() {
        return lOGLUBY;
    }

    public void setLOGLUBY(Object lOGLUBY) {
        this.lOGLUBY = lOGLUBY;
    }

    public Object getSTATUS() {
        return sTATUS;
    }

    public void setSTATUS(Object sTATUS) {
        this.sTATUS = sTATUS;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public List<ListAccess> getListAccess() {
        return listAccess;
    }

    public void setListAccess(List<ListAccess> listAccess) {
        this.listAccess = listAccess;
    }

    public Object getRoles() {
        return roles;
    }

    public void setRoles(Object roles) {
        this.roles = roles;
    }

}
