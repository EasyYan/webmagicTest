package com.easy.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = DIInfoDeserializer.class)
public class DIInfo {
    String _id;
    String name;
    BuildInfo build;
    List<ClientApp> clientApps;
    List<ClientDomain> clientDomains;
    List<ConsumedService> consumedServices;
    List<ProvidedService> providedServices;
    List<App> apps;
    String _v;

    public DIInfo(String _id, String name, BuildInfo build, List<ClientApp> clientApps, List<ClientDomain> clientDomains, List<ConsumedService> consumedServices, List<ProvidedService> providedServices, List<App> apps, String _v) {
        this._id = _id;
        this.name = name;
        this.build = build;
        this.clientApps = clientApps;
        this.clientDomains = clientDomains;
        this.consumedServices = consumedServices;
        this.providedServices = providedServices;
        this.apps = apps;
        this._v = _v;
    }

    @Override
    public String toString() {
        return "DIInfo{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", build=" + build +
                ", clientApps=" + clientApps +
                ", clienDomains=" + clientDomains +
                ", consumedServices=" + consumedServices +
                ", providedServices=" + providedServices +
                ", apps=" + apps +
                ", _v='" + _v + '\'' +
                '}';
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BuildInfo getBuild() {
        return build;
    }

    public void setBuild(BuildInfo build) {
        this.build = build;
    }

    public List<ClientApp> getClientApps() {
        return clientApps;
    }

    public void setClientApps(List<ClientApp> clientApps) {
        this.clientApps = clientApps;
    }

    public List<ClientDomain> getClientDomains() {
        return clientDomains;
    }

    public void setClientDomains(List<ClientDomain> clientDomains) {
        this.clientDomains = clientDomains;
    }

    public List<ConsumedService> getConsumedServices() {
        return consumedServices;
    }

    public void setConsumedServices(List<ConsumedService> consumedServices) {
        this.consumedServices = consumedServices;
    }

    public List<ProvidedService> getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(List<ProvidedService> providedServices) {
        this.providedServices = providedServices;
    }

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }

    public String get_v() {
        return _v;
    }

    public void set_v(String _v) {
        this._v = _v;
    }
}
