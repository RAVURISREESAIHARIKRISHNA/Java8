package simpleinhimple;
import java.lang.System;
public class Person
{
    
    protected String name;
    protected char sex;
    protected int age;

    public Person(String name, char sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    public void display()
    {
        System.out.println("************");
        System.out.printf("NAME: %s\nSEX: %c\nAGE:%s\n",this.name,this.sex,this.age);
        System.out.println("************");
    }
}

class Student extends Person
{
    protected String branch;
    protected Double percent;
    protected String college;

    public Student(String branch, Double percent, String college, String name, char sex, int age)
    {
        super(name, sex, age);
        this.branch = branch;
        this.percent = percent;
        this.college = college;
    }
    
    public void display()
    {
        super.display();
        System.out.println("************");
        System.out.printf("BRANCH :%s\nCOLLEGE : %s\nPERCENTAGE :%f",this.branch,this.college,this.percent);
        System.out.println("\n************");
    }
}

class Employee extends Person
{
    protected String dept;
    protected String company;
    protected Double basic;

    public Employee(String dept, String company, Double basic, String name, char sex, int age)
    {
        super(name, sex, age);
        this.dept = dept;
        this.company = company;
        this.basic = basic;
    }
    
    public void display()
    {
        super.display();
        System.out.println("************");
        System.out.printf("\nCOMPANY:%s\nDEPT: %s\nBASIC:%f",this.company,this.dept,this.basic);
        System.out.println("\n************");
    }
}