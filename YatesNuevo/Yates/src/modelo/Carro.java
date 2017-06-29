
package modelo;

import java.util.ArrayList;

public class Carro {

    private ArrayList<Yate> inventario;
    private int presupuesto;

    public Carro() {
        this.inventario = new ArrayList<>();
        this.presupuesto=500000;
        
    }

    public ArrayList<Yate> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Yate> tienda) {
        this.inventario = tienda;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

}
