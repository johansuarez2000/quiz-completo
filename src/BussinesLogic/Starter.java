/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinesLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import starter.Cat;
import starter.Dog;
import starter.Hamster;
import starter.Person;
import starter.Pet;
import starter.Veterinaria;

/**
 *
 * @author Usuario
 */
public class Starter {
   
   
public static void main (String [] args) throws FileNotFoundException,IOException{
        
        
        
        int numid=0;
        File lectura=new File("pets.txt");
        Scanner flujoEntrada=null;     
        String linea=null;
        flujoEntrada=new Scanner(lectura);
        ArrayList<Pet> mascotas= new ArrayList<>();
        int i=0;
        
        while(flujoEntrada.hasNextLine()) {
            linea=flujoEntrada.nextLine();            
                String[] parts = linea.split(" ");
             if(parts[0].equals("Dog")){
                 mascotas.add(new Dog(parts[4], parts[1], parts[2], parts[3]));
             } else if(parts[0].equals("Cat")){
                 boolean hunter= false;
                 if(parts[4].equals("true")){
                     hunter=true;
                 }
                 mascotas.add(new Cat (hunter, parts[1], parts[2], parts[3]));
             }else if(parts[0].equals("Hamster")){
                 mascotas.add(new Hamster(Double.parseDouble(parts[4]), parts[1], parts[2], parts[3]));
             }
              else{
                 i=i-1;
                 mascotas.get(i).setDueño(new Person(parts[0],parts[1]));
             }  
             i++;
}
        for (int j = 0; j <mascotas.size(); j++) {
            System.out.println(mascotas.get(j));        
        }}}
