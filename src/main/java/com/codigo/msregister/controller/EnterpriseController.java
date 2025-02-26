package com.codigo.msregister.controller;

import com.codigo.msregister.aggregates.request.RequestEnterprise;
import com.codigo.msregister.aggregates.response.ResponseBase;
import com.codigo.msregister.service.EnterpriseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/enterprise")
public class EnterpriseController {
    private final EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @PostMapping
    public ResponseBase createEnterprise(@RequestBody RequestEnterprise requestEnterprise) {

        return enterpriseService.createEnterprise(requestEnterprise);
    }
}
