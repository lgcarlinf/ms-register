package com.codigo.msregister.repository;

import com.codigo.msregister.entity.EnterpriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<EnterpriseEntity, Integer> {
}
