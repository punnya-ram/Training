package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.repo.SeminarRepository;

@Service
public class SeminarService {
	@Autowired
	Speaker spk;
	@Autowired
	Seminar sem;
	@Autowired
	SeminarRepository repo;
	public void create() {
		Seminar added=repo.save(sem);
		if(added!=null) {
			System.out.println("One Recored added");
		}
		
	}

}
