/* 
 * File:   main.cpp
 * Author: aaron
 *
 * Created on 10 de febrero de 2020, 05:35 PM
 */


#include <cstdlib>
#include <iostream>
#include <C:\Users\aaron\Documents\NetBeansProjects\Edd_Tarea4\ListaDoble.cpp>
#include <string>
using namespace std;

void procedimiento();
bool v = true;

int main(int argc, char** argv) {
    cout<<"Welcome to sis assistant" << endl;
    cout<<""<<endl;
    do{
        procedimiento();
    }while(v);
}
ListaDoble* lista = new ListaDoble();
void procedimiento(){
    int seleccion;
    
    cout<<"1. Insertar Carcater"<<endl;
    cout<<"2. Eliminar Ultimo Caracter"<<endl;
    cout<<"3. Buscar Palabra"<<endl;
    cout<<"4. Salir"<<endl;
    cin>>seleccion;
    switch(seleccion){
        case 1:
            cout<<""<<endl;
            char o;
            cout<<"Ingrese un caracter"<<endl;
            cin>>o;
            lista->InsertarPrimero(o);
            break;
        case 2: 
            int p;
            lista->EliminarUltimo();
            cout<<"Se elimino nodo"<<endl;
            cout<<""<<endl;
            
            break;
        case 3:
            char ca;
            cout<<"Ingrese palabra a buscar"<<endl;
            cin>>ca;
            cout<<""<<endl;
           // lista->Buscar(ca);
            break;
        case 4: 
            v=false;
            break;
        case 5:
            lista->VerL();
            break;
        default:
            cout<<"Se ingreso un dato incorrecto"<<endl;
            break;
    }
}

