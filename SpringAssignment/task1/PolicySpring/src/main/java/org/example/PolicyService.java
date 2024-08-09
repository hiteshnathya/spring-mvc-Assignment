package org.example;

import java.util.List;

public interface PolicyService {
    List<Policy> getAllPolicies();
    Policy getPolicyById(Long id);
    void savePolicy(Policy policy);
    void updatePolicy(Policy policy);
    void deletePolicy(Long id);
}