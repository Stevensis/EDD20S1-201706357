
#ifndef LISTADOBLE_H
#define	LISTADOBLE_H
using  namespace std;
#include "Nodo.h"
#include <string>

class ListaDoble{
public:
    Nodo* primero = 0;
    Nodo* ultimo = 0;
    void InsertarPrimero(char c);
    void EliminarUltimo();
    void Buscar(string s);
    void VerL();
};
#endif	/* LISTADOBLE_H */

