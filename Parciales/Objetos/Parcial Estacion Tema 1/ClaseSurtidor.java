
package ParcialEstacionServicioTema1;

public class Surtidor {
    private String combustible;
    private double precioxlitro;
    private Venta [] ventas;
    private int maxVentas;
    private int cantVentas;
    public Surtidor(String unCombu, double unPrecioxlitro, int v){
        setCombustible(unCombu);
        setPrecioxlitro(unPrecioxlitro);
        setMaxVentas(v);
        this.cantVentas = 0;
        ventas = new Venta[this.maxVentas];
        for(int i=0;i<getMaxVentas();i++)
            this.ventas[i] = null;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setPrecioxlitro(double precioxlitro) {
        this.precioxlitro = precioxlitro;
    }

    public void setMaxVentas(int maxVentas) {
        this.maxVentas = maxVentas;
    }

    public int getMaxVentas() {
        return maxVentas;
    }

    public int getCantVentas() {
        return cantVentas;
    }
    
    public boolean hayEspacio(){
        return (getCantVentas()<getMaxVentas());
    }
    public void agregarVenta (int unDni, int unaCantL,String unMedioPago){
        if(hayEspacio()){
         Venta v = new Venta(unDni,unaCantL,unMedioPago);
         this.ventas[this.cantVentas++] = v;
        }
        else
            System.out.println("este surtidor tiene un maximo de ventas");
    }

    public String getCombustible() {
        return combustible;
    }
    
    public double sumaMonto (){
        int suma = 0;
        for(int i=0;i<getCantVentas();i++)
            if(this.ventas[i].getMedioPago().equals("efectivo"))
                suma = suma + this.ventas[i].getLitroscargados();
        return (getPrecioxlitro() * suma);    
    }

    public double getPrecioxlitro() {
        return precioxlitro;
    }
    public String concatenadorVentas (){
        String aux = new String();
        for(int i=0;i<getCantVentas();i++)
            aux+= "Venta nro " + (i+1) + this.ventas[i].toString();
        return aux;    
    }
    @Override
    public String toString() {
        return "| Combustible : " + getCombustible() + "| precioxlitro " + getPrecioxlitro() + concatenadorVentas();
        
    }
}
