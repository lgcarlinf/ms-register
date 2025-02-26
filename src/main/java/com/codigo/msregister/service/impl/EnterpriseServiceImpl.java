package com.codigo.msregister.service.impl;

import com.codigo.msregister.aggregates.request.RequestEnterprise;
import com.codigo.msregister.aggregates.response.ResponseBase;
import com.codigo.msregister.constants.Constants;
import com.codigo.msregister.entity.DocumentTypeEntity;
import com.codigo.msregister.entity.EnterpriseEntity;
import com.codigo.msregister.entity.EnterpriseTypeEntity;
import com.codigo.msregister.repository.EnterpriseRepository;
import com.codigo.msregister.service.EnterpriseService;
import com.codigo.msregister.util.EnterpriseValidation;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    private final EnterpriseRepository enterpriseRepository;
    private final EnterpriseValidation enterpriseValidation;

    public EnterpriseServiceImpl(EnterpriseRepository enterpriseRepository, EnterpriseValidation enterpriseValidation) {
        this.enterpriseRepository = enterpriseRepository;
        this.enterpriseValidation = enterpriseValidation;
    }

    @Override
    public ResponseBase createEnterprise(RequestEnterprise requestEnterprise) {
        boolean validate = enterpriseValidation.validateInput(requestEnterprise);

        if(validate){
            EnterpriseEntity enterpriseEntity = getEntity(requestEnterprise);
            enterpriseRepository.save(enterpriseEntity);
            List<EnterpriseEntity> generic = new ArrayList<>();
            generic.add(enterpriseEntity);
            return new ResponseBase(Constants.CODE_SUCCESS, Constants.MESSAGE_SUCCESS, generic);
        }

        return new ResponseBase(Constants.CODE_ERROR, Constants.MESSAGE_ERROR, null);
    }

    @Override
    public ResponseBase findOneEnterprise(Integer id) {
        return null;
    }

    @Override
    public ResponseBase findAllEnterprise() {
        return null;
    }

    @Override
    public ResponseBase updateEnterprise(Integer id, RequestEnterprise requestEnterprise) {
        return null;
    }


    private EnterpriseEntity getEntity(RequestEnterprise requestEnterprise){
        EnterpriseEntity enterpriseEntity = new EnterpriseEntity();
        enterpriseEntity.setNumberDocument(requestEnterprise.getNumberDocument());
        enterpriseEntity.setBusinessName(requestEnterprise.getBusinessName());
        enterpriseEntity.setTradeName(enterpriseValidation.isNullOrEmpty(requestEnterprise.getTradeName()) ? requestEnterprise.getBusinessName() : requestEnterprise.getTradeName());
        enterpriseEntity.setStatus(Constants.STATUS_ACTIVE);

        EnterpriseTypeEntity enterpriseTypeEntity = new EnterpriseTypeEntity();
        enterpriseTypeEntity.setIdEnterpriseType(requestEnterprise.getEnterpriseTypeEntity());
        enterpriseEntity.setEnterpriseTypeEntity(enterpriseTypeEntity);

        DocumentTypeEntity documentTypeEntity = new DocumentTypeEntity();
        documentTypeEntity.setIdDocumentType(requestEnterprise.getDocumentTypeEntity());
        enterpriseEntity.setDocumentTypeEntity(documentTypeEntity);

        long currentTime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(currentTime);
        enterpriseEntity.setUserCreate(timestamp);
        return null;
    }
}
