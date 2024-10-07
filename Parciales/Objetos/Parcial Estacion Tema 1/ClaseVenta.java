package ParcialEstacionServicioTema1;

public class Venta {
    private int dniCliente;
    private int litroscargados;
    private double monto;
    private String medioPago;
    public Venta (int unDni,int unosLitros,String unMedioP){
        setDniCliente(unDni);
        setLitroscargados(unosLitros);
        setMedioPago(unMedioP);
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setLitroscargados(int litroscargados) {
        this.litroscargados = litroscargados;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public double getMonto() {
        return monto;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public int getLitroscargados() {
        return litroscargados;
    }

    @Override
    public String toString() {
        return "| Dni del Cliente :" + getDniCliente() + "| litroscargados : " + getLitroscargados() + "| monto : " + getMonto() + " | ";
    }

}
