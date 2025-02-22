package com.codigo.msregister.aggregates.model;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Audit {
    @Column(name = "user_create",length = 45,nullable = true)
    private String userCreate;
    @Column(name = "date_create",nullable = true)
    private Timestamp dateCreate;
    @Column(name = "user_update",length = 45,nullable = true)
    private String userUpdate;
    @Column(name = "date_update",nullable = true)
    private Timestamp dateUpdate;
}
