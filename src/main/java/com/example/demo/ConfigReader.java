package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigReader {
    @Autowired
    private Settings settings;
    
    public String getRegion(){
        return settings.getRegion();
    }
    
    public String getBucket(){
        Map<String, String> map = settings.getS3();
        return map.get("bucket");
    }
    
    public String getFile(){
        Map<String, String> map = settings.getS3();
        return map.get("file");
    }
}
