package com.exavalu.demoInsuranceapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/resource")
public class InsuranceDemoResource {

	InsuranceJavaMongoCustomer custobj = new InsuranceJavaMongoCustomer();
	InsuranceJavaMongoPolicy policyobj = new InsuranceJavaMongoPolicy();
	
	//insurance/cutomerdetails
	@Path("/customerdetails1")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetails1(@QueryParam ("fname") String fname, @QueryParam ("lname") String lname, @QueryParam ("dob") String dob)
	{
		//return "Hello World";
		//write the return statement
		
		//System.out.println("the received customer info is:"+custobj.getCustomerDetails(fname, lname, dob));
		
		String val =  custobj.getCustomerDetails1(fname, lname, dob);
		System.out.println("######################"+val);
		return Response.ok(val, MediaType.APPLICATION_JSON).build();
		
	}
	@Path("/customerdetails2")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getCustomerDetails2(@QueryParam ("fname") String fname, @QueryParam ("lname") String lname)
	{
		//return "Hello World";
		//write the return statement
		
		//System.out.println("the received customer info is:"+custobj.getCustomerDetails(fname, lname, dob));
		
		String val =  custobj.getCustomerDetails2(fname, lname);
		System.out.println("######################"+val);
		return Response.ok(val, MediaType.APPLICATION_JSON).build();
		
	}
	@Path("/customerdetails3")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetails3(@QueryParam ("fname") String fname, @QueryParam ("dob") String dob)
	{
		//return "Hello World";
		//write the return statement
		
		//System.out.println("the received customer info is:"+custobj.getCustomerDetails(fname, lname, dob));
		
		String val =  custobj.getCustomerDetails3(fname, dob);
		System.out.println("######################"+val);
		return Response.ok(val, MediaType.APPLICATION_JSON).build();
		
	}
	@Path("/customerdetails4")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetails4(@QueryParam ("lname") String lname, @QueryParam ("dob") String dob)
	{
		//return "Hello World";
		//write the return statement
		
		//System.out.println("the received customer info is:"+custobj.getCustomerDetails(fname, lname, dob));
		
		String val =  custobj.getCustomerDetails4(lname, dob);
		System.out.println("######################"+val);
		return Response.ok(val, MediaType.APPLICATION_JSON).build();
		
	}
	@Path("/customerdetails5")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetails5(@QueryParam ("fname") String fname)
	{
		//return "Hello World";
		//write the return statement
		
		//System.out.println("the received customer info is:"+custobj.getCustomerDetails(fname, lname, dob));
		
		String val =  custobj.getCustomerDetails5(fname);
		System.out.println("######################"+val);
		return Response.ok(val, MediaType.APPLICATION_JSON).build();
		
	}
	@Path("/customerdetails6")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetails6(@QueryParam ("lname") String lname)
	{
		//return "Hello World";
		//write the return statement
		
		//System.out.println("the received customer info is:"+custobj.getCustomerDetails(fname, lname, dob));
		
		String val =  custobj.getCustomerDetails6(lname);
		System.out.println("######################"+val);
		return Response.ok(val, MediaType.APPLICATION_JSON).build();
		
	}
	@Path("/customerdetails7")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetails7(@QueryParam ("dob") String dob)
	{
		//return "Hello World";
		//write the return statement
		
		//System.out.println("the received customer info is:"+custobj.getCustomerDetails(fname, lname, dob));
		
		String val =  custobj.getCustomerDetails7(dob);
		System.out.println("######################"+val);
		return Response.ok(val, MediaType.APPLICATION_JSON).build();
		
	}
	
	@Path("/policydetails")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPolicyDetails(@QueryParam ("customerID") String customerID)
	{
		//return "policy";
		//return the policy details here
		
		String policyval = policyobj.getPolicyDetails(customerID);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+policyval);
		return Response.ok(policyval, MediaType.APPLICATION_JSON).build();
	}
	
}
