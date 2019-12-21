/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author leannekim
 */

import java.io.*;

public class Main {
    public static void main(String[] args){
        File textFile = new File("assignment.txt");
        FileReader in;
        BufferedReader readFile;
        String lineOfText;
        
        try{
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            while ((lineOfText = readFile.readLine()) != null){
                System.out.println(lineOfText);
            }
            readFile.close();
            in.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File does not exist or can't be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
        catch(IOException e){
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}

