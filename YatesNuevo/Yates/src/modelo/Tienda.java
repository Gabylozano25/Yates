
package modelo;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Yate> tienda;

    public Tienda() {
        tienda = new ArrayList();
    }

    public ArrayList<Yate> getLista() {
        return tienda;
    }

    public void agregarYate(Yate pYate) {
        tienda.add(pYate);
    }

}
