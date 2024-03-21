
package cartas;

public class Carta {
    private PaloEnum palo;
    private int numero;

    @Override
    public String toString() {
        return "Carta{" + "Palo=" + palo + ", numero=" + numero + '}';
    }

    public PaloEnum getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public Carta(PaloEnum palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    
    
}
