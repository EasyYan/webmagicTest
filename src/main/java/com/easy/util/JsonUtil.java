package com.easy.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.easy.model.DIInfo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    public static void jsonToList() throws IOException {
        StringBuilder str=new StringBuilder("{\"_id\":\"5a2e333ff5e314f8224a947c\",\"name\":\"iris4_shp\",\n" +
                "\"build\":{\"startTime\":\"2017-12-11T04:12:55.850Z\",\"endTime\":\"2017-12-11T07:26:55.334Z\",\"release\":\"IRIS4_R23.5\",\"build_id\":\"5a2e05c7f5e314f8224a9453\"},\n" +
                "\"clientApps\":[{\"name\":\"WLS_PRS_BER\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a9530\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}},\n" +
                "{\"name\":\"WLS_PRS_BKG\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a9531\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}},\n" +
                "{\"name\":\"DND_WF_Proc\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a94c8\",\"domain\":{\"name\":\"iris4_dnd\",\"domain_id\":\"5a2e333ff5e314f8224a9464\"}},\n" +
                "{\"name\":\"SHP_PCM_DomainEventReceiver\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a953f\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}},\n" +
                "{\"name\":\"WLS_DOM_ARP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a9494\",\"domain\":{\"name\":\"iris4_arp\",\"domain_id\":\"5a2e333ff5e314f8224a9455\"}},\n" +
                "{\"name\":\"WLS_DOM_ARPJOB\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a9496\",\"domain\":{\"name\":\"iris4_arp\",\"domain_id\":\"5a2e333ff5e314f8224a9455\"}},\n" +
                "{\"name\":\"WLS_PRS_DOC\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a94cb\",\"domain\":{\"name\":\"iris4_docu\",\"domain_id\":\"5a2e333ff5e314f8224a9466\"}},\n" +
                "{\"name\":\"SHP_BatchProcess\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a9537\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}},{\"name\":\"BRH_BatchRequest\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a94a5\",\"domain\":{\"name\":\"iris4_brh\",\"domain_id\":\"5a2e333ff5e314f8224a945a\"}},{\"name\":\"BRH_BatchRequestUnit\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a94a6\",\"domain\":{\"name\":\"iris4_brh\",\"domain_id\":\"5a2e333ff5e314f8224a945a\"}}],\n" +
                "\"clientDomains\":[{\"name\":\"iris4_tnm\",\"domain_id\":\"5a2e333ff5e314f8224a9480\"},{\"name\":\"iris4_bac\",\"domain_id\":\"5a2e333ff5e314f8224a9458\"},{\"name\":\"iris4_brh\",\"domain_id\":\"5a2e333ff5e314f8224a945a\"}],\n" +
                "\"consumedServices\":[{\"name\":\"LWTerminalFileContainerResource\",\"type\":\"rest\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a99d3\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}}},{\"name\":\"DndDataResource\",\"type\":\"rest\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9969\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}}},{\"name\":\"LWEmptyEventAppmtInfoRestfulResource\",\"type\":\"rest\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a99ba\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}}},{\"name\":\"LWRolloverNominationRestfulResource\",\"type\":\"rest\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a99c0\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}}},{\"name\":\"LWShipmentFolderDocumentsRestfulResource\",\"type\":\"rest\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a99c7\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}}},{\"name\":\"LWCheckPointRequiredLegalDocRestfulResource\",\"type\":\"rest\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a99b5\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}}},{\"name\":\"LWRoutePointProxyResource\",\"type\":\"rest\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a99c2\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}}},{\"name\":\"LWPendingReasonsRestfulResource\",\"type\":\"rest\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a99be\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\",\"domain\":{\"name\":\"iris4_shp\",\"domain_id\":\"5a2e333ff5e314f8224a947c\"}}}],\n" +
                "\"providedServices\":[{\"name\":\"NominateTriangulationSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a19\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"NumGenSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a1a\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"GetRateDateSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a1b\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"ShipmentSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a1c\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"ShipmentLabelSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a1d\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"ShpCalculatorSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a1e\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"SRFeedbackSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a1f\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"UpdateShipmentSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a20\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"UpdateVerifiedGrossMassSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":false,\"service_id\":\"5a2e333ff5e314f8224a9a21\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"ShipmentValidationSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":true,\"service_id\":\"5a2e333ff5e314f8224a9bb1\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}},{\"name\":\"BatchRequestUnitHandlerSVC\",\"type\":\"soap\",\"builtFromConsumerRequestUrl\":true,\"service_id\":\"5a2e333ff5e314f8224a9bb8\",\"app\":{\"name\":\"WLS_DOM_SHP\",\"type\":\"wls\",\"app_id\":\"5a2e333ff5e314f8224a952d\"}}],\n" +
                "\"apps\":[{\"name\":\"SHP_EQP_Notifications\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a953a\"},{\"name\":\"SHP_ExternalShp_Notification\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a953b\"},{\"name\":\"SHP_LBL_Generator\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a953c\"},{\"name\":\"SHP_MOC_DSHTransformer\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a953d\"},{\"name\":\"SHP_PCM_AlertRequestor\",\"type\":\"bw\",\"app_id\":\"5a2e333ff5e314f8224a953e\"}],\"__v\":0}");


        StringBuilder stringBuilder=new StringBuilder(txt2String(new File("I:/test.txt")));
        ObjectMapper mapper = new ObjectMapper();

        List<DIInfo> dIInfos= (List<DIInfo>) mapper.readValue(stringBuilder.toString(),DIInfo.class);
//        List<DIInfo> dIInfos=JSONArray.parseArray(stringBuilder.toString(),DIInfo.class);
        for (DIInfo info:dIInfos) {
            System.out.println(info);

        }

//        DIInfo diInfo = JSONObject.parseObject(str.toString(),DIInfo.class);
    }

    public static void main(String arg[]) throws IOException {
        JsonUtil.jsonToList();
    }

    public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
}
