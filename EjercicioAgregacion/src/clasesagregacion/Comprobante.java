package clasesagregacion;

public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha;

    public Comprobante(char tipo, int numero, Fecha fecha) {
        setTipo(tipo);
        setNumero(numero);
        setFecha(fecha);
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
