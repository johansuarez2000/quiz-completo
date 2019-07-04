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

    public Dog(String raza, String id, String name, String hairColor, Person dueño) {
        super(id, name, hairColor, dueño);
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
    
    
}
