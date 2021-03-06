package com.cdm.sig.repositories.utils;

import com.cdm.sig.models.integrations.Eps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsRepository extends JpaRepository<Eps, String> {
}
