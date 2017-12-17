package com.easy.helper;

import com.easy.model.Recode;

public class RecodeHelper {
    public static Recode string2Object(String recode) {
        Recode recodeObj=new Recode();
        recodeObj.setProvider("PCM");
        recodeObj.setpComponent("SHP_PCM_DomainEventReceiver");
        recodeObj.setConsumer("SHP");
        recodeObj.setcConsumer("SHP_PostSaveProcess");
        recodeObj.setServiceType("WS - RESTful");
        recodeObj.setServiceName("get_ob_shp_cmscontext_v2");
        recodeObj.setMethodName("");
        recodeObj.setDestination("");
        recodeObj.setUpdateBy("lanle");
        recodeObj.setRelatedFunctionDescription("For OB shipment follow up task context");
        recodeObj.setRemark("");
        recodeObj.setSchema("");
        recodeObj.setOperation("");
        return recodeObj;
    }
}
