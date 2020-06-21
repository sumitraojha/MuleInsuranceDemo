package com.exavalu.demoInsuranceapi;

import static com.mongodb.client.model.Filters.*;
import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.model.Projections;

public class InsuranceJavaMongoCustomer {

	public String getCustomerDetails1(String fname, String lname, String dob) {

		// MongoDB connection
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");

		// MongoDB Customer Database connection
		MongoDatabase cust_database = mongoClient.getDatabase("customer");
		System.out.println("The connection to Database\t" + cust_database.getName() + "\tis established successfully");
		// System.out.println("the database is "+cust_database.getName());

		System.out.println("\n The Customer Details are:");
		MongoCollection<Document> newcustDetails = cust_database.getCollection("NewCustomerDetails");

		MongoCursor<Document> custcursor1 = newcustDetails
				.find(and(regex("first_name", fname), regex("last_name", lname), eq("DOB", dob))).iterator();
		// MongoCursor<Document> custcursor2 = newcustDetails.find(eq("first_name",
		// fname)).projection(Projections.include("CustomerID")).iterator();
		// System.out.println(custcursor1);
		//ArrayList<Document> value = new ArrayList<Document>();
		ArrayList<String> jsonVal = new ArrayList<String>();
		String serializedValue = "";

		try {
			
			  while(custcursor1.hasNext()) {
			  
			  Document doc = custcursor1.next(); 
			  //String temp = doc.getString("CustomerID"); 
			  System.out.println("\n"+doc.toJson());
			  //System.out.println(temp); //String temp =newcustDetails.find().projection(Projections.include("CustomerID")).first().getString("CustomerID");System.out.println(temp); 
			 String ob =  doc.toJson();
			  jsonVal.add(ob);
			   
			  
			  }
			 
		 serializedValue = jsonVal.toString();
		} finally {
			// TODO: handle finally clause
			custcursor1.close();
		}

		/*
		 * System.out.println("\n The Customer are:\t\t"); Iterator<Document> i1 =
		 * value.iterator(); while (i1.hasNext()) { System.out.println(i1.next()); }
		 */

		mongoClient.close();
		return serializedValue;

	}
	
	public String getCustomerDetails2(String fname, String lname) {

		// MongoDB connection
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");

		// MongoDB Customer Database connection
		MongoDatabase cust_database = mongoClient.getDatabase("customer");
		System.out.println("The connection to Database\t" + cust_database.getName() + "\tis established successfully");
		// System.out.println("the database is "+cust_database.getName());

		System.out.println("\n The Customer Details are:");
		MongoCollection<Document> newcustDetails = cust_database.getCollection("NewCustomerDetails");

		MongoCursor<Document> custcursor1 = newcustDetails
				.find(and(regex("first_name", fname), regex("last_name", lname))).iterator();
		// MongoCursor<Document> custcursor2 = newcustDetails.find(eq("first_name",
		// fname)).projection(Projections.include("CustomerID")).iterator();
		// System.out.println(custcursor1);
		//ArrayList<Document> value = new ArrayList<Document>();
		ArrayList<String> jsonVal = new ArrayList<String>();
		String serializedValue = "";

		try {
			
			  while(custcursor1.hasNext()) {
			  
			  Document doc = custcursor1.next(); 
			  //String temp = doc.getString("CustomerID"); 
			  System.out.println("\n"+doc.toJson());
			  //System.out.println(temp); //String temp =newcustDetails.find().projection(Projections.include("CustomerID")).first().getString("CustomerID");System.out.println(temp); 
			 String ob =  doc.toJson();
			  jsonVal.add(ob);
			   
			  
			  }
			 
		 serializedValue = jsonVal.toString();
		} finally {
			// TODO: handle finally clause
			custcursor1.close();
		}

		/*
		 * System.out.println("\n The Customer are:\t\t"); Iterator<Document> i1 =
		 * value.iterator(); while (i1.hasNext()) { System.out.println(i1.next()); }
		 */

		mongoClient.close();
		return serializedValue;

	}
	
