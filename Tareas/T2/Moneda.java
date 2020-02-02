/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_tarea2java;

import java.util.ArrayList;

/**
 *
 * @author aaron
 */
public class Moneda {
    private String Id;
    private String name;
    private ArrayList<Dueño> dueños = new ArrayList<Dueño>();

    public Moneda(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Dueño> getDueños() {
        return dueños;
    }

    public void setDueños(ArrayList<Dueño> dueños) {
        this.dueños = dueños;
    }
    public void setDueño(Dueño dueño){
        this.dueños.add(dueño);
    }
    
    
    
    
}
