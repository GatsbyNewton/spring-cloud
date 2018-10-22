package edu.wzm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientEurekaApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ConfigClientEurekaApplication.class, args);
    }
}
