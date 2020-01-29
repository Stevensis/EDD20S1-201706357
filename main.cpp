/* 
 * File:   main.cpp
 * Author: aaron
 *
 * Created on 28 de enero de 2020, 05:10 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(void) {
    int m;
    cout << "Ingrese el tamaño de la matriz" << endl ;
    cin >> m;
    int matriz[m][m];
    for(int i=0;i<m;i+=1){
        for(int j=0;j<m;j+=1){
            if(i==0 || i==(m-1) ||j==0 || j==(m-1)){
              matriz[i][j]=1;
            }else{
                matriz[i][j]=0;
            }
        }
    }
    //imprimir matriz
    for(int i=0;i<m;i+=1){
        for(int j=0;j<m;j+=1){
            cout << matriz[i][j];
        }
        cout << "" << endl;
    }
}

