package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.CabDriver;

public interface CabDriverRepository extends JpaRepository<CabDriver,Integer> {
	CabDriver findByDriverName(String qryName);

}
