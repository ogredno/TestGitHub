package com.company;
import java.util.*;
/**
 * Created by серега on 27.01.2015.
 */
public class Staff {
    String name;
    String surname;
    String post;
    int salary;



    public Staff() {
        this.name = "Null";
        this.surname = "Null";
        this.post = "Null";
        this.salary = 0;
    }

    public Staff(String name, String surname, String post, int salary) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                  '}';
    }
}

    class DoStaff {
        public static void main(String args[]){
            String n;
            String sn;
            String p;
            int sal;


       Scanner s=new Scanner(System.in);
           System.out.println("Input name and surname(space) : ");
            n=s.next(); sn=s.next();
            System.out.println(" Input post and salary(space): ");
            p=s.next(); sal=s.nextInt();
            Staff a=new Staff(n,sn,p,sal);
            System.out.println(a);

        }
    }


