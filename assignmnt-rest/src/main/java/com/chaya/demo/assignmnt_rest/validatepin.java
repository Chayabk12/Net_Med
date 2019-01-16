package com.chaya.demo.assignmnt_rest;

import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/validate")
public class validatepin 
{
	InfoDao i= new InfoDao ();

	@Path("{zipcode}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	
	public Info validate(@PathParam ("zipcode") int zipcode) 
	{
		System.out.println("hello");
		for(Map.Entry<Integer,Info> entry : i.getInfo().entrySet())  
		{
			System.out.println( i.getInfo().entrySet());
					if(zipcode==entry.getKey()) {
					
						return entry.getValue();
					}
		}
		return null;
	}
	
}
