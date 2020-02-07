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
            break;
        case 3:
            break;
        case 4: 
            v=false;
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
