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
public class Vertice {
    
    public int x,y,peso;
    public String name;
    public boolean air;
    

    public Vertice(String name,int x, int y, boolean air) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.air = air;
    }
    public Vertice(String name,int x, int y, boolean air,int peso) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.air = air;
        this.peso = peso;
        
    }
    
    
    
}
