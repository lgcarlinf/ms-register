package com.codigo.msregister.aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestPerson {
    private String numberDocument;
    private String email;
    private String telephone;
    private int document_type_id_document_type;
    private int enterprise_id_enterprise;
}
