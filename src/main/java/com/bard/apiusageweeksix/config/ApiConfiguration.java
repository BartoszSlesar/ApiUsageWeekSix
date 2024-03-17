package com.bard.apiusageweeksix.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties("wizard")
@Configuration
@Getter
@Setter
public class ApiConfiguration {
    private String spellApiUrl;

}
