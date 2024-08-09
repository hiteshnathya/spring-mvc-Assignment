package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PolicyAdminApplication {
    @Bean
    public PolicyDAO policyDAO() {
        return new PolicyDAOImpl();
    }

    @Bean
    public PolicyService policyService() {
        return new PolicyServiceImpl(policyDAO());
    }

    public static void main(String[] args) {
        SpringApplication.run(PolicyAdminApplication.class, args);
    }

}