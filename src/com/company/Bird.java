package com.company;
import java.io.*;
import java.math.*;
public class Bird {
    int xBox, yBox;
    // The method that we can set in the next lines
    double fly(int x, int y){
        double distance = Math.sqrt(x*x + y*y);
        this.xBox = x;
        this.yBox = y;
        return distance; // Making the Decisions. //
    }
}
