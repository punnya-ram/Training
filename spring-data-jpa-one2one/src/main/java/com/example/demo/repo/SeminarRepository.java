package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Seminar;
@Repository
public interface SeminarRepository extends JpaRepository<Seminar,Integer> {

}
