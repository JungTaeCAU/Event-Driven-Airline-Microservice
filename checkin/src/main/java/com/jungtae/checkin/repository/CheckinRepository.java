package com.jungtae.checkin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jungtae.checkin.entity.CheckInRecord;

public interface CheckinRepository extends JpaRepository<CheckInRecord,Long> {

}
