
package cartas;

import static java.lang.System.console;

public class Main {
    public static void main(String[] args) {
        Carta carta = new Carta(PaloEnum.Basto, 3);
        System.out.println(carta.toString()); 
    }
    
}
