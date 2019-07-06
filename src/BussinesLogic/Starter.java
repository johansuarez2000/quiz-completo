/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinesLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
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
        
        File lectura=new File("pets.txt");
        Scanner flujoEntrada=null;     
        String linea=null;
        flujoEntrada=new Scanner(lectura);
        ArrayList<Pet> mascotas= new ArrayList<>();
        ArrayList<Person> dueños= new ArrayList<>();
        int i=0;
        int y=0;
        Veterinaria v1= new Veterinaria("mi casita", mascotas);
        
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
                 Person x= new Person(parts[0],parts[1]);
                 mascotas.get(i).setDueño(x);
                 dueños.add(x);  
                 
             }
         i++;
        }
        for (int j = 0; j < dueños.size(); j++) {
            for (int k = 0; k < dueños.size(); k++) {
                if(j==k){
                }else if(dueños.get(j).getId().equals(dueños.get(k).getId())){
                    dueños.remove(k);
                }else{                   
                }
            }
    }
      
         
    System.out.println("Bienvenidos a la veterinaria " + v1.getNombre() );  
    System.out.println("Que desea hacer \nA:remover una mascota\nB:listar las mascotas dado su tipo\nC:Finalizar el programa ");    
    String tipo;
    Scanner entrada1= new Scanner(System.in);
    tipo= entrada1.nextLine();   
    int x= 0;
    while(x==0){
    tipo=tipo.toUpperCase();
    if(tipo.equals("A")){
        System.out.println("Ingrese el id de la mascota");
        
        String id;
        Scanner entrada2= new Scanner(System.in);
        id= entrada2.nextLine();
       
        for (int j = 0; j < mascotas.size(); j++) {
            if(mascotas.get(j).getId().equals(id)){
                mascotas.remove(j);                
            }
        } 
         try{
            PrintWriter salida= new PrintWriter("pets.txt");            
             for (int j = 0; j < mascotas.size(); j++) {
                 salida.print(mascotas.get(j).guardarMemoria());
             }
            salida.close();
        }catch(FileNotFoundException e){
            
        }                
        System.out.println("¿Que desea hacer ahora?");
        System.out.println("Que desea hacer \nA:remover una mascota\nB:listar las mascotas dado su tipo\nC:Finalizar el programa ");
        String accion;
        Scanner action= new Scanner(System.in);
        accion= action.nextLine();
        tipo=accion;
        
    }else if (tipo.equals("B")) {
    System.out.println("elija el tipo de mascota que desea ver:\nsi el tipo es perro escriba 1\nsi el tipo es gato escriba 2\nsi el tipo es hamster escriba 3 ");
    String tipe;
    Scanner entrada3= new Scanner(System.in); 
    tipe=entrada3.nextLine();
        if (tipe.equals("1")) {
            for (int j = 0; j < mascotas.size(); j++) {
                if(mascotas.get(j).getClass().getSimpleName().equals("Dog")){
                    System.out.println(mascotas.get(j).toString());
                }
            }
        }else if(tipe.equals("2")) {
            for (int j = 0; j < mascotas.size(); j++) {
                if(mascotas.get(j).getClass().getSimpleName().equals("Cat")){
                    System.out.println(mascotas.get(j).toString());
                }
            }
    }else if(tipe.equals("3")) {
            for (int j = 0; j < mascotas.size(); j++) {
                if(mascotas.get(j).getClass().getSimpleName().equals("Hamster")){
                    System.out.println(mascotas.get(j).toString());
                }
            }
    }
        System.out.println("¿Que desea hacer ahora?");
        System.out.println("Que desea hacer \nA:remover una mascota\nB:listar las mascotas dado su tipo\nC:Finalizar el programa ");
        String accion;
        Scanner action= new Scanner(System.in);
        accion= action.nextLine();
        tipo=accion;
    }else {     
        x++;
    }
    }
    for (int j = 0; j < mascotas.size(); j++) {
          for (int k = 0; k < dueños.size(); k++) {
              if(mascotas.get(j).getDueño().getId().equals(dueños.get(k).getId())){
                  dueños.get(k).getMascotas().add(mascotas.get(j));
              }
              
          }
    }      
}
}

