package com.bezkoder.spring.jpa.h2.repository;

import com.bezkoder.spring.jpa.h2.model.CheckInDB;
import com.bezkoder.spring.jpa.h2.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CheckInRepository extends JpaRepository<CheckInDB, Long> {
    List<CheckInDB> findByCheckInId(String checkInId);
}
