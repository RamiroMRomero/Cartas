
package cartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> monton;
    
    public Baraja() {
        
    }
    
    public void barajar() {
        Collections.shuffle(mazo);
    }
    
    public void siguienteCarta() {
        //muestra la siguiente carta y la manda al monton
    }
    
    public int cartasDisponibles() {
        //muestra el numero de cartas disponibles en la baraja
        return mazo.size();
    }
    
    public void darCartas(int Cantidad) {
        //llama a cartas disponibles para ver si tenemos la cantidad solicitada
        //si no tenemos las suficientes mandamos un mensaje diciendo que no alcanzan las cartas
        //no hacemos nada
        //si alcanzan las cartas llamamos a siguienteCarta la cantidad de veces solicitadas
    }
    
    public void cartasMonton() {
        //muestra las cartas que ya han sido descartadas
        //si no hay cartas en el monton indicar que no hay cartas en el monton
    }
    
    public void mostrarBaraja() {
        //no llama a siguiente carta ya que no se deben pasar al monton
        //llama a cartasDisponibles
    }
}

