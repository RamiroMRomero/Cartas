
package cartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> monton;
    
    public Baraja() {
        mazo = new ArrayList<Carta>();
        monton = new ArrayList<Carta>();
        
        for (PaloEnum palo : PaloEnum.values()) {
            for (int i=1; i<=12; i++) {
                if (i==8) {
                    i+=2; //Nos salteamos el 8 y el 9 del mazo
                }
                Carta carta = new Carta(palo, i);
                mazo.add(carta);
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(mazo);
    }
    
    public Carta siguienteCarta() {
        //muestra la siguiente carta y la manda al monton
        Carta carta;
        if(this.cartasDisponibles()==0){
            System.out.println("mazo vacio");
            return null;
        }else{
            carta=mazo.get(0);
            mazo.remove(carta);
            monton.add(carta);
            return carta;
        }
    }
    
    public int cartasDisponibles() {
        //muestra el numero de cartas disponibles en la baraja
        return mazo.size();
    }
    
    public ArrayList<Carta> darCartas(int cantidad) {
        //llama a cartas disponibles para ver si tenemos la cantidad solicitada
        //si no tenemos las suficientes mandamos un mensaje diciendo que no alcanzan las cartas
        //no hacemos nada
        //si alcanzan las cartas llamamos a siguienteCarta la cantidad de veces solicitadas
        
        ArrayList<Carta> mano = new ArrayList<>();
        
        if(cantidad <= 0){
            System.out.println("Solicite más de cero cartas");
            
        }
        else if(this.cartasDisponibles() < cantidad){
            System.out.println("No hay suficientes cartas");
        }
        else{
            for (int i = 0; i < cantidad; i++) {
                Carta carta = this.siguienteCarta();
                System.out.println(carta.toString());
                mano.add(carta);
            }
        }
        
        return mano;
        
    }
    
    public void cartasMonton() {
        //muestra las cartas que ya han sido descartadas
        //si no hay cartas en el monton indicar que no hay cartas en el monton
        if (cartasDisponibles() <= 0){
            System.out.println("No hay cartas en el monton");
        }else{
            for (Carta carta : monton) {
                System.out.println(carta.toString());
            }
        }
    }
    
    public void mostrarBaraja() {
        //no llama a siguiente carta ya que no se deben pasar al monton
        //llama a cartasDisponibles
        if (cartasDisponibles() <= 0){
            System.out.println("No quedan cartas en el mazo");
        }else{
            for (Carta carta : mazo) {
                System.out.println(carta.toString());
            }
        }
    }
}

