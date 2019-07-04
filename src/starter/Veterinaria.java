/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter;

import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Veterinaria {
    private String nombre;
    private ArrayList<Pet> mascotas;

    public Veterinaria(String nombre, ArrayList<Pet> mascotas) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void removePet(){
        
    }
    public void showPetsByTipe(){
        for (int i = 0; i < mascotas.size(); i++) {
        System.out.println(mascotas.get(i).getClass());
} 
    }
}
