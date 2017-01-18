/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Tiziano Toffenetti
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         Scanner lettore = new Scanner(System.in);
         FileWriter out;
         BufferedWriter buff_out;
         DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh/mm/ss");
         String str;
        try {
            
            
            out = new FileWriter("data/log.txt");
            buff_out = new BufferedWriter(out);
            do {
                System.out.print("Scrivi una stringa (per interrompere il programma premere invio): ");
                str = lettore.nextLine();
                
                for (int i = 0; i < str.length(); i++)
                    out.write(str.charAt(i));
                out.write('\n');
                
            } while (str.length() > 0);
            
            out.close();
            
        } catch (IOException exc) {
            System.out.println(exc);
        } 
        System.out.println("\nGrazie di aver usato il programma!");
    }
    }
    
