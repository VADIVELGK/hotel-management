package project;
import java.util.Scanner;

import java.sql.*;
public abstract class info {
	
	 Scanner s=new Scanner(System.in);
	private String firstname;
	
	void add()
	{
		 System.out.println("enter Food ID:");
		 int id=s.nextInt();
		 System.out.println("enter Food Name:");
		 s.nextLine();
		 String name=s.nextLine();
		 System.out.println("enter Rate:");
		 int rate=s.nextInt();
		 System.out.println("enter Availability:");
		 s.nextLine();
		 String avi=s.nextLine();
		 System.out.println("enter Food Type:");
		 String type=s.nextLine();
		 System.out.println("enter Food quantity:");
		 int qua=s.nextInt();
		 s.nextLine();
		 System.out.println("enter the type of cusine:");
		 String cus=s.nextLine();
		 System.out.println("enter the chat items:");
		 String chat=s.nextLine();
		 System.out.println("enter the offer:");
		 int offer=s.nextInt();
		 System.out.println("enter hotel location:");
		 s.nextLine();
		 String location =s.nextLine();
		 System.out.println("enter the order date:");
		 String date=s.nextLine();
		 System.out.println("enter order type:");
		 String ortype=s.nextLine();
		 System.out.println("enter enter rating:");
		 int rating=s.nextInt();
		 System.out.println("enter review:");
		 s.nextLine();
		 String review=s.nextLine();
	
		 
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
			 PreparedStatement ps=con.prepareStatement("insert into hotelssinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			 ps.setInt(1,id);
			 ps.setString(2, name);
			 ps.setInt(3,rate );
			 ps.setString(4, avi);
			 ps.setString(5, type);
			 ps.setInt(6, qua);
			 ps.setString(7, cus);
			 ps.setString(8, chat);
			 ps.setInt(9,offer);
			 ps.setString(10,location);
			 ps.setString(11,date);
			 ps.setString(12,ortype);
			 ps.setInt(13,rating);
			 ps.setString(14,review);
			 
			 ps.executeUpdate();
			 con.close();
			 System.out.println("datas saved successfully");
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
	
	  void update()
	  {
		  try {
			  System.out.println("enter the Id:");
			  int id=s.nextInt();
			  System.out.println("enter the Quantity");
			  int qua=s.nextInt();
			  
			  Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
				 PreparedStatement ps=con.prepareStatement("update hotelssinfo set quantity=? where Food ID=?");
				 ps.setInt(2,id);
				 ps.setInt(1, qua);
				 ps.executeUpdate();
				 con.close();
				 System.out.println("data updated successfully.....");
		  }
			 catch(Exception e)
			 {
				System.out.println(e); 
		     }
	  }
	  
	  void delete()
	  {
		  
		  try {
			  System.out.println("enter the Id:");
			  int id=s.nextInt();
			  
			  Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
				 PreparedStatement ps=con.prepareStatement("delete from hotelssinfo where Food id=?");
				 ps.setInt(1,id);
				 ps.executeUpdate();
				 con.close();
				 System.out.println("data delete successfully.....");
		  }
			 catch(Exception e)
			 {
				System.out.println(e); 
		     }
	 }
      
	  void cadd()
	  {
		  System.out.println("enter bill number:");
			 int num=s.nextInt();
			 System.out.println("enter customer id:");
			 int cid=s.nextInt();
			 System.out.println("enter customer name");
			 s.nextLine();
			 String cname=s.nextLine();
			 System.out.println("enter Gender:");
			 String gen=s.nextLine();
			 System.out.println("enter phone number:");
			 Long n=s.nextLong();
			 System.out.println("enter location:");
			 s.nextLine();
			 String loc=s.nextLine();
			 System.out.println("enter order food:");
			 String f=s.nextLine();
			 System.out.println("enter ordered mode:");
			 String m=s.nextLine();
			 System.out.println("enter payment method:");
			 String p=s.nextLine();
			 System.out.println("enter Quantity:");
			 int q=s.nextInt();
			 
			 try {
				 Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
				 PreparedStatement ps=con.prepareStatement("insert into customersinfo values(?,?,?,?,?,?,?,?,?,?)");
				 ps.setInt(1,num);
				 ps.setInt(2,cid);
				 ps.setString(3,cname);
				 ps.setString(4,gen);
				 ps.setLong(5,n);
				 ps.setString(6,loc);
				 ps.setString(7,f);
				 ps.setString(8,m);
				 ps.setString(9,p);
				 ps.setInt(10,q);
				 
				 ps.executeUpdate();
				 con.close();
				 System.out.println("datas saved successfully...");
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
	  }
	  
	  void cupdate()
	  {
		  try {
			  System.out.println("enter the Id:");
			  int id=s.nextInt();
			  System.out.println("enter the Quantity");
			  int qua=s.nextInt();
			  
			  Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
				 PreparedStatement ps=con.prepareStatement("update customersinfo set Quantity=? where Customer id=?");
				 ps.setInt(2,id);
				 ps.setInt(1,qua);
				 ps.executeUpdate();
				 con.close();
				 System.out.println("datas update succussfully.....");
		  }
		  
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  
	  }
	    
	  void cdelete()
	  {
		  try {
			  System.out.println("enter the Customer Id:");
			  int id=s.nextInt();
			  
			  Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
				 PreparedStatement ps=con.prepareStatement("delete from customersinfo where Customer id=?");
				 ps.setInt(1,id);
				 ps.executeUpdate();
				 con.close();
				 System.out.println("data delete successfully.....");
		  }
			 catch(Exception e)
			 {
				System.out.println(e); 
		     }
	  }
	       
	  void cselect()
	  {
		  try
		  {
			  System.out.println("enter the Customer Id:");
			  int id=s.nextInt();
			  
			  Class.forName("com.mysql.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
				 PreparedStatement st=con.prepareStatement("select * from customersinfo where Customer id=?");
				 st.setInt(1,id);
				 ResultSet r=st.executeQuery();
				 int c=0;
				 while(r.next())
				 {
					 System.out.println("bill number:"+r.getInt(1));
					 System.out.println("customer id:"+r.getInt(2));
					 System.out.println("customer name:"+r.getString(3));
					 System.out.println("Gender:"+r.getString(4));
					 System.out.println("Phone Number:"+r.getLong(5));
					 System.out.println("Location:"+r.getString(6));
					 System.out.println("Ordered Food:"+r.getString(7));
					 System.out.println("Ordered Mood:"+r.getString(8));
					 System.out.println("Payment Method:"+r.getString(9));
					 System.out.println("Quantity:"+r.getInt(10));
					 c=1;
				 }
				 
				 if(c==0)
				 {
					 System.out.println("invalid data...");
				 }
				 }
		  
		        catch(Exception e)
		  {
		      System.out.println(e);  	
		  }
	  }
	   abstract void select();

	public static void main(String[] args) {
	 

	}

}
