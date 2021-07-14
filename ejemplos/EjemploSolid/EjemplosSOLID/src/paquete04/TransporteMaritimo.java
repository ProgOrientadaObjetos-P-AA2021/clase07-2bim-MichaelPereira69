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
public class TransporteMaritimo extends Transporte {

    private String maritimo;

    public void establecerTransporteMaritimo(String m) {
        maritimo = m;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.70 + (0.70 * 0.7);

    }

    public String obtenerTrasporteMaritimo() {
        return maritimo;
    }

}
