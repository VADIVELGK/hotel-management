package project;
import java.sql.*;
import java.util.Scanner;
public  class hotelinfo extends info {
    
	@Override
	void select() {
		try {
			System.out.println("enter the id:");
			String name=s.nextLine();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
			PreparedStatement st=con.prepareStatement("select* from hotelssinfo where Food id=?");
			st.setString(1, name);
			ResultSet r=st.executeQuery();
			int c=0;
			while(r.next())
			{
				System.out.println("Food Id:"+r.getInt(1));
				System.out.println("Food Name:"+r.getString(2));
				System.out.println("Rate:"+r.getInt(3));
				System.out.println("Availability:"+r.getString(4));
				System.out.println("Food Type:"+r.getString(5));
				System.out.println("Quantity:"+r.getInt(6));
				System.out.println("Types of Cusine:"+r.getString(7));
				System.out.println("Chat Items:"+r.getString(8));
				System.out.println("Offer:"+r.getInt(9));
				System.out.println("Hotel Location:"+r.getString(10));
				System.out.println("Order Date:"+r.getString(11));
				System.out.println("Food type:"+r.getString(12));
				System.out.println("Rating:"+r.getInt(13));
				System.out.println("Review:"+r.getString(14));
				c=1;
			}
			if(c==0)
			{
				System.out.println("invalid data....");
			}
		    }
		    
		catch(Exception e)
		{
		    	System.out.println(e);
		}
	}
	public static void main(String[] args) {
		hotelinfo obj=new hotelinfo();
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the username");
		String user=s.next();
		System.out.println("enter the password");
		String pass=s.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
			PreparedStatement st=con.prepareStatement("select* from adminsinfo");
			ResultSet r=st.executeQuery();
			while(r.next())
			{
				String userdb=r.getString(1);
				String passdb=r.getString(2);
				
				if(user.equals(userdb) && pass.equals(passdb))		
				{
		
		System.out.println("select the table");
		System.out.println("1.hotelinfo");
		System.out.println("2.customerinfo");
		
		int a=s.nextInt(); 
		
		if(a==1)
		{
			System.out.println("select the operation");
			System.out.println("1.Add data");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.select");
			int op=s.nextInt();
			if(op==1)
			{
				obj.add();
			}
			else if(op==2)
			{
				obj.update();
			}
			else if(op==3)
			{
				obj.delete();
			}
			else if(op==4)
			{
				obj.select();
			}
			else
			{
				System.out.println("invalid option");
			}
			
		}
		else if(a==2)
		{
			System.out.println("select the operation");
			System.out.println("1.Add data");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.select");
			int op=s.nextInt();
			if(op==1)
			{
				obj.cadd();
			}
			else if(op==2)
			{
				obj.cupdate();
			}
			else if(op==3)
			{
				obj.cdelete();
			}
			else if(op==4)
			{
				obj.cselect();
			}
			else
			{
				System.out.println("invalid option");
			}
		}
		
		}
				else
				{
					System.out.println("invalid username or password");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
		}
	

