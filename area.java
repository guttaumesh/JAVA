import java.io.*;
import java.util.*;
class shape
{
int l,b,a,area;
public
void area(int a1)
{
a=a1;
area = a*a;
System.out.println("area of square:"+area);

}
void area(int a1,int b1)
{
l=a1;
b=b1;
area = l*b;
System.out.println("area of rectangle:"+area);
}
}
class area
{
public static void main(String a[])
{
    Scanner sc= new Scanner(System.in);
    shape s=new shape();
    s.area(12);
    s.area(12,12);
} 

}
