package org.example;

import java.security.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    private final PolicyDAO policyDAO;

    @Autowired
    public PolicyService(PolicyDAO policyDAO) {
        this.policyDAO = policyDAO;
    }

    public List<java.security.Policy> getAllPolicies() {
        return policyDAO.getAllPolicies();
    }

    public void createPolicy(Policy policy) {
        policyDAO.createPolicy(policy);
    }


}