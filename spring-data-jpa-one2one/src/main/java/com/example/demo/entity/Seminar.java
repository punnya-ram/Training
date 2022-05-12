package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="punnya_seminar121")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seminar {
	@Id
	@Column(name="seminar_id")
	int id;
	@Column(name="seminar_name",length=20,nullable=false)
	String name;
	@Column(name="seminar_duration",nullable=false)
	int duration;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "speaker_ref")
	private Speaker speaker;

	

}