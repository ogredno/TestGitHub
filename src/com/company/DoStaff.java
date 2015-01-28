package com.company;
import java.util.*;
/**
 * Created by Серёга on 28.01.2015.
 */
public class DoStaff {
    public static void main(String args[]){
        String name;
        String surname;
        String post;
        int salary;


        Scanner s=new Scanner(System.in);
        System.out.println("Input name and surname(space) : ");
        name=s.next(); surname=s.next();
        System.out.println(" Input post and salary(space): ");
        post=s.next(); salary=s.nextInt();
        Staff a=new Staff(name,surname,post,salary);
        System.out.println(a.output(1));


        FileWork.write("D://blog/a.txt", (a.output(1)));

    }

}
