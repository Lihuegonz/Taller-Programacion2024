
package ParcialTurnoF2023;

public class Encargado extends Empleado {
    private int cantEmpleados;
    public Encargado (int unCantE,String unNom, int unDni, int unAñoing, double unSueldoBasico){
        super(unNom,unDni,unAñoing,unSueldoBasico);
        this.setCantEmpleados(unCantE);
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    @Override
    public String toString() {
        return "Encargado - " + super.toString() +  " cantidad de Empleados : " + cantEmpleados;
    }
    public double Sueldo (){
        return (this.getCantEmpleados()*1000);
    }
}
