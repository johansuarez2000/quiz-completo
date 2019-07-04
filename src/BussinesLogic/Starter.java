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
        
        
        String nameD=null;
        String nameP=null;
        int numid=0;
        String nombreP;
        File lectura=new File("pets.txt");
        Scanner flujoEntrada=null;
        ArrayList<Person> dueños= new ArrayList<>();
        ArrayList<Pet> mascotas= new ArrayList<>();
        Veterinaria casita=new Veterinaria("El amigo Fiel", mascotas);
        int e=0;
        
        String linea=null;
        flujoEntrada=new Scanner(lectura);
 
         while (flujoEntrada.hasNextLine())
        {
            linea=flujoEntrada.nextLine();
            
            
                String[] parts = linea.split(" ");
                if(parts.length<3){
                  for(int j=0; j<(parts.length-1);j++){
                     Person x= new Person(parts[0],parts[1]);
                           dueños.add(x);
                        }
                  
                      }
                else if(parts.length>3){
                    for (int i = 0; i <parts.length; i++) {
                    if(parts[0].equals("Dog")){                         
                        Dog perro=new Dog(parts[4],parts[1],parts[2],parts[3]);
                    mascotas.add(perro);
                }if(parts[0].equals("Cat")){
                    boolean x= false;
                    if("false".equals(parts[4])){
                        
                    }else if("true".equals(parts[4])){
                        x= true;
                    }
                    mascotas.add(new Cat(x,parts[1],parts[2],parts[3]));
                }if(parts[0].equals("Hamster")){;
                    mascotas.add(new Hamster(Double.parseDouble(parts[4]),parts[1],parts[2],parts[3]));
                }
                    }
          
               }
        }
    for (int i = 0; i < dueños.size(); i++) {
        for (int j = 0; j < dueños.size(); j++) {
            if(i==j){
                
            }            
            else if(dueños.get(i).getId().equals(dueños.get(j).getId())){
                dueños.remove(dueños.get(j));
            }
        }
    }
    while (e!=2) {          
    for (int i = 0; i < mascotas.size(); i++) {
        for (int j = 0; j < mascotas.size(); j++) {
            if(i==j){               
            }
            else if(mascotas.get(i).getName().equals(mascotas.get(j).getName())){
                mascotas.remove(mascotas.get(j));
            }
        }
    }
    e++;
    }
    
    System.out.println("Bienvenido a la veterinaria " + casita.getNombre() );
    System.out.println("¿que desea hacer?");
    System.out.println("Digite a para: mostrar las mascotas por tipo\nDigite b para: mostrar las mascotas registradas actualmente");
    String accion;
    Scanner entrada= new Scanner(System.in);
    accion= entrada.nextLine();
    if(accion.equals("a")){
        System.out.println("si quiere ver los perros digite a\nsi quiere ver los Gatos digite b\nsi quiere ver los Hamster digite c \n");
      String tipo;
      Scanner entrada1= new Scanner(System.in);
      tipo= entrada1.nextLine();
      if(tipo.equals("a")){
          System.out.println("los perros registrados son\n");
          for (int i = 0; i < mascotas.size(); i++) {
              if(mascotas.get(i).getClass().getCanonicalName().equals("starter.Dog")){
                  System.out.println(mascotas.get(i).getName()+" "+mascotas.get(i).getId()+" "+mascotas.get(i).getHairColor()+" "+ mascotas.get(i).toString());
          }  
          }
      }else if(tipo.equals("b")){
          System.out.println("los gatos registrados son\n");
          for (int i = 0; i < mascotas.size(); i++) {
              if(mascotas.get(i).getClass().getCanonicalName().equals("starter.Cat")){
                  System.out.println(mascotas.get(i).getName()+" "+mascotas.get(i).getId()+" "+mascotas.get(i).getHairColor()+" "+ mascotas.get(i).toString());
          }  
          }
      }else if(tipo.equals("c")){
          System.out.println("los Hamster registrados son\n");
          for (int i = 0; i < mascotas.size(); i++) {
              if(mascotas.get(i).getClass().getCanonicalName().equals("strater.Hamster")){
                  System.out.println(mascotas.get(i).getName()+" "+mascotas.get(i).getId()+" "+mascotas.get(i).getHairColor()+" "+ mascotas.get(i).toString());
          }  
          }
      }
    
    } else if(accion.equals("b")){
        for (int i = 0; i < mascotas.size(); i++) {
              
                  System.out.println(mascotas.get(i).getClass().getCanonicalName()+ " "+mascotas.get(i).getName()+" "+mascotas.get(i).getId()+" "+mascotas.get(i).getHairColor()+" "+ mascotas.get(i).toString());
            
          }
    }

}
}

        
        

