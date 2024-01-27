import java.io.*;
import java.util.*;
class PrintNumber
{
int a;
float b;
double c;
String d;
void print(int x)
{
a=x;
System.out.println("int"+ a);
}
void print(float x)
{
b=x;
System.out.println("float"+ b);
}
void print(double x)
{
c=x;
System.out.println("double"+ c);
}
void print(String x)
{
d=x;
System.out.println("String"+ d);
}
};
class Number 
{
public static void main(String a[])
{
Scanner u=new Scanner(System.in);
PrintNumber p=new PrintNumber();
String d=u.nextLine();
int s=u.nextInt();
float b=u.nextFloat();
double c=u.nextDouble();
p.print(s);
p.print(b);
p.print(c);
p.print(d);
}
};