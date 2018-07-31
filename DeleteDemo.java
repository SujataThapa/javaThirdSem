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