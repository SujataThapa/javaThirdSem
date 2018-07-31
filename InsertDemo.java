import java.util.Scanner;
import java.sql.*;
public class InsertDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Roll No:");
		int roll_num=Integer.parseInt(sc.nextLine());
		System.out.print("Full Name:");
		String name=sc.nextLine();
		System.out.print("Address: ");
		String address=sc.nextLine();
	    System.out.print("Gender:");
		String gender=sc.nextLine();
		System.out.print("Course:");
		String course=sc.nextLine();
		Connection cn=DatabaseConnection.getConnection();
		try{
		Statement stat=cn.createStatement();
		//String sql="INSERT INTO Student(roll_num,name,address,gender,course)VALUES("+roll_num+",'"+name+"','KTM','F','CSIT')";
		//("+roll_num",'"+fullname+"','"+address+"','"+gender+"','"+course+"')";
		String sql="DELETE from student roll_num="+roll_nu
	}catch(SQLException e){
		e.printStackTrace();//show all information
	}
	System.out.println("Inserted!!");
	
	}
	
}