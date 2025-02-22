package com.codigo.msregister.entity;

import com.codigo.msregister.aggregates.model.Audit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "person")
public class PersonEntity  extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private int idPerson;
    @Column(name = "number_document", length = 15, nullable = false)
    private String numberDocument;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "lastName", length = 100, nullable = false)
    private String lastName;
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    @Column(name = "telephone", length = 15, nullable = false)
    private String telephone;
    @Column(name = "status", nullable = false)
    private int status;

    @ManyToOne
    @JoinColumn(name="document_type_id_document_type",nullable = false)
    private DocumentTypeEntity documentTypeEntity;

    @ManyToOne
    @JoinColumn(name="enterprise_id_enterprise",nullable = false)
    private EnterpriseEntity enterpriseEntity;



}
