package com.easy.model;

public class ProvidedService {
    String name;
    String type;
    Boolean builtFromConsumerRequestUrl;
    String service_id;
    App app;

    @Override
    public String toString() {
        return "ProvidedService{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", builtFromConsumerRequestUrl=" + builtFromConsumerRequestUrl +
                ", service_id='" + service_id + '\'' +
                ", app=" + app +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getBuiltFromConsumerRequestUrl() {
        return builtFromConsumerRequestUrl;
    }

    public void setBuiltFromConsumerRequestUrl(Boolean builtFromConsumerRequestUrl) {
        this.builtFromConsumerRequestUrl = builtFromConsumerRequestUrl;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
