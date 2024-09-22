
package ParcialTurnoF2023;

public class Empresa {
    private String nombre;
    private String direccion;
    private DirectorEjecutivo director;
    private Encargado [] encargados;
    private int maxEncargados;
    public Empresa (String unNom, String unaDire,DirectorEjecutivo dire,int n){
        this.setNombre(unNom);
        this.setDireccion(unaDire);
        this.setDirector(dire);
        this.setMaxEncargados(n);
        this.encargados = new Encargado [n];
        for(int i = 0;i<this.getMaxEncargados();i++)
            this.encargados[i] = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public DirectorEjecutivo getDirector() {
        return director;
    }

    public void setDirector(DirectorEjecutivo director) {
        this.director = director;
    }

    public Encargado[] getEncargados() {
        return encargados;
    }

    public void setEncargados(Encargado[] encargados) {
        this.encargados = encargados;
    }

    public int getMaxEncargados() {
        return maxEncargados;
    }

    public void setMaxEncargados(int maxEncargados) {
        this.maxEncargados = maxEncargados;
    }
    public void asignarEncargado (int x,Encargado unEnca){
        if(encargados[x-1]==null)
            encargados[x-1] = unEnca;
        else
            System.out.println(" LA SUCURSAL NRO " +  x + " YA TIENE UN ENCARGADO asigne otra sucursal para el " + unEnca.toString());
    }
    @Override
    public String toString(){
        String aux = new String("Datos de la empresa - |Nombre : " + this.getNombre() + "| Direccion : " + this.getDireccion() + " | " +  this.getDirector().toString());
        for (int i=0;i<this.getMaxEncargados();i++){
            if(encargados[i] == null)
                aux+= "| No hay un encargado en la sucursal " + (i+1);
            else
                aux+= "| en el sucursal " + (i+1) + "| Se encuentra - " + this.encargados[i].toString();
        }
        return aux;
    }
}
