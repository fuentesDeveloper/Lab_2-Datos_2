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
        static void BellmanFord(int graph[][], int V, int E, 
                    int src) 
    { 
        // Initialize distance of all vertices as 0. 
        int []dis = new int[V]; 
        for (int i = 0; i < V; i++) 
            dis[i] = Integer.MAX_VALUE; 

        dis[src] = 0; 

        for (int i = 0; i < V - 1; i++)  
        { 

            for (int j = 0; j < E; j++)  
            { 
                if (dis[graph[j][0]] + graph[j][2] < 
                                dis[graph[j][1]]) 
                    dis[graph[j][1]] =  
                    dis[graph[j][0]] + graph[j][2]; 
            } 
        } 
        for (int i = 0; i < E; i++)  
        { 
            int x = graph[i][0]; 
            int y = graph[i][1]; 
            int weight = graph[i][2]; 
            if (dis[x] != Integer.MAX_VALUE && 
                    dis[x] + weight < dis[y]) 
                System.out.println("El grafo contiene ciclos negativos con "
                        +" costo"); 
        } 

        System.out.println("Distancia"); 
        for (int i = 0; i < V; i++) 
            System.out.println(i + "\t\t" + dis[i]); 
    } 
   
}
