/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.*; 
import java.lang.*; 
import java.io.*;

/**
 *
 * @author TheLokestraps
 */
public class Grafo {
    
    public int CantidadV,CantidadA;
    public LinkedList<Vertice> Ver;
    public LinkedList <Aristas> Ari;
    public String Retornar1[],Retornar3[];
    public int Retornar2[];
    

    public Grafo() {
        CantidadV = CantidadA = 0;
        Ver = new LinkedList<>();
        Ari = new LinkedList<>();
    }
    
    
    
    public void agregarArista(Vertice NodoInicial, Vertice NodoFinal,int peso) {
       Ari.add(new Aristas(NodoInicial,NodoFinal,peso,true));
       Ari.add(new Aristas(NodoFinal,NodoInicial,peso,true));
       System.out.println(CantidadA);
       CantidadA = CantidadA+2;
    }
    public void agregarAristaSinC(Vertice NodoInicial, Vertice NodoFinal,int peso) {

       Ari.add(new Aristas(NodoInicial,NodoFinal,peso,false));
       Ari.add(new Aristas(NodoFinal,NodoInicial,peso,false));
       CantidadA = CantidadA+2;
        System.out.println(CantidadA);
    }
    
    public void agregarVertice(Vertice Nodo){
        Ver.add(Nodo);
        CantidadV++;
        System.out.println(CantidadV);
    }
    
    public int LocalizacionV(Vertice Search){
        int Inicio = 0;
        for (int i = 0; i < Ver.size() ; i++) {
            if(Ver.get(i).name.equals(Search.name)){
                Inicio = i;
            }
        }
        System.out.println("Retornar Inicio"+Inicio);
        return Inicio;
    }
    
    
    
    public void BellmanFord(Vertice Inicio) 
    { 
        int V = CantidadV , E = CantidadA; 
        int dist[] = new int[V];
        String Anterior[] = new String[V];
        String Nombres[] = new String[V];
        int cont = 0;
        for(Vertice Ve : Ver){
            Nombres[cont] = Ve.name;
            cont++;
        }
  
        // Step 1: Initialize distances from src to all other 
        // vertices as INFINITE 
        for (int i = 0; i < V; ++i) 
            dist[i] = Integer.MAX_VALUE;
        
        int Iniciar = -1;
        for (int i = 0; i < Ver.size() ; i++) {
            if(Ver.get(i).name.equals(Inicio.name)){
                Iniciar = i;
            }
        }
        
        dist[Iniciar] = 0;
        Anterior[Iniciar] = Ver.get(Iniciar).name;
  
        // Step 2: Relax all edges |V| - 1 times. A simple 
        // shortest path from src to any other vertex can 
        // have at-most |V| - 1 edges 
        for (int i = 1; i < V; i++) { 
            for (int j = 0; j < E; j++) { 
                System.out.println(E);
                int u =  LocalizacionV(Ari.get(j).Inicio); //graph.edge[j].src; 
                int v =  LocalizacionV(Ari.get(j).Fin);//graph.edge[j].dest; 
                int weight = Ari.get(j).Peso;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    Anterior[v] = Ari.get(j).Inicio.name;
                }
            } 
        } 
  
        // Step 3: check for negative-weight cycles. The above 
        // step guarantees shortest distances if graph doesn't 
        // contain negative weight cycle. If we get a shorter 
        // path, then there is a cycle. 
        for (int j = 0; j < E; ++j) { 
            int u = LocalizacionV(Ari.get(j).Inicio); 
            int v = LocalizacionV(Ari.get(j).Fin); 
            int weight = Ari.get(j).Peso; 
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) { 
                System.out.println("Graph contains negative weight cycle"); 
                return; 
            } 
        }
        Retornar1 = Anterior;
        Retornar2 = dist;
        Retornar3 = Nombres;
        
    } 
    
}
