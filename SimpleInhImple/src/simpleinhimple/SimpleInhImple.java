package simpleinhimple;

import java.util.Scanner;
import java.lang.System;

public class SimpleInhImple
{
    public static void main(String a[])
    {
        System.out.println("Enter Student Name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Enter SEX");
        char sex = s.nextLine().charAt(0);
        System.out.println("Enter Age");
        int age = s.nextInt();
        System.out.println("Enter College");
        s.nextLine();//Clearing Buffer by moving it to next line
        String  clg = s.nextLine();
        System.out.println("Enter Branch");
        String br = s.nextLine();
        System.out.println("Enter Percentage");;
        Double percent = s.nextDouble();
        Student obj = new Student(br,percent,clg,name,sex,age);
        obj.display();
        
        
        System.out.println("Enter Employee Name");
        //Scanner s = new Scanner(System.in);
        s.nextLine();//Clearing Buffer by moving it to next line
        name = s.nextLine();
        System.out.println("Enter SEX");
        sex = s.nextLine().charAt(0);
        System.out.println("Enter Age");
        age = s.nextInt();
        System.out.println("Enter Company");
        s.nextLine();//clear buffer
        clg = s.nextLine();
        System.out.println("Enter Dept");
        s.nextLine();//clear buffer
        String dept = s.nextLine();
        System.out.println("Enter Basic");
        percent = s.nextDouble();
        Employee obj1 = new Employee(dept,clg,percent,name,sex,age);
        obj1.display();
    }
}
