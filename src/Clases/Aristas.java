/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author TheLokestraps
 */
public class Aristas {
   
    public Vertice Inicio,Fin;
    public int Peso;

    public Aristas(Vertice Inicio, Vertice Fin, int Peso) {
        this.Inicio = Inicio;
        this.Fin = Fin;
        this.Peso = Peso;
    }
    
}
