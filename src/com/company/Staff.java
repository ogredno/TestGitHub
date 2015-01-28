package com.company;

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




