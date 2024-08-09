package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Policy;
import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyAdminController {
    private final PolicyService policyService;

    @Autowired
    public PolicyAdminController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyService.getAllPolicies();
    }

    @GetMapping("/{id}")
    public Policy getPolicyById(@PathVariable Long id) {
        return policyService.getPolicyById(id);
    }

    @PostMapping
    public void savePolicy(@RequestBody Policy policy) {
        policyService.savePolicy(policy);
    }

    @PutMapping("/{id}")
    public void updatePolicy(@PathVariable Long id, @RequestBody Policy policy) {
        policyService.updatePolicy(policy);
    }

    @DeleteMapping("/{id}")
    public void deletePolicy(@PathVariable Long id) {
        policyService.deletePolicy(id);
    }
}