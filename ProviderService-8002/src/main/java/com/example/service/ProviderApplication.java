package com.example.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
public class ProviderApplication
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(ProviderApplication.class).web(true).run(args);
    }
}
