package com.codigo.msregister.service.impl;

import com.codigo.msregister.aggregates.request.RequestPerson;
import com.codigo.msregister.aggregates.response.ResponseBase;
import com.codigo.msregister.entity.EnterpriseEntity;
import com.codigo.msregister.entity.PersonEntity;
import com.codigo.msregister.repository.PersonRepository;
import com.codigo.msregister.service.PersonService;
import com.codigo.msregister.util.PersonValidation;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    private final PersonValidation personValidation;

    public PersonServiceImpl(PersonRepository personRepository, PersonValidation personValidation) {
        this.personRepository = personRepository;
        this.personValidation = personValidation;
    }

    @Override
    public ResponseBase getInfoReniec(String numero) {
        return null;
    }

    @Override
    public ResponseBase createPersons(RequestPerson requestPerson) {
        return null;
    }

    @Override
    public ResponseBase findOne(int id) {
        return null;
    }

    @Override
    public ResponseBase findAll() {
        return null;
    }

    @Override
    public ResponseBase updatePersons(int id, RequestPerson requestPerson) {
        boolean existPerson = personRepository.existsById(id);
        if(existPerson){
          Optional<EnterpriseEntity> enterpriseEntity = personRepository.findById(id);
          boolean validateInput = personValidation.validateInput(requestPerson);
            if(validateInput){
              
            }
        }

        return null;
    }
}
