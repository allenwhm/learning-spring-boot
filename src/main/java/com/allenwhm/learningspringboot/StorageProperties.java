package com.allenwhm.learningspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author allenwhm
 * @date 2018/4/4 23:28
 * @description
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
