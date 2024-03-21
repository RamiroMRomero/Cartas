
package cartas;

public class Carta {
    private PaloEnum Palo;
    private int numero;

    @Override
    public String toString() {
        return "Carta{" + "Palo=" + Palo + ", numero=" + numero + '}';
    }

    public PaloEnum getPalo() {
        return Palo;
    }

    public int getNumero() {
        return numero;
    }

    public Carta(PaloEnum Palo, int numero) {
        this.Palo = Palo;
        this.numero = numero;
    }
    
    
}
