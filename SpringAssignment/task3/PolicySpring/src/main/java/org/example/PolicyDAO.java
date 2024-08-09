package org.example;

import org.springframework.stereotype.Repository;

import java.security.Policy;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PolicyDAO {

    private List<Policy> policies = new ArrayList<>();

    public List<Policy> getAllPolicies() {
        return policies;
    }

    public void createPolicy(Policy policy) {
        policies.add(policy);
    }
}