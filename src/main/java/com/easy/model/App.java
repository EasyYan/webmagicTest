package com.easy.model;

public class App {
    String name;
    String type;
    String app_id;
    Domain domain;

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", app_id='" + app_id + '\'' +
                ", domain=" + domain +
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

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }
}