	public String getCustomerDetails3(String fname, String dob) {

		// MongoDB connection
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");

		// MongoDB Customer Database connection
		MongoDatabase cust_database = mongoClient.getDatabase("customer");
		System.out.println("The connection to Database\t" + cust_database.getName() + "\tis established successfully");
		// System.out.println("the database is "+cust_database.getName());

		System.out.println("\n The Customer Details are:");
		MongoCollection<Document> newcustDetails = cust_database.getCollection("NewCustomerDetails");

		MongoCursor<Document> custcursor1 = newcustDetails
				.find(and(regex("first_name", fname),eq("DOB", dob))).iterator();
		// MongoCursor<Document> custcursor2 = newcustDetails.find(eq("first_name",
		// fname)).projection(Projections.include("CustomerID")).iterator();
		// System.out.println(custcursor1);
		//ArrayList<Document> value = new ArrayList<Document>();
		ArrayList<String> jsonVal = new ArrayList<String>();
		String serializedValue = "";

		try {
			
			  while(custcursor1.hasNext()) {
			  
			  Document doc = custcursor1.next(); 
			  //String temp = doc.getString("CustomerID"); 
			  System.out.println("\n"+doc.toJson());
			  //System.out.println(temp); //String temp =newcustDetails.find().projection(Projections.include("CustomerID")).first().getString("CustomerID");System.out.println(temp); 
			 String ob =  doc.toJson();
			  jsonVal.add(ob);
			   
			  
			  }
			 
		 serializedValue = jsonVal.toString();
		} finally {
			// TODO: handle finally clause
			custcursor1.close();
		}

		/*
		 * System.out.println("\n The Customer are:\t\t"); Iterator<Document> i1 =
		 * value.iterator(); while (i1.hasNext()) { System.out.println(i1.next()); }
		 */

		mongoClient.close();
		return serializedValue;

	}
	
	public String getCustomerDetails4(String lname, String dob) {

		// MongoDB connection
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");

		// MongoDB Customer Database connection
		MongoDatabase cust_database = mongoClient.getDatabase("customer");
		System.out.println("The connection to Database\t" + cust_database.getName() + "\tis established successfully");
		// System.out.println("the database is "+cust_database.getName());

		System.out.println("\n The Customer Details are:");
		MongoCollection<Document> newcustDetails = cust_database.getCollection("NewCustomerDetails");

		MongoCursor<Document> custcursor1 = newcustDetails
				.find(and(regex("last_name", lname), eq("DOB", dob))).iterator();
		// MongoCursor<Document> custcursor2 = newcustDetails.find(eq("first_name",
		// fname)).projection(Projections.include("CustomerID")).iterator();
		// System.out.println(custcursor1);
		//ArrayList<Document> value = new ArrayList<Document>();
		ArrayList<String> jsonVal = new ArrayList<String>();
		String serializedValue = "";

		try {
			
			  while(custcursor1.hasNext()) {
			  
			  Document doc = custcursor1.next(); 
			  //String temp = doc.getString("CustomerID"); 
			  System.out.println("\n"+doc.toJson());
			  //System.out.println(temp); //String temp =newcustDetails.find().projection(Projections.include("CustomerID")).first().getString("CustomerID");System.out.println(temp); 
			 String ob =  doc.toJson();
			  jsonVal.add(ob);
			   
			  
			  }
			 
		 serializedValue = jsonVal.toString();
		} finally {
			// TODO: handle finally clause
			custcursor1.close();
		}

		/*
		 * System.out.println("\n The Customer are:\t\t"); Iterator<Document> i1 =
		 * value.iterator(); while (i1.hasNext()) { System.out.println(i1.next()); }
		 */

		mongoClient.close();
		return serializedValue;

	}
	
	public String getCustomerDetails5(String fname) {

		// MongoDB connection
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");

		// MongoDB Customer Database connection
		MongoDatabase cust_database = mongoClient.getDatabase("customer");
		System.out.println("The connection to Database\t" + cust_database.getName() + "\tis established successfully");
		// System.out.println("the database is "+cust_database.getName());

		System.out.println("\n The Customer Details are:");
		MongoCollection<Document> newcustDetails = cust_database.getCollection("NewCustomerDetails");

		/*MongoCursor<Document> custcursor1 = newcustDetails
				.find(eq("first_name", fname)).iterator();*/
		MongoCursor<Document> custcursor1 = newcustDetails
				.find(regex("first_name", fname )).iterator();
		// MongoCursor<Document> custcursor2 = newcustDetails.find(eq("first_name",
		// fname)).projection(Projections.include("CustomerID")).iterator();
		// System.out.println(custcursor1);
		//ArrayList<Document> value = new ArrayList<Document>();
		ArrayList<String> jsonVal = new ArrayList<String>();
		String serializedValue = "";

		try {
			
			  while(custcursor1.hasNext()) {
			  
			  Document doc = custcursor1.next(); 
			  //String temp = doc.getString("CustomerID"); 
			  System.out.println("\n"+doc.toJson());
			  //System.out.println(temp); //String temp =newcustDetails.find().projection(Projections.include("CustomerID")).first().getString("CustomerID");System.out.println(temp); 
			 String ob =  doc.toJson();
			  jsonVal.add(ob);
			   
			  
			  }
			 
		 serializedValue = jsonVal.toString();
		} finally {
			// TODO: handle finally clause
			custcursor1.close();
		}

		/*
		 * System.out.println("\n The Customer are:\t\t"); Iterator<Document> i1 =
		 * value.iterator(); while (i1.hasNext()) { System.out.println(i1.next()); }
		 */

		mongoClient.close();
		return serializedValue;

	}
	
