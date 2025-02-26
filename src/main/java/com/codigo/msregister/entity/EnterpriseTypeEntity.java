package com.codigo.msregister.entity;

import com.codigo.msregister.aggregates.model.Audit;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "enterprise_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnterpriseTypeEntity extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enterprise_type")
    private int idEnterpriseType;
    @Column(name = "code_type", length = 45, nullable = false)
    private String codeType;
    @Column(name = "discount_type", length = 150, nullable = false)
    private String discountType;
    @Column(name = "status", nullable = false)
    private int status;

}
