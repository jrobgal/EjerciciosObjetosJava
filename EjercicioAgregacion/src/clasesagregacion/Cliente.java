package clasesagregacion;

public class Cliente {
    private int codigo;
    private String razonSocial;

    public Cliente(int codigo, String razonSocial) {
        setCodigo(codigo);
        setRazonSocial(razonSocial);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }
}
