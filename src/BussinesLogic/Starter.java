/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinesLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Starter {
   
   
public static void main (String [] args) throws FileNotFoundException,IOException{
        
        
        String nameD=null;
        String nameP=null;
        File lectura=new File("pets.txt");
        Scanner flujoEntrada=null;
            
        
        String linea=null;
        flujoEntrada=new Scanner(lectura);
        
         while (flujoEntrada.hasNextLine())
        {
            linea=flujoEntrada.nextLine();
            
            
                String[] parts = linea.split(" ");
                if(parts.length>2){
                    nameD=parts[0];
           
                System.out.println(" "+nameD);
            
                }
                
            
            
        }
    }
    
}
