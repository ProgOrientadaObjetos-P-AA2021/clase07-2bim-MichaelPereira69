/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author memaldonado28
 */
public class TransporteTransvia extends Transporte {

    private String transvia;

    public void establecerTransporteTransvia(String t) {
        transvia = t;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.50 + (0.50 * 0.6);

    }

    public String obtenerTrasporteTansvia() {
        return transvia;
    }
}
