package com.backend.GFUP.repository;

import com.backend.GFUP.model.AlarmInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlarmRepository extends JpaRepository<AlarmInfo, Long> {
}
