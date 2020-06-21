package com.exavalu.demoInsuranceapi;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;


public class InsuranceJavaMongoPolicy {
	public String getPolicyDetails(String customerID, String policytype) 
	{
		//MongoDB connection
		MongoClientURI uri = new MongoClientURI("mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");
		
		//MongoDB Policy Database connection
				
		MongoDatabase policy_database = mongoClient.getDatabase("policy");
		System.out.println("\nThe connection to Database\t"+policy_database.getName()+"\t is established successfully");
		//System.out.println("\n Enter the customer ID to display its policy details:\n ");
		
		   
		  System.out.println("\n The Policy details for the customer ID\t" +customerID+"\tis:"); 
		  MongoCollection<Document> newPolicyDetails = policy_database.getCollection("NewPolicyDetails"); 
		  MongoCursor<Document> policycursor1 = newPolicyDetails.find(and(eq("CustomerID",customerID), eq("Policy Type", policytype))).iterator();
		 
		  ArrayList<String> jsonPolicy = new ArrayList<String>();
		  String serializedPolicyValue ="";
		  
		  try 
		  { 
			  while(policycursor1.hasNext())
			  {
				  Document doc = policycursor1.next();
				  System.out.println("\n"+doc.toJson()); 
				  String ob = doc.toJson();
				  jsonPolicy.add(ob);
			  }
			  serializedPolicyValue = jsonPolicy.toString();
		  } 
		  finally { //TODO: handle finally clause 
			  policycursor1.close(); }
		  
		  mongoClient.close();
		  return serializedPolicyValue;
	}

	public String getPolicyDetails(String customerID) 
	{
		//MongoDB connection
		MongoClientURI uri = new MongoClientURI("mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");
		
		//MongoDB Policy Database connection
				
		MongoDatabase policy_database = mongoClient.getDatabase("policy");
		System.out.println("\nThe connection to Database\t"+policy_database.getName()+"\t is established successfully");
		//System.out.println("\n Enter the customer ID to display its policy details:\n ");
		
		   
		  System.out.println("\n The Policy details for the customer ID\t" +customerID+"\tis:"); 
		  MongoCollection<Document> newPolicyDetails = policy_database.getCollection("NewPolicyDetails"); 
		  MongoCursor<Document> policycursor1 = newPolicyDetails.find(eq("CustomerID",customerID)).iterator();
		 
		  ArrayList<String> jsonPolicy = new ArrayList<String>();
		  String serializedPolicyValue ="";
		  
		  try 
		  { 
			  while(policycursor1.hasNext())
			  {
				  Document doc = policycursor1.next();
				  System.out.println("\n"+doc.toJson()); 
				  String ob = doc.toJson();
				  jsonPolicy.add(ob);
			  }
			  serializedPolicyValue = jsonPolicy.toString();
		  } 
		  finally { //TODO: handle finally clause 
			  policycursor1.close(); }
		  
		  mongoClient.close();
		  return serializedPolicyValue;
	}
}


