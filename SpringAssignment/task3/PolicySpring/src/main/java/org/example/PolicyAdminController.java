package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.security.Policy;

@Controller
public class PolicyAdminController {

    private final PolicyService policyService;

    @Autowired
    public PolicyAdminController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("policies", policyService.getAllPolicies());
        return "index";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute Policy policy) {
        policyService.createPolicy(policy);
        return "redirect:/";
    }
}