package com.codigo.msregister.entity;

import com.codigo.msregister.aggregates.model.Audit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DocumentTypeEntity extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDocumentType;
    private String codeType;
    private String description;
    private int status;
}

