package com.company;
import java.lang.*;
public class Employ {
    private int Id;
    private String first_name;
    private String last_name;
    private double Salary;

    public Employ(){}; // Here is the empty method //
    public Employ(String fname, String lame,  double salary ){ // This is the settr method
        this.first_name = fname;
        this.last_name = lame;
        this.Salary = salary; // THis is the assigment in the context as the manner in all the manners

    }
    public int get_id(){
        return Id;
    }
    public String get_first_name(){
        return first_name;
    }

    public String get_last_name(){
        return last_name;
    }

    public double get_Salary(){
        return Salary;

    }
    // The last methods is the next methods in the context manner
}
