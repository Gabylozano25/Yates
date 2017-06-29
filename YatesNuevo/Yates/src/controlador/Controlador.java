
package controlador;

import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import modelo.Tienda;
import modelo.Yate;
import vista.Carrito;


public class Controlador {

    private Tienda tienda;
    private Yate yate;

    
    public Controlador() {
        tienda = new Tienda();
        this.setUp();
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Yate getYate() {
        return yate;
    }

    public void setYate(Yate yate) {
        this.yate = yate;
    }

//    Agrega yates a la tienda.
    public void registrar() {
        if (yate != null) {
            tienda.agregarYate(yate);
            JOptionPane.showMessageDialog(null, "Registro realizado");
        } else {
            JOptionPane.showMessageDialog(null, "No hubo registro");
        }
    }

//    crea yate con cada atributo.
    public Yate crearYate(String modelo, int año, String tipo, String marca, int motor, boolean usado, int horasUso, double capAgua, double capTanque, double ancho, double alto, int numCam, double vMax, double vCru, double valor, int disponible) {
        Yate yate = null;

        if (modelo != null) {

            yate = new Yate(modelo, año, tipo, marca, motor, usado, horasUso, capAgua, capTanque, ancho, alto, numCam, vMax, vCru, valor, disponible);

            this.tienda.agregarYate(yate);

            JOptionPane.showMessageDialog(null, "Yate agregado");
        }
        return yate;
    }

//    agrega yates iniciales.
    public void setUp() {

        this.tienda.agregarYate(new Yate("W128", 2011, "Familiar", "Porsche", 1600, true, 2, 5.1, 6.4, 5.5, 10.1, 2, 60, 39, 30000, 1));
        this.tienda.agregarYate(new Yate("Y200", 2016, "Executive", "Lamborghini", 2000, false, 0, 10, 20, 20, 30, 5, 60, 39, 300000, 1));
    }

//  Comparator: 0 si los objetos son iguales
//   1 si yate 1 > yate 2 
//    -1 si yate1 < yate2

    public void ordenarPorValor() {
        Collections.sort(tienda.getLista(), new Comparator<Yate>() {

            public int compare(Yate yate1, Yate yate2) {

                return yate1.getValor() < yate2.getValor() ? -1
                        : yate1.getValor() == yate2.getValor() ? 0 : 1;
            }
        });

    }

    public void ordenarPorAño() {
        Collections.sort(tienda.getLista(), new Comparator<Yate>() {

            public int compare(Yate yate1, Yate yate2) {

                return yate1.getAño() < yate2.getAño() ? -1
                        : yate1.getAño() == yate2.getAño() ? 0 : 1;
            }
        });
    }


    public void Yate(String modelo, int año, String tipo, String marca, int motor, boolean usadolalala, int horasUso, double capAgua, double capTanque, int numCam, double VMax, double VCru, double valor, int disponiblelalala, String string, double ancho, double alto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
