package com.easy.model;

public class BuildInfo {
    String startTime;
    String endTime;
    String release;
    String build_id;

    public BuildInfo(String startTime, String endTime, String release, String build_id) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.release = release;
        this.build_id = build_id;
    }

    @Override
    public String toString() {
        return "BuildInfo{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", release='" + release + '\'' +
                ", build_id='" + build_id + '\'' +
                '}';
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getBuild_id() {
        return build_id;
    }

    public void setBuild_id(String build_id) {
        this.build_id = build_id;
    }
}
