package com.codigo.msregister.aggregates.enums;

import lombok.Getter;

@Getter
public enum ETypeDocument {
    DNI(1),
    RUC(2);

    private final int value;

    ETypeDocument(int value){
        this.value = value;
    }
}
