package com.easy.model;

public class Domain {
    String name;
    String domain_id;

    @Override
    public String toString() {
        return "Domain{" +
                "name='" + name + '\'' +
                ", domain_id='" + domain_id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(String domain_id) {
        this.domain_id = domain_id;
    }
}
