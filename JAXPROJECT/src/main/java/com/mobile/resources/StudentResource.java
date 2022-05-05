package com.mobile.resources;

import java.util.List;
import java.util.Map;

import jakarta.ws.rs.core.Response;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.mobile.Student;
import com.mobile.services.StudentService;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {
	private static StudentService service=new StudentService() ;
	public StudentResource() {
		super();
		
}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
		return service.getAll();
	}
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("rollNumber")int id) {
		try{
			Student entity=service.finfById(id).orElseThrow(()->new RuntimeException("Id Not Found"));
			return Response.ok(entity).build();
		}catch(RuntimeException e) {
			e.printStackTrace();
			JsonObject obj=Json.createObjectBuilder().add("ID NOT FOUND","").build();
			return Response.ok("id not found").status(400).build();		
			}
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Student student) {
		boolean result=service.add(student);
		if(result) {
			return Response.ok(student).status(201).build();
		}else {
			return Response.status(400,"Not Created").build();
		}
		
	}
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("rollNumber")  int id )
	{
		
			boolean result= service.remove(id);
			if(result) {
				return Response.ok("one reCORD DELETED").build();
			}else {
				return Response.status(400,"Not deleted").build();
			}
				
			}
	
	@PUT
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateById(@PathParam("rollNumber")  int id , Student newStudent)
	{
		return service.update(id,newStudent);
	}

}
