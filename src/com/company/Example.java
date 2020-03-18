package com.company;
import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception{
        Scanner scanner  = new Scanner(new File("/tmp//tmp/mozilla_erick-hdz1"));
        scanner.useDelimiter(",");
        // Here we can use the Tokenizer in a boolean control
        while (scanner.hasNext()){
            System.out.print(scanner.next());
        }
        scanner.close(); // Here we close the Scanner instance //

    }
}
