/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.mb;

import co.vinni.dao.OperacionVeh;
import co.vinni.dto.Vehiculo;


/**
 *
 * @author Sala 30
 */

public class ArraqueMB {

    /**
     * Creates a new instance of ArraqueMB
     */
    public ArraqueMB() {
        
    }
    public String mensaje() {
        System.out.println(" Ingreso- - - - - - - - ");
        OperacionVeh oper = new OperacionVeh();
        int x = oper.crear(new Vehiculo());
        System.out.println(" Guuardo - - - - - - - - "+x);
        return "";
    }
}
