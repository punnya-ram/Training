package com.example.demo.controller;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.CabDriver;
import com.example.demo.TripDetail;
import com.example.demo.dto.TripDTO;

@RestController
@RequestMapping(path= "/client")
public class ClientController {
	
	@Autowired
	private RestTemplate template;
	@Autowired
	private TripDTO dto;
	
	@GetMapping(path="/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
		
	}
	@GetMapping(path="/trips")
	public String gettrips() {
		return this.template.getForObject("http://TRIP-DRIVER-SERVICE/api/v1/trip",String.class);
	}
	@GetMapping(path="/drivers/json")
	public CabDriver[] getDriversAsJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/",CabDriver[].class);
		
	}
	@GetMapping(path="/srch/drivers/{name}")
	public String getDriverByName(@PathVariable("name") String name) {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name,String.class);

	}
	@GetMapping(path="/srch/trips/{id}")
	public String getDriverById(@PathVariable("id") Integer id) {
		return this.template.getForObject("http://TRIP-DRIVER-SERVICE/api/v1/trip/srch/"+id,String.class);

	}
	@GetMapping(path="/drivers/trips/{id}")
	public TripDTO getDriverTrips(@PathVariable("id")Integer id) {
		CabDriver driver= this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,CabDriver.class);
		TripDetail[] trips=this.template.getForObject("http://TRIP-DRIVER-SERVICE/api/v1/trip/srch/"+id,TripDetail[].class);
		dto.setDriver(driver);
		//list
		//List<TripDetail>detailSet = Arrays.asList(trips);
		//set
		Set<TripDetail>deatailSet = Arrays.stream(trips).collect(Collectors.toSet());
		dto.setTrips(deatailSet);
		
		
		return dto;

	}
	

}
