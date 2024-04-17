package com.patika.garantiservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.patika.garantiservice.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long>{
	  
}
