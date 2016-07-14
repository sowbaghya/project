package ems;

import java.util.Scanner;


public class Bootclass {
public static void main(String args[])
{
System.out.println("Employee Management System");
System.out.println(" To add an employee enter '1'\n To modify an employee detail enter '2'\n To remove an employee detail enter '3'\n"
		+ " To search an employee detail enter '4'\n To display all the details of an employee enter '5' ");

Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
//System.out.println(n);
menuSelection(n);
}
public static void menuSelection(int n)
{
	switch(n)
	{
	case 1:
		AddEmployee();
	case 2:
		ModifyEmployee();
	case 3:
		RemoveEmployee();
	case 4:
		SearchEmployee();
	case 5:
		getAllEmployee();
	}
}
}
