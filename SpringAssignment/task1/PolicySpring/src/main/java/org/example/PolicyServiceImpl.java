package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {
    private final PolicyDAO policyDAO;

    @Autowired
    public PolicyServiceImpl(PolicyDAO policyDAO) {
        this.policyDAO = policyDAO;
    }

    @Override
    public List<Policy> getAllPolicies() {
        return policyDAO.getAllPolicies();
    }

    @Override
    public Policy getPolicyById(Long id) {
        return policyDAO.getPolicyById(id);
    }

    @Override
    public void savePolicy(Policy policy) {
        policyDAO.savePolicy(policy);
    }

    @Override
    public void updatePolicy(Policy policy) {
        policyDAO.updatePolicy(policy);
    }

    @Override
    public void deletePolicy(Long id){

    }
}