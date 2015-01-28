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

        Staff a = new Staff();
        Scanner s=new Scanner(System.in);
        int i=0;
        while (true) {
            System.out.println("Input name and surname(space) : ");
            name = s.next();
            surname = s.next();
            if(name.length()==0 || surname.length()==0 ){
                break;
              }else
            System.out.println(" Input post and salary(space): ");
            post = s.next();
            salary = s.nextInt();
            if(post.length()==0 || salary<=0 ){
                break;
            }else
            i++;
            a.setStaff(name,surname,post,salary);
            FileWork.write("D://blog/a.txt", (a.output(i)));
        }



    }

}
