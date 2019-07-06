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
public class Person {
    private String nombre;
    private String id;
    private ArrayList<Pet> mascotas= new ArrayList<>();
    

    public Person(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pet> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Pet> mascotas) {
        this.mascotas = mascotas;
    }

    

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", id=" + id + '}';
    }
   
}
