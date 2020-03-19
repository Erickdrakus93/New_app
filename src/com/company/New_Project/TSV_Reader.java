package com.company.New_Project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutionException;

public class TSV_Reader {
    // Here we set a data ans instances as we can see in the next lines of the code
    //main
    public static void main(String[] args) throws Exception {
        StringTokenizer token;
        BufferedReader TSV_reader= new BufferedReader(new FileReader("cities_canada_usa.tsv"));
        String data_Row = TSV_reader.readLine();
        while (data_Row != null){
            token = new StringTokenizer(data_Row, "\t"); // Here we can set the token in a especific way
            List<String> data_Array = new ArrayList<String>(); // Here we can set them
            while(token.hasMoreElements()){
                data_Array.add(token.nextElement().toString());
            } // EndWhile
            for(String item:data_Array){
                System.out.print(item + "");
            }
            System.out.println();
            data_Row = TSV_reader.readLine();
        }// End While loop
        TSV_reader.close(); //Close All the manner as we can set in the next lines of the code //
        System.out.println();
    }//main
}// End TSV Reader

