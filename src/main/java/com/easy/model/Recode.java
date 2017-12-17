package com.easy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Recode {
    @Id
    @Column(name = "recode_id")
    private String uuid;
    @Column(name = "provider")
    private String provider;
    @Column(name = "p_component")
    private String pComponent;
    @Column(name = "consumer")
    private String consumer;
    @Column(name = "c_consumer")
    private String cConsumer;
    @Column(name = "service_type")
    private String serviceType;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "method_name")
    private String methodName;
    @Column(name = "destination")
    private String destination;
    @Column(name = "update_by")
    private String updateBy;
    @Column(name = "related_function_description")
    private String relatedFunctionDescription;
    @Column(name = "remark")
    private String remark;
    @Column(name = "schema")
    private String schema;
    @Column(name = "operation")
    private String operation;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getpComponent() {
        return pComponent;
    }

    public void setpComponent(String pComponent) {
        this.pComponent = pComponent;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getcConsumer() {
        return cConsumer;
    }

    public void setcConsumer(String cConsumer) {
        this.cConsumer = cConsumer;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getRelatedFunctionDescription() {
        return relatedFunctionDescription;
    }

    public void setRelatedFunctionDescription(String relatedFunctionDescription) {
        this.relatedFunctionDescription = relatedFunctionDescription;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
