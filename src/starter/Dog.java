/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter;

/**
 *
 * @author Usuario
 */
public class Dog extends Pet {
    private String raza;

    public Dog(String raza, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.raza = raza;
    }
  

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String Sound() {
        return ("guau");
    }
   @Override
    public String toString() {
        return "Pet{" + "id=" + getId() + ", name=" + getName() + ", raza=" + getRaza() +", hairColor=" + getHairColor() + ", due\u00f1o=" + getDueño()+  '}';
    }

    @Override
    public String guardarMemoria() {
        return "Dog " + getId() + " " + getName()+ " "+ getHairColor()+" "+ getRaza()+"\n" + getDueño().getNombre() + " "+getDueño().getId()+"\n";
    }
}
