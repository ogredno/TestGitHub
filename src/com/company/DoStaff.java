package com.company;
import java.util.*;
/**
 * Created by Серёга on 28.01.2015.
 */
public class DoStaff {
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
