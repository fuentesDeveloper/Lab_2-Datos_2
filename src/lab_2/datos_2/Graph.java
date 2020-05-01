/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2.datos_2;

/**
 *
 * @author Martin Fuentes
 */
public class Graph {

    private int[][] Adyacentes;
    private Object[] info;
    private int nodos;
    private boolean vacio = true;

    public Graph(int numNodos) {
        Adyacentes = new int[numNodos][numNodos];
        for (int i = 0; i < numNodos; i++) {
            for (int j = 0; j < numNodos; j++) {
                Adyacentes[i][j] = 0;
                nodos = numNodos;
            }
        }

    }
    
    public boolean vacio(){return vacio;}

}
