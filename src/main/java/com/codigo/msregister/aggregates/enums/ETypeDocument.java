package com.codigo.msregister.aggregates.enums;

import lombok.Getter;

@Getter
public enum ETypeDocument {
    DNI(01),
    RUC(02);

    private final int value;

    ETypeDocument(int value){
        this.value = value;
    }
}
