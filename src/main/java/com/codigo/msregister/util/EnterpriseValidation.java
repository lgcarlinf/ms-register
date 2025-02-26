package com.codigo.msregister.util;

import com.codigo.msregister.aggregates.enums.ETypeDocument;
import com.codigo.msregister.aggregates.request.RequestEnterprise;
import com.codigo.msregister.constants.Constants;
import org.springframework.stereotype.Component;

@Component
public class EnterpriseValidation {
    public boolean validateInput(RequestEnterprise requestEnterprise) {
        if(requestEnterprise == null){
            return false;
        }
        if(ETypeDocument.RUC.getValue() != requestEnterprise.getDocumentTypeEntity() ||requestEnterprise.getNumberDocument().length() != Constants.LENGTH_RUC){
            return false;
        }
        if(isNullOrEmpty(requestEnterprise.getBusinessName()) || isNullOrEmpty(requestEnterprise.getNumberDocument())){
            return false;
        }
        return true;
    }

    public boolean isNullOrEmpty(String value){
        return value == null || value.isEmpty();
    }
}
