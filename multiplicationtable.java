/*Display a Multiplication Table: Write a Java program that displays the multiplication 
table of a given number. Ask the user for the number and print the table from 1 to 10.*/

import java.util.*;
class multiplicationtable
 {
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any integer to print multiplication table:\n");
	int a=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
	System.out.println(a+"*"+i+"="+(a*i)+"\n");
	}
	sc.close();
    }
 }
