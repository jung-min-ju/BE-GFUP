package com.backend.GFUP.repository;

import com.backend.GFUP.model.AlarmInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmRepository extends JpaRepository<AlarmInfo, Long> {
}
