package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class ChatController {
	
	int error=Integer.MIN_VALUE , issue=Integer.MIN_VALUE;
	String errorN="";

		
	 
		@GetMapping("/graph/{issueDate1}/{issueDate2}")
		public String admin(@PathVariable("issueDate1") @DateTimeFormat(pattern="yyyy-MM-dd") String issueDate1,
				@PathVariable("issueDate2") @DateTimeFormat(pattern="yyyy-MM-dd")  String issueDate2) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://b2d8570228dd27:0a622fbb@us-cdbr-east-04.cleardb.com/heroku_c23daed9d8150f2?reconnect=true","b2d8570338dd27","0a622fbb");
				Statement st=c.createStatement();
				ResultSet rs=st.executeQuery("Select  distinct(I.issuedate),\r\n"
						+ "SUM(IF(E.errorId =100 , 1, 0)) AS emailError,\r\n"
						+ "SUM(IF(E.errorId =101 , 1, 0)) AS zipError\r\n"
						+ "FROM ISSUES I INNER JOIN issueHas IH\r\n"
						+ "ON I.issueId=IH.issueId INNER JOIN error E\r\n"
						+ "ON IH.errorId=E.errorId\r\n"
						+ "WHERE isResolved=0 AND IssueDate  BETWEEN \""+issueDate1+"\" AND \""+issueDate2+"\"group by I.issueDate;\r\n"
						+ "");
				
				String response="";
				while(rs.next()) {
					Admin1 ad=new Admin1();
					ad.setIssueDate(rs.getDate(1));
					ad.setEmailErrors(rs.getInt(2));
					ad.setZipErrors(rs.getInt(3));
					
					
					Gson gson = new Gson();
					String json = gson.toJson(ad); 
					response+=json;
					
					}
			c.close();
			return response;
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			return "";
		}
		
	 
		@GetMapping("/pie/{issueDate1}/{issueDate2}")
		public String admin1(@PathVariable("issueDate1") @DateTimeFormat(pattern="yyyy-MM-dd") String issueDate1,
				@PathVariable("issueDate2") @DateTimeFormat(pattern="yyyy-MM-dd")  String issueDate2) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://b2d8570228dd27:0a622fbb@us-cdbr-east-04.cleardb.com/heroku_c23daed9d8150f2?reconnect=true","b2d8570338dd27","0a622fbb");
				Statement st=c.createStatement();
				ResultSet rs=st.executeQuery("Select  \r\n"
						+ "SUM(IF(E.errorId =100 , 1, 0)) AS totalEmailerrors,\r\n"
						+ "SUM(IF(E.errorId =101 , 1, 0)) AS totalZiperrors\r\n"
						+ "FROM ISSUES I INNER JOIN issueHas IH\r\n"
						+ "ON I.issueId=IH.issueId INNER JOIN error E\r\n"
						+ "ON IH.errorId=E.errorId\r\n"
						+ "WHERE isResolved=0 AND IssueDate  BETWEEN \""+issueDate1+"\" AND \""+issueDate2+"\";");
				
				String response="";
				while(rs.next()) {
					Admin2 ad2=new Admin2();
					ad2.setTotalEmailErrors(rs.getInt(1));
					ad2.setTotalzipErrors(rs.getInt(2));
					
					
					
					Gson gson = new Gson();
					String json = gson.toJson(ad2); 
					response+=json;
					
					}
			c.close();
			return response;
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			return "";
		}
		
		@GetMapping("/location/{issueDate1}/{issueDate2}")
		public String admin2(@PathVariable("issueDate1") @DateTimeFormat(pattern="yyyy-MM-dd") String issueDate1,
				@PathVariable("issueDate2") @DateTimeFormat(pattern="yyyy-MM-dd")  String issueDate2) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://b2d8570228dd27:0a622fbb@us-cdbr-east-04.cleardb.com/heroku_c23daed9d8150f2?reconnect=true","b2d8570338dd27","0a622fbb");
				Statement st=c.createStatement();
				ResultSet rs=st.executeQuery("Select  distinct(O.country),\r\n"
						+ "SUM(IF(E.errorId =100 , 1, 0)) AS emailError,\r\n"
						+ "SUM(IF(E.errorId =101 , 1, 0)) AS zipError\r\n"
						+ "FROM  orders O INNER JOIN issues I \r\n"
						+ "ON O.orderId=I.orderId\r\n"
						+ "INNER JOIN issueHas IH\r\n"
						+ "ON I.issueId=IH.issueId INNER JOIN error E\r\n"
						+ "ON IH.errorId=E.errorId\r\n"
						+ "WHERE isResolved=0 AND IssueDate  BETWEEN \""+issueDate1+"\" AND \""+issueDate2+"\"group by O.country;\r\n"
						+ "");
				String response="";
				while(rs.next()) {
					Admin3 ad3=new Admin3();
					
					ad3.setLocation(rs.getString(1));
					ad3.setEmailErrors(rs.getInt(2));
					ad3.setZipErrors(rs.getInt(3));
					
					
					Gson gson = new Gson();
					String json = gson.toJson(ad3); 
					response+=json;
					
					}
			c.close();
			return response;
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			return "";
		}

		@SuppressWarnings("resource")
		@GetMapping("/orders/{orderID}")
		public String checkOrder(@PathVariable("orderID") int orderId)
		{
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://b2d8570228dd27:0a622fbb@us-cdbr-east-04.cleardb.com/heroku_c23daed9d8150f2?reconnect=true","b2d8570338dd27","0a622fbb");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("Select issueExists from orders  where orderId=\""+orderId+"\"");
		
			   String response="";
     	 
			boolean issueExists = false;
			if(rs.next()) {

                 issueExists= rs.getBoolean(1);	

				
				}
	              
               if(issueExists) {
            	   rs=st.executeQuery("Select E.errorId, E.errorName, I.issueId , O.orderId,orderDate,quantity,productname,imageUrl,price \r\n"
            	   		+ "            	   from  error E  INNER JOIN IssueHas IH ON E.errorId = IH.errorId  INNER JOIN Issues I  ON IH.issueId = I.issueId  INNER JOIN\r\n"
            	   		+ "                   orders O ON I.orderId=O.orderId INNER JOIN orderdetail OD ON O.orderId=OD.orderId INNER JOIN product ON OD.productId=product.productId Where O.orderId=\""+orderId+"\"");
            	 
            	
            	   while(rs.next())
            	   {
            		   
            		   Failure f = new Failure();	   
            		   f.setErrorId(rs.getInt(1));
            		   f.setErrorName(rs.getString(2));
            		   f.setIssueId(rs.getInt(3));
            		   f.setOrderId(rs.getInt(4));
        				f.setOrderDate(rs.getDate(5));
        				f.setQuantity(rs.getInt(6));
        				f.setProductname(rs.getString(7));
        				f.setImageUrl(rs.getString(8));
        				f.setPrice(rs.getDouble(9));
        				
            	   
            		 
            		   error = f.getErrorId();
            		   issue = f.getIssueId();
            		   errorN=f.getErrorName();
            		   
            		   Gson gson = new Gson();
            		   String json = gson.toJson(f);
            		   response+=json;
            		   
            		
            	   }
            	
            	   }
               
               else {
            	   rs=st.executeQuery("Select O.orderId,orderDate,quantity,productname,imageUrl,price from orders O INNER JOIN orderdetail OD ON O.orderId=OD.orderId INNER JOIN product ON OD.productId=product.productId Where O.orderId=\""+orderId+"\"");
       			while(rs.next()) {
       				Success s=new Success();
       				s.setOrderId(rs.getInt(1));
       				s.setOrderDate(rs.getDate(2));
       				s.setQuantity(rs.getInt(3));
       				s.setProductname(rs.getString(4));
       				s.setImageUrl(rs.getString(5));
       				s.setPrice(rs.getDouble(6));
       				
       				Gson gson = new Gson();
       				String json = gson.toJson(s); 
       				response+=json;
       				
       				}
       			
               }
               
               c.close();
               return response;
           
			}
			catch(Exception e){
		      	e.printStackTrace();
		      	return e.toString();
			}
			
		
		}
		
		@SuppressWarnings("unused")
		@PutMapping(path="/orders/{orderID}",consumes={"application/json"})
		public void updatecustomers(@PathVariable("orderID") int orderID,
				@RequestBody Orders O)
		{
			
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://b2d8570338dd27:0a622fbb@us-cdbr-east-04.cleardb.com/heroku_c23daed9d8150f2?reconnect-truemysql://b2d8570338dd27:0a622fbb@us-cdbr-east-04.cleardb.com/heroku_c23daed9d8150f2?reconnect-true","b2d8570338dd27","0a622fbb");
			Statement st=c.createStatement();
			
			if(error==100)
			{
				boolean rs=st.execute("Update  orders set orderEmail=\""+O.getOrderEmail()+"\" where orderID=\""+orderID+"\"");
				boolean rs2 = st.execute("Update  orders set issueExists = 0 where orderID=\""+orderID+"\"");
				boolean rs3 = st.execute("Update  issues set isResolved = 1 where issueId=\""+issue+"\"");
				
			}
			else if(error==101)
			{
				boolean rs=st.execute("Update  orders set zipCode=\""+O.getZipCode()+"\" where orderID=\""+orderID+"\"");
				boolean rs2 = st.execute("Update  orders set issueExists = 0 where orderID=\""+orderID+"\"");
				boolean rs3 = st.execute("Update  issues set isResolved = 1 where issueId=\""+issue+"\"");
			}
			c.close();		
			}
			catch(Exception e){
		      	e.printStackTrace();
			}
		}
}