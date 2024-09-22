
package ParcialTurnoF2023;

public class DirectorEjecutivo extends Empleado {
    private double montoViaticos;
    public DirectorEjecutivo (double unMontovia,String unNom, int unDni, int unAñoing, double unSueldoBasico){
        super(unNom,unDni,unAñoing,unSueldoBasico);
        this.setMontoViaticos(unMontovia);
    }

    public double getMontoViaticos() {
        return montoViaticos;
    }

    public void setMontoViaticos(double montoViaticos) {
        this.montoViaticos = montoViaticos;
    }
    public double Sueldo (){
        return this.getMontoViaticos();
    }

    @Override
    public String toString() {
        return " DirectorEjecutivo - " + super.toString() + " montoViaticos : " + montoViaticos + '}';
    }
    
}
