/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Tiziano
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         Scanner lettore = new Scanner(System.in);
        
        try {
            
            // apre il file in scrittura
            FileWriter file = new FileWriter(data/log.txt);
            String str;
            do {
                System.out.print("Scrivi una stringa (vuota per terminare): ");
                str = lettore.nextLine();
                
                for (int i = 0; i < str.length(); i++)
                    file.write(str.charAt(i));
                file.write('\n');
                
            } while (str.length() > 0);
            
            file.close();
            
        } catch (IOException exc) {
            System.out.println(exc);
        } 
        System.out.println("\nBye bye!");
    }
    }
    
