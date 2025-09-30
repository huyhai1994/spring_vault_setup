package spring.learning.spring_vault.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultDemoController {

    @Value("${example.password}")
    private String dbPassword;

    @GetMapping("/secrets")
    public String getSecrets() {
        return "| DB Password: " + dbPassword;
    }
}
