#include "ListaDoble.h"

#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

void ListaDoble::InsertarPrimero(char c){
    Nodo* aux = new Nodo(c);  
    if(primero==NULL){
        //Lista vacia 
        primero = aux;
        ultimo = aux;
    }else{
        aux->siguiente=primero;
        primero->atras=aux;
        primero=aux;
    }
}

void ListaDoble::VerL(){
    Nodo* temporal = ultimo;
    while(temporal !=NULL){
            cout<< temporal->c <<endl;
            temporal = temporal->atras;
        }
}