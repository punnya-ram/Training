package com.training.jax_rs_client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/products");
		
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		
		Response resp = builder.get();
		int ch=4;
		if(ch==4) {
			Product[]  List =resp.readEntity(Product[].class);
					for(Product eachPoduct:List) {
						System.out.println(eachPoduct);
					}
		}
		if(ch==1) {
			String object=resp.readEntity(String.class);
			System.out.println(object);
		}
		if(ch==2) {
			WebTarget findByIdTarget=target.path("/srch/88");
			Invocation.Builder builder2 = findByIdTarget.request(MediaType.APPLICATION_JSON);
			Response findByresp=builder2.get();
		Product object2=findByresp.readEntity(Product.class);
		System.out.println(object2);
		}
	
		if(ch==3) {
		Product toAdd=new Product(2, "loki", 50);
		Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
		}
		//System.out.println(response.readEntity(String.class));
	}

}