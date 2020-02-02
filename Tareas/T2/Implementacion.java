/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_tarea2java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author aaron
 */
public class Implementacion {
    Scanner sca = new Scanner(System.in);
    ArrayList<Moneda> ltsMoneda = new ArrayList<Moneda>();
    ArrayList<Dueño> ltsPropietario = new ArrayList<Dueño>(); 
    Dueño monedero;
    int posM;
    int posP;
    public Implementacion() {
        //El dueño con Id 0 va ser el monedero
        monedero =  new Dueño("0",1,"Monedero");
        ltsPropietario.add(monedero);
    }
    //Metodo para crear una moneda
    public void crearMoneda(){
        int tamañoLst = ltsMoneda.size();
        String id = "Token"+tamañoLst;
        System.out.println("");
        System.out.println("-* Ingrese Nombre para la moneda");
        String nombre = sca.nextLine();
        Moneda moneda = new Moneda(id,nombre);
        monedero.setTotal(monedero.getTotal()+1);
        moneda.setDueño(monedero);
        ltsMoneda.add(moneda);
    }
    //Moteodo para ver el monedero
    public void verMonedero(){
        System.out.println("Las siguientes monedas pertenes al monedero:");
        for (Moneda moneda: ltsMoneda){
            int tamañoM =moneda.getDueños().size();
            if(tamañoM==1){
                String nombreM = moneda.getName();
                String idM = moneda.getId();
                System.out.println("");
                System.out.println("Moneda: Id= "+idM+" Nombre= "+nombreM);
                
            }
        }
    }
    //Metodo para crear Propietario
    public void crearPropietario(){
        System.out.println("Ingrese el nombre para el propietario");
        String nombreP = sca.nextLine();
        String id = "Per"+(ltsPropietario.size());
        Dueño propietario = new Dueño(id,0,nombreP);
        ltsPropietario.add(propietario);
    }
    //Metodo para ver los propietarios
    public void verPropietarios(){
        for(Dueño d: ltsPropietario){
            if(d.getID()!="0"){
                System.out.println(d.getNombre()+" Con Id: "+d.getID()+" Tiene "+d.getTotal()+" Monedas");
            }
        }
    }
    //Metodo para buscar propietario
    public void searchPropietario(){
        System.out.println("Ingrese Id de propietario a buscar");
        String idB= sca.nextLine();
        boolean vr=true;
        for(Dueño d: ltsPropietario){
            if(d.getID().equals(idB)){
                System.out.println("");
                System.out.println("--> "+d.getNombre()+" Con Id: "+d.getID()+" Tiene "+d.getTotal()+" Monedas");
                vr=false;
            }
        }
        if(vr){System.out.println("No se encontro propietario con este Id");}
    }
    //Metodo para transferir de mondero 
    public void trasmferirMP(){
        System.out.println("Ingrese el Id de la moneda disponible en el monedero");
        String idM = sca.nextLine();
        System.out.println("Ingrese el Id del propietario a quien quiera transferir");
        String idP = sca.nextLine();
        
        if(vrM(idM) && vrP(idP)){
          ltsMoneda.get(posM).getDueños().add(ltsPropietario.get(posP));
          ltsPropietario.get(posP).setTotal(ltsPropietario.get(posP).getTotal()+1);
            System.out.println("");
            System.out.println("<<< Transferencia con exito>>>");
        }else{System.out.println("La moneda o el propietario no existen");}
        
    }
    //Metodo para transferir de propietario a propietario
    public void transferirPP(){
        int posicion,posicion2,cantidad=0;
        boolean v1,v2;
        System.out.println("Ingrese el Id del propietario que quiere transferir");
        String id1= sca.nextLine();
        System.out.println("Ingrese el Id del propietario que quiere recibir");
        String id2=sca.nextLine();
        System.out.println("Ingrese cantidad de monedas a transferir");
        try{
             cantidad = sca.nextInt();
        }catch(Exception e){System.out.println("Ingrese un numero entero");}
        v1=vrP(id1);
        posicion=posP;
        v2=vrP(id2);
        posicion2=posP;
        if(v1 && v2){
            if(cantidad <= ltsPropietario.get(posicion).getTotal()){
                ltsPropietario.get(posicion).setTotal(ltsPropietario.get(posicion).getTotal()-cantidad);
                ltsPropietario.get(posicion2).setTotal(ltsPropietario.get(posicion2).getTotal()+cantidad);
                int contador=cantidad;
                for(Moneda m: ltsMoneda){
                    int tamañom= m.getDueños().size();
                    if(m.getDueños().get(tamañom-1).getID().equals(ltsPropietario.get(posicion).getID())){
                        if(cantidad>0){
                            m.getDueños().add(ltsPropietario.get(posicion2));
                        }
                        contador--;
                    }
                }
                System.out.println("");
                System.out.println("Transferencia terminada");
            }else{System.out.println("No hay monedas sufientes para transferir");}
        }else{System.out.println("Algo de los propietarios no existe");}
        
    }
    public boolean vrM(String m){
        boolean vrt=false;
        int contador=0;
        for(Moneda mo: ltsMoneda){
            int tamañomo = mo.getDueños().size();
            if(tamañomo==1){
                if(mo.getId().equals(m)){vrt=true; posM=contador; }
            }
            contador++;
        }
        return vrt;
    }
    public boolean vrP(String p){
        int contador=0;
     boolean vrt=false;
     for(Dueño d: ltsPropietario){
         if(d.getID().equals(p)){ vrt=true; posP=contador;}
         contador++;
     }
     return vrt;
    }
    
    public void verMonedas(){
    for(Moneda m: ltsMoneda){
        int tamañom=m.getDueños().size();
        System.out.print("La moneda: "+m.getName()+" con Id: "+m.getId()+" Tiene como propietario: "+m.getDueños().get(tamañom-1));
        
    }
    }
}
