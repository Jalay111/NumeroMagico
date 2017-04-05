/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import interfaces.NumeroMagicoInterface;

/**
 *
 * @author JoelDavidº
 */
public class NumeroMagicoImplementacion implements NumeroMagicoInterface{
    int numeroMagico;
    int contador;

    public NumeroMagicoImplementacion() {
        this.numeroMagico = 0;
        this.contador = 0;
    }
    
    @Override
    public int nuevo() {
        numeroMagico = (int)(Math.random()*1000);
        contador = 0;
        return numeroMagico;
    }

    @Override
    public int probar(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
