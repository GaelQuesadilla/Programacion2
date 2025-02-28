package Tarea5.Programa15;

public class ModeloSuma {

    private int multiplicador, multiplicando, res;

    private int multiplicacion(int m, int n) {
        if (m == 0) {
            return 0;
        }
        return n + multiplicacion(m - 1, n);
    }

    public void calcularMultiplicacion() {
        this.res = multiplicacion(this.multiplicando, this.multiplicador);
    }

    public int getRes() {
        return res;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }
}
