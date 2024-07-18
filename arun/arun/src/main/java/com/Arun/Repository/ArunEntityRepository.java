package com.Arun.Repository;

import com.Arun.Entity.ArunEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArunEntityRepository extends JpaRepository<ArunEntity, Long> {
}