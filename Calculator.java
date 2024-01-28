import java.io.*;
import java.util.*;
class Calculator1
{
int a,b;
void add(int x,int y)
{
a=x;
b=y;
int c=a+b;
System.out.println("addition: "+c);
}
void add(int x,int y)
{
a=x;
b=y;
int c=a-b;
System.out.println("subtraction: "+c);
}
void add(int x,int y)
{
a=x;
b=y;
int c=a*b;
System.out.println("multiplication: "+c);
}
void add(int x,int y)
{
a=x;
b=y;
int c=a/b;
System.out.println("division: "+c);
}
void add(int x,int y)
{
a=x;
b=y;
int c=a%b;
System.out.println("modulo division: "+c);
}
};
class Calculator
{
public static void main(String a[])
{
int a,b;
Scanner u=new Scanner(System.in);
Calculator1 c=new Calculator1();
System.out.println("enter any two integer values:");
a=u.nextInt();
b=u.nextInt();
c.add(a,b);
c.add(a,b);
c.add(a,b);
c.add(a,b);
c.add(a,b);
}
};

