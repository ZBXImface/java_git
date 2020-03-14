package com.gree.common.utilis;
public class JsonBase {
    private Integer returnCode;
    private String returnMsg;
    private Object object;
    void JsonBase(Integer returnCode,String returnMsg,Object object){
        this.returnCode=returnCode;
        this.returnMsg=returnMsg;
        this.object=object;
    };

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
