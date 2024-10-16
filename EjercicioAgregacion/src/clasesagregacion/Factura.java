package clasesagregacion;

import java.util.ArrayList;

public class Factura extends Comprobante{
    private float total;
    private Cliente mCliente;
    private ArrayList<Producto> mProducto = new ArrayList<>();

    public Factura(char tipo, int numero, Fecha fecha, Cliente cliente) {
        super(tipo, numero, fecha);
        setCliente(cliente);
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setCliente(Cliente cliente) {
        this.mCliente = cliente;
    }

    public Cliente getCliente() {
        return mCliente;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.mProducto = producto;
    }

    public ArrayList<Producto> getProducto() {
        return mProducto;
    }

    public void agregarProducto(Producto p) {
        mProducto.add(p);
        setTotal(getTotal() + p.getPrecio());
    }

    
}
