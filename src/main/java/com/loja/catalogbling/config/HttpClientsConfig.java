package com.loja.catalogbling.config;

import com.loja.catalogbling.ia.infrastructure.IaHttp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class HttpClientsConfig {

    @Bean
    public RestClient restClient() {
        return IaHttp.clientePadrao();
    }
}
