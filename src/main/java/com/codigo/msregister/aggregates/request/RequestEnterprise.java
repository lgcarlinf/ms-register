package com.codigo.msregister.aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestEnterprise {
    private String numberDocument;
    private String businessName;
    private String tradeName;
    private int enterpriseTypeEntity;
    private int documentTypeEntity;
}
