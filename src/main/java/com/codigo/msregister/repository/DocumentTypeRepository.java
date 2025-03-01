package com.codigo.msregister.repository;

import com.codigo.msregister.entity.DocumentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface DocumentTypeRepository extends JpaRepository<DocumentTypeEntity, Integer> {
    DocumentTypeEntity findByCodType(@Param("codeType") String codeType);

}
