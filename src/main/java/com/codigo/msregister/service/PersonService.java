package com.codigo.msregister.service;

import com.codigo.msregister.aggregates.request.RequestPerson;
import com.codigo.msregister.aggregates.response.ResponseBase;

public interface PersonService {
    ResponseBase getInfoReniec(String numero);
    ResponseBase createPersons(RequestPerson requestPersons);
    ResponseBase findOne(int id);
    ResponseBase findAll();
    ResponseBase updatePersons(int id, RequestPerson requestPersons);
}
