package com.easy.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DIInfoDeserializer extends JsonDeserializer {
    @Override
    public List<DIInfo> deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        List<DIInfo> list = new ArrayList<>();
        TreeNode treeNode=jp.getCodec().readTree(jp);
        int count=treeNode.size();
        for (int i = 0; i < count; i++) {
            JsonNode node = (JsonNode) treeNode.get(i);

            String id = node.get("_id").asText();
            String name = node.get("name").asText();
            String _v = node.get("__v").asText();

            String startTime = node.get("build").get("startTime").asText();
            String endTime = node.get("build").get("endTime").asText();
            String release = node.get("build").get("release").asText();
            String build_id = node.get("build").get("build_id").asText();
            BuildInfo build = new BuildInfo(startTime, endTime, release, build_id);
            List<ClientApp> clientApps = new ArrayList<>();
            for (JsonNode jsonNode : node.get("clientApps")) {
                ClientApp app = new ClientApp();
                app.setName(jsonNode.get("name").asText());
                app.setApp_id(jsonNode.get("app_id").asText());
                app.setType(jsonNode.get("type").asText());
                Domain domain = new Domain();
                domain.setName(jsonNode.get("domain").get("name").asText());
                domain.setDomain_id(jsonNode.get("domain").get("domain_id").asText());
                app.setDomain(domain);
                clientApps.add(app);
            }

            List<ClientDomain> clientDomains = new ArrayList<>();
            for (JsonNode jsonNode : node.get("clientDomains")) {
                ClientDomain domain = new ClientDomain();
                domain.setName(jsonNode.get("name").asText());
                domain.setDomain_id(jsonNode.get("domain_id").asText());
                clientDomains.add(domain);
            }

            List<App> apps = new ArrayList<>();
            for (JsonNode jsonNode : node.get("providedServices")) {
                App app = new App();
                app.setName(jsonNode.get("app").get("name").asText());
                app.setApp_id(jsonNode.get("app").get("app_id").asText());
                app.setType(jsonNode.get("app").get("type").asText());
                apps.add(app);
            }

            List<ConsumedService> consumedServices = new ArrayList<>();
            for (JsonNode jsonNode : node.get("consumedServices")) {
                ConsumedService service = new ConsumedService();
                service.setName(jsonNode.get("name").asText());
                service.setService_id(jsonNode.get("service_id").asText());
                service.setType(jsonNode.get("type").asText());
                service.setBuiltFromCunsumerRequestUrl(jsonNode.get("builtFromConsumerRequestUrl").asBoolean());
                if (jsonNode.get("app").size() != 0) {
                    App app = new App();
                    app.setName(jsonNode.get("app").get("name").asText());
                    app.setApp_id(jsonNode.get("app").get("app_id").asText());
                    app.setType(jsonNode.get("app").get("type").asText());
                    if (jsonNode.get("app").get("domain").size() != 0) {
                        Domain domain = new Domain();
                        domain.setName(jsonNode.get("app").get("domain").get("name").asText());
                        domain.setDomain_id(jsonNode.get("app").get("domain").get("domain_id").asText());
                        app.setDomain(domain);
                    }
                    service.setApp(app);
                }

                consumedServices.add(service);
            }

            List<ProvidedService> providedServices = new ArrayList<>();
            for (JsonNode jsonNode : node.get("providedServices")) {
                ProvidedService service = new ProvidedService();
                service.setName(jsonNode.get("name").asText());
                service.setService_id(jsonNode.get("service_id").asText());
                service.setType(jsonNode.get("type").asText());
                service.setBuiltFromConsumerRequestUrl(jsonNode.get("builtFromConsumerRequestUrl").asBoolean());
                if (jsonNode.get("app").size() != 0) {
                    App app = new App();
                    app.setName(jsonNode.get("app").get("name").asText());
                    app.setApp_id(jsonNode.get("app").get("app_id").asText());
                    app.setType(jsonNode.get("app").get("type").asText());
                    service.setApp(app);
                }

                providedServices.add(service);
            }

            list.add(new DIInfo(id, name, build, clientApps, clientDomains, consumedServices, providedServices, apps, _v));
        }

        return list;
    }
}
