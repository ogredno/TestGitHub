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

    public void setStaff(String name, String surname, String post, int salary) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.salary = salary;
    }




    public String output(int i) {
        return i+" " + name + " "+ surname +" " + post + " " + salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}




