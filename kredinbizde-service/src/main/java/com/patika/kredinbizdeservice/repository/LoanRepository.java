package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<User, Long> {
}
