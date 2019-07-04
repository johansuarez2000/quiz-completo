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
public abstract class Pet {
    private String id;
    private String name;
    private String hairColor;
    private Person dueño;

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;       
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public Person getDueño() {
        return dueño;
    }

    public void setDueño(Person dueño) {
        this.dueño = dueño;
    }   

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public abstract String Sound();

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + ", hairColor=" + hairColor + ", due\u00f1o=" + dueño + '}';
    }
        
    }

