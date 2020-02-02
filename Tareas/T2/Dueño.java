/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_tarea2java;

/**
 *
 * @author aaron
 */
public class Dueño {
    private String ID;
    private int total;
    private String Nombre;

    public Dueño(String ID, int total, String Nombre) {
        this.ID = ID;
        this.total = total;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   
    

    public Dueño() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
