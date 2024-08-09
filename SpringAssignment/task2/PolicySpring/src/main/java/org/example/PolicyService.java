package org.example;

import org.springframework.stereotype.Service;

import java.security.Policy;
import java.util.List;
@Service
public class PolicyService {

    private PolicyDAO policyDAO;

    public PolicyService(PolicyDAO policyDAO) {
        this.policyDAO = policyDAO;
    }

    public List<Policy> getAllPolicies() {
        return policyDAO.getAllPolicies();
    }

    public Policy getPolicyById(Long id) {
        return policyDAO.getPolicyById(id);
    }

    public void savePolicy(Policy policy) {
        policyDAO.savePolicy(policy);
    }

    public void updatePolicy(Policy policy) {
        policyDAO.updatePolicy(policy);
    }

    public void deletePolicy(Long id) {
        policyDAO.deletePolicy(id);
    }
}