package clasesherencia;

public class Estudiante extends Persona{
    private String carrera;
    private int codigo;

    public Estudiante() {

    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