	public String getCustomerDetails6(String lname) {

		// MongoDB connection
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");

		// MongoDB Customer Database connection
		MongoDatabase cust_database = mongoClient.getDatabase("customer");
		System.out.println("The connection to Database\t" + cust_database.getName() + "\tis established successfully");
		// System.out.println("the database is "+cust_database.getName());

		System.out.println("\n The Customer Details are:");
		MongoCollection<Document> newcustDetails = cust_database.getCollection("NewCustomerDetails");

		MongoCursor<Document> custcursor1 = newcustDetails
				.find(regex("last_name", lname)).iterator();
		// MongoCursor<Document> custcursor2 = newcustDetails.find(eq("first_name",
		// fname)).projection(Projections.include("CustomerID")).iterator();
		// System.out.println(custcursor1);
		//ArrayList<Document> value = new ArrayList<Document>();
		ArrayList<String> jsonVal = new ArrayList<String>();
		String serializedValue = "";

		try {
			
			  while(custcursor1.hasNext()) {
			  
			  Document doc = custcursor1.next(); 
			  //String temp = doc.getString("CustomerID"); 
			  System.out.println("\n"+doc.toJson());
			  //System.out.println(temp); //String temp =newcustDetails.find().projection(Projections.include("CustomerID")).first().getString("CustomerID");System.out.println(temp); 
			 String ob =  doc.toJson();
			  jsonVal.add(ob);
			   
			  
			  }
			 
		 serializedValue = jsonVal.toString();
		 
		} finally {
			// TODO: handle finally clause
			custcursor1.close();
		}

		/*
		 * System.out.println("\n The Customer are:\t\t"); Iterator<Document> i1 =
		 * value.iterator(); while (i1.hasNext()) { System.out.println(i1.next()); }
		 */

		mongoClient.close();
		return serializedValue;

	}
	
	public String getCustomerDetails7(String dob) {

		// MongoDB connection
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sumitraojha:sumitra@cluster0-tkx83.mongodb.net/customer?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		System.out.println("The connection to mongoDB is established");

		// MongoDB Customer Database connection
		MongoDatabase cust_database = mongoClient.getDatabase("customer");
		System.out.println("The connection to Database\t" + cust_database.getName() + "\tis established successfully");
		// System.out.println("the database is "+cust_database.getName());

		System.out.println("\n The Customer Details are:");
		MongoCollection<Document> newcustDetails = cust_database.getCollection("NewCustomerDetails");

		MongoCursor<Document> custcursor1 = newcustDetails
				.find(eq("DOB", dob)).iterator();
		// MongoCursor<Document> custcursor2 = newcustDetails.find(eq("first_name",
		// fname)).projection(Projections.include("CustomerID")).iterator();
		// System.out.println(custcursor1);
		//ArrayList<Document> value = new ArrayList<Document>();
		ArrayList<String> jsonVal = new ArrayList<String>();
		String serializedValue = "";

		try {
			
			  while(custcursor1.hasNext()) {
			  
			  Document doc = custcursor1.next(); 
			  //String temp = doc.getString("CustomerID"); 
			  System.out.println("\n"+doc.toJson());
			  //System.out.println(temp); //String temp =newcustDetails.find().projection(Projections.include("CustomerID")).first().getString("CustomerID");System.out.println(temp); 
			 String ob =  doc.toJson();
			  jsonVal.add(ob);
			   
			  
			  }
			 
		 serializedValue = jsonVal.toString();
		 
		} finally {
			// TODO: handle finally clause
			custcursor1.close();
		}

		/*
		 * System.out.println("\n The Customer are:\t\t"); Iterator<Document> i1 =
		 * value.iterator(); while (i1.hasNext()) { System.out.println(i1.next()); }
		 */

		mongoClient.close();
		return serializedValue;

	}
	
	

}
