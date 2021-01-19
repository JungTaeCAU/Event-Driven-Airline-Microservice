package com.jungtae.book.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jungtae.book.entity.BookingRecord;

public interface BookingRepository extends JpaRepository<BookingRecord, Long> {
	
}
