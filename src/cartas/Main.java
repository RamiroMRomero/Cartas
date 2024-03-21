
package cartas;

public class Main {
    public static void main(String[] args) {
        //Carta carta = new Carta(PaloEnum.Basto, 3);
        //System.out.println(carta.toString();); 
        Baraja baraja = new Baraja();
        
        baraja.mostrarBaraja();
        System.out.println("");
        
        baraja.barajar();
        
        baraja.mostrarBaraja();
        System.out.println("");
        
        baraja.darCartas(5);
        System.out.println("");
        
        baraja.cartasMonton();
        
    }
    
}
