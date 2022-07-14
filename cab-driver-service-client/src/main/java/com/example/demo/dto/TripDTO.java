package com.example.demo.dto;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.CabDriver;
import com.example.demo.TripDetail;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class TripDTO {
	private CabDriver driver;
	//private List<TripDetail> trips;
	private Set<TripDetail> trips;


}
