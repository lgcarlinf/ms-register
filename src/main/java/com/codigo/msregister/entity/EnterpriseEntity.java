package com.codigo.msregister.entity;

import com.codigo.msregister.entity.EnterpriseTypeEntity;
import com.codigo.msregister.aggregates.model.Audit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "enterprise")
public class EnterpriseEntity extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enterprise")
    private int idEnterprise;
    @Column(name = "number_document", length = 15, nullable = false)
    private String numberDocument;
    @Column(name = "business_name", length= 150, nullable = false)
    private String businessName;
    @Column(name = "trade_name",length= 150)
    private String tradeName;
    @Column(name = "status", nullable = false)
    private int status;

    @ManyToOne
    @JoinColumn(name="enterprise_type_id_enterprise_type",nullable = false)
    private EnterpriseTypeEntity enterpriseTypeEntity;

    @ManyToOne
    @JoinColumn(name="document_type_id_document_type",nullable = false)
    private DocumentTypeEntity documentTypeEntity;

}
