
package ParcialEstacionServicioTema1;

public class Estacion {
    private String direccion;
    private Surtidor [] surtidores;
    private int maxSurtidores;
    private int cantSurtidores;
    public Estacion (String unaDire){
        setDireccion(unaDire);
        setMaxSurtidores(6);
        this.cantSurtidores = 0;
        this.surtidores = new Surtidor[getMaxSurtidores()];
        for(int i=0;i<getMaxSurtidores();i++)
            this.surtidores[i] = null;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMaxSurtidores(int maxSurtidores) {
        this.maxSurtidores = maxSurtidores;
    }

    public int getMaxSurtidores() {
        return maxSurtidores;
    }

    public int getCantSurtidores() {
        return cantSurtidores;
    }
    
    public boolean hayEspacio(){
        return (getCantSurtidores()<getMaxSurtidores());
    }
    public void agregarSurtidor (Surtidor s){
        if(hayEspacio())
            this.surtidores[this.cantSurtidores++] = s;
        else
            System.out.println("esta estacion ya tiene un maximo de surtidores");
    }
    public void generarVenta (int n, int unDni, int unaCantL, String unmedioPago){
        this.surtidores[n-1].agregarVenta(unDni, unaCantL,unmedioPago);
    }
    public int posmaxRecaudo(){
       int i; int pos = 0; double sumaMax = -1; double sumaTot = 0;
        for (i=0;i<getCantSurtidores();i++){
            sumaTot = this.surtidores[i].sumaMonto();
            if(sumaTot>sumaMax){
                sumaMax = sumaTot;
                pos = i;
            }
        }
        return (pos+1);
    }

    public String getDireccion() {
        return direccion;
    }
    public String concatenador(){
        String aux = new String();
        for (int i=0;i<getCantSurtidores();i++)
            aux+= "| Surtidor " + (i+1) + this.surtidores[i].toString();
        return aux;    
    }
    @Override
    public String toString() {
        return "| Estacion de Servicio | " + " | direccion : " + getDireccion() + "| Cantidad de Surtidores : " + getCantSurtidores() + concatenador();
    }
}
