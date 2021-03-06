package com.pqsoft.task.api.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.pqsoft.*")
@ComponentScan(basePackages = {"com.pqsoft.*"})
@EntityScan("com.pqsoft.*")
public class PersistentConfig {
}
