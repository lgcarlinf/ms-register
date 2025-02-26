package com.codigo.msregister.service;

import com.codigo.msregister.aggregates.request.RequestEnterprise;
import com.codigo.msregister.aggregates.response.ResponseBase;

public interface EnterpriseService {

    ResponseBase createEnterprise(RequestEnterprise requestEnterprise);
    ResponseBase findOneEnterprise(Integer id);
    ResponseBase findAllEnterprise();
    ResponseBase updateEnterprise(Integer id, RequestEnterprise requestEnterprise);

}
