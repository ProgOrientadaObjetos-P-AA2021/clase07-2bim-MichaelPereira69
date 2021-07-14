/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author memaldonado28
 */
public class TransporteAereo extends Transporte {

    private String aereo;

    public void establecerTransporteAereo(String a) {
        aereo = a;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.69 + (0.60 * 0.6);
    }

    public String obtenerTrasporteAereo() {
        return aereo;
    }

}
