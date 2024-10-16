package clasesagregacion;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }
}
