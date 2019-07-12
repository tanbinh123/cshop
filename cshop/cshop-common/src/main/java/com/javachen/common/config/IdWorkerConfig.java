package com.javachen.common.config;

import com.javachen.common.util.IdWorker;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "cshop.worker")
public class IdWorkerConfig {
    private long workerId;
    private long dataCenterId;

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(workerId, dataCenterId);
    }
}
