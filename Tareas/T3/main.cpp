/* 
 * File:   main.cpp
 * Author: aaron
 *
 * Created on 6 de febrero de 2020, 06:34 PM
 */

#include <cstdlib>
#include <iostream>
using namespace std;

/*
 * 
 */
void procedimiento();
void insertarAlumno();
bool v=true;





class Alumno{
    private: 
    string name;
    int carne; 
    
    public:
        Alumno(string, int);
        void setName(string);
        void setCarne(int);
        string getName();
        int getCarne();
        
};

void Alumno::setName(string _name){
    name = _name;
}

void Alumno::setCarne(int _carne){
    carne = _carne;
}

string Alumno::getName(){
    return name;
}

int Alumno::getCarne(){
    return carne;
}

Alumno::Alumno(string _name, int _carne){
    name = _name;
    carne = _carne;
}

class Nodo{
public:
    Alumno alumno;
    Nodo* next;
    Nodo (Alumno _alumno) : alumno(_alumno), next(NULL) {}
};
class procesos{
public:
    Nodo* first = NULL;
    void agregarFirst(Alumno a){
        Nodo* temporal = new Nodo(a);
        temporal -> next = first;
        first=temporal;
    }
    
    void ver(){
        Nodo* temporal = first;
        while(temporal !=NULL){
            cout<< temporal->alumno.getCarne() <<endl;
            temporal = temporal ->next;
        }
        
    }
    
    void buscar(int c){
        Nodo* temporal = first;
        while(temporal !=NULL){
            if(temporal->alumno.getCarne()==c){
                cout<<"El carne es:";
                cout<<temporal->alumno.getCarne()  <<endl;
                cout<<"El nombre es:"+ temporal->alumno.getName() <<endl;
                return;
            }
            temporal = temporal ->next;
            
        }
        cout<<"No se encontro ningun alumno con este carne"<<endl;
    }
    
    void eliminar(int c){
        Nodo* temporal = first;
        while(temporal !=NULL){
            if(temporal->alumno.getCarne()==c){
                first = temporal->next;
                return;
            }
            temporal = temporal ->next;
            
        }
        cout<<"No se encontro ningun alumno con este carne"<<endl;
    }
};
procesos *lista = new procesos();
int main() {
    cout<<"Welcome to sis assistant" << endl;
    cout<<""<<endl;
    do{
        procedimiento();
    }while(v);
}

void procedimiento(){
     int seleccion;
    
    cout<<"1. Insertar Estudiante"<<endl;
    cout<<"2. Eliminar Estudiante"<<endl;
    cout<<"3. Buscar Estudiante"<<endl;
    cout<<"4. Salir"<<endl;
    cin>>seleccion;
    
    switch(seleccion){
        case 1:
            cout<<""<<endl;
            insertarAlumno();
            break;
        case 2: 
            int p;
            cout<<"Ingrese el carne de la persona a buscar"<<endl;
            cin>>p;
            cout<<""<<endl;
            lista->eliminar(p);
            break;
        case 3:
            int c;
            cout<<"Ingrese el carne de la persona a buscar"<<endl;
            cin>>c;
            cout<<""<<endl;
            lista->buscar(c);
            break;
        case 4: 
            v=false;
            break;
        case 5:
            lista->ver();
            break;
        default:
            cout<<"Se ingreso un dato incorrecto"<<endl;
            break;
    }
}

void insertarAlumno(){
    int IdA;
    string name;
    cout<<"Ingrese el Id del alumno (Numero entero)"<<endl;
    cin>> IdA;
    cout<<"Igrese el nombre del alumno"<<endl;
    cin>> name;
    Alumno alumno(name,IdA);
    lista->agregarFirst(alumno);
    cout<<""<<endl;
}
