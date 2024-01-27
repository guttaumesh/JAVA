import java.io.*;
import java.util.*;
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Mammal extends Animal
{
    void giveBirth()
    {
        System.out.println("Mammal is giving birth");
    }
}
class Dog extends Mammal
{
    void bark()
    
    {
        super.giveBirth();
        System.out.println("Dog is barking");
    }
}
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Dog obj=new Dog();
        obj.bark();
        obj.giveBirth();
        obj.eat();
    }
}