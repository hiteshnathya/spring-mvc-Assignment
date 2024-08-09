package org.example;
import org.springframework.stereotype.Repository;

import java.security.Policy;
import java.util.ArrayList;
import java.util.List;
@Repository
public class PolicyDAO {
    private List<Policy> policies;

    public PolicyDAO() {
        this.policies = new ArrayList<>();
    }

    public List<Policy> getAllPolicies() {
        return policies;
    }

    public Policy getPolicyById(Long id) {
        for (Policy policy : policies) {
            if (policy.getType().equals(id)) {
                return policy;
            }
        }
        return null;
    }

    public void savePolicy(Policy policy) {
        policies.add(policy);
    }

    public void updatePolicy(Policy policy) {
        for (int i = 0; i < policies.size(); i++) {
            if (policies.get(i).getType().equals(policy.getType())) {
                policies.set(i, policy);
                return;
            }
        }
    }

    public void deletePolicy(Long id) {
        policies.removeIf(policy -> policy.getType().equals(id));
    }
}