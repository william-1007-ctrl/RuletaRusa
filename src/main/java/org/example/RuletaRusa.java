import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RuletaRusa {

    private List<Integer> tambor;
    private int bala;
    private int posicionActual;
    private Random random;

    public RuletaRusa() {
        this.tambor = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            this.tambor.add(i);
        }
        this.random = new Random();
        this.bala = this.random.nextInt(6);
        this.posicionActual = 0;
    }

    public RuletaRusa(List<Integer> tambor, int bala, int posicionActual) {
        this.tambor = tambor;
        this.bala = bala;
        this.posicionActual = posicionActual;
        this.random = new Random();
    }

    // Getters
    public List<Integer> getTambor() {
        return tambor;
    }

    public int getBala() {
        return bala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    // Setters
    public void setTambor(List<Integer> tambor) {
        this.tambor = tambor;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    @Override
    public String toString() {
        return "RuletaRusa{" +
                "tambor=" + tambor +
                ", bala=" + bala +
                ", posicionActual=" + posicionActual +
                '}';
    }

    // Método disparar()
    public boolean disparar() {
        if (posicionActual == bala) {
            return true;
        } else {
            posicionActual = (posicionActual + 1) % 6;
            return false;
        }
    }

    // Método reiniciarJuego()
    public void reiniciarJuego() {
        bala = random.nextInt(6);
        posicionActual = 0;
    }
}
