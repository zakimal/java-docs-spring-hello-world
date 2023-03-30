package com.example.demo;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "settings")
public class Settings {
    private String region;
    private Map<String, String> s3;
    
    public void setRegion(String region){
        this.region = region;
    }
    
    public String getRegion(){
        return region;
    }
    
    public void setS3(Map<String, String> s3){
        this.s3 = s3;
    }
    
    public Map<String, String> getS3(){
        return s3;
    }
}
