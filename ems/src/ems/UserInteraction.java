package ems;

import java.util.Scanner;

public class UserInteraction {
public void AddEmployee()
{
	Scanner scan =new Scanner(System.in);
	System.out.println("enter employee name");
	String name=scan.nextLine();
	System.out.println("enter employee kin id");
	String kinid=scan.nextLine();
	System.out.println("enter employee e-mail id");
	String emailid=scan.nextLine();
	System.out.println("enter employee phone number");
	Long phno=scan.nextLong();
	System.out.println("enter employee address");
    String address=scan.nextLine();
    System.out.println("enter employee date of birth");
    String dob=scan.next();
}
}
