/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
/*public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        ArrayList <Transporte> t = new ArrayList();
        t.add(bus);
        t.
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransporteBus(bus);
        tipos.establecerTransporteTaxi(taxi);
        tipos.establecerPromedioTarifas();
        
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}*/
public class Principal {

    public static void main(String[] args) {

        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia t3 = new TransporteTransvia();
        t3.establecerTransporteTransvia("Zamora");
        t3.obtenerTrasporteTansvia();
        t3.establecerTarifa();

        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerTransporteAereo("Avion");
        aereo.obtenerTrasporteAereo();
        aereo.establecerTarifa();
        
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerTransporteMaritimo("Yate");
        mar.obtenerTrasporteMaritimo();
        mar.establecerTarifa();
        
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(t3);
        lista.add(aereo);
        lista.add(mar);
        lista.add(bus);
        lista.add(taxi);

        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f",
                tipos.obtenerPromedioTarifas());

    }
}
