package castro.rodriguez.fernando.carros;

import java.util.ArrayList;

import castro.rodriguez.fernando.carros.Carro;

/**
 * Created by ISABELLA on 09/05/2017.
 */
public class Datos {
    private static ArrayList<Carro> lista = new ArrayList<Carro>();

    public static void guardar(Carro o) {
        lista.add(o);
    }

    public static ArrayList<Carro> getCarros() {
        return lista;
    }
}
