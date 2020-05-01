/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2.datos_2;

/**
 *
 * @author JUNIOR
 */
public class Path {

    public Node origen;
    public Node destino;
    public int distancia;

    public Path(Node origen, Node destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public Node getOrigen() {
        return origen;
    }

    public Node getDestino() {
        return destino;
    }

}
