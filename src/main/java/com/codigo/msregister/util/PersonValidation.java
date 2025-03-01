package com.codigo.msregister.util;

import com.codigo.msregister.aggregates.request.RequestPerson;
import com.codigo.msregister.constants.Constants;
import com.codigo.msregister.entity.DocumentTypeEntity;
import com.codigo.msregister.repository.DocumentTypeRepository;
import com.codigo.msregister.repository.EnterpriseRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class PersonValidation {

    private final DocumentTypeRepository typeRepository;
    private final EnterpriseRepository enterpriseRepository;

    public PersonValidation(DocumentTypeRepository typeRepository, EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
        this.typeRepository = typeRepository;
    }

    public boolean validateInput(RequestPerson requestPerson){
        if (requestPerson == null) {
            return false;
        }

        DocumentTypeEntity documentType = typeRepository.findByCodType("01");
        if (requestPerson.getDocument_type_id_document_type() != Integer.valueOf(documentType.getCodeType())
                || requestPerson.getNumberDocument().length() != Constants.LENGTH_DNI) {
            return false;
        }

        if (isNullOrEmpty(requestPerson.getEmail()) || isNullOrEmpty(requestPerson.getNumberDocument())
                || isNullOrEmpty(requestPerson.getTelephone())) {
            return false;
        }

        return enterpriseRepository.existsById(requestPerson.getEnterprise_id_enterprise());

    }

    public boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

}
