package org.example;

import org.example.PolicyDAO;

import java.util.ArrayList;
import java.util.List;

public class PolicyDAOImpl implements PolicyDAO {
    private List<Policy> policies = new ArrayList<>();

    @Override
    public List<Policy> getAllPolicies() {
        return policies;
    }

    @Override
    public Policy getPolicyById(Long id) {
        for (Policy policy : policies) {
            if (policy.getId().equals(id)) {
                return policy;
            }
        }
        return null;
    }

    @Override
    public void savePolicy(Policy policy) {
        policies.add(policy);
    }

    @Override
    public void updatePolicy(Policy policy) {
        for (int i = 0; i < policies.size(); i++) {
            if (policies.get(i).getId().equals(policy.getId())) {
                policies.set(i, policy);
                return;
            }
        }
    }

    @Override
    public void deletePolicy(Long id) {
        policies.removeIf(policy -> policy.getId().equals(id));
    }
}