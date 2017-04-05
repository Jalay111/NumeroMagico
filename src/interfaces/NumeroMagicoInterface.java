/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author JoelDavidº
 */
public interface NumeroMagicoInterface {
    public int nuevo(); //generar numero aleatorio.
    public int probar(int num); //validar si el numero es mayor, menor o igual.
    public int contador(); //devuelve el numero de intentos.
    public void salir(); //cierra sesion del usuario.
}
