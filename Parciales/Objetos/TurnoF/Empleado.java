
package ParcialTurnoF2023;

public abstract class Empleado {
    private String nom;
    private int dni;
    private int añoIng;
    private double sueldoBasico;
    public Empleado(String unNom, int unDni, int unAñoing, double unSueldoBasico){
        this.setAñoIng(unAñoing);
        this.setDni(unDni);
        this.setNom(unNom);
        this.setSueldoBasico(unSueldoBasico);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAñoIng() {
        return añoIng;
    }

    public void setAñoIng(int añoIng) {
        this.añoIng = añoIng;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    @Override
    public String toString() {
        return "Nombre : " + this.getNom() + " DNI : " + this.getDni() + " sueldo a cobrar : " + this.sueldoaCobrar();
    }
    public abstract double Sueldo (); 
    public double sueldoaCobrar (){
        double comision = 0;
        if(this.getAñoIng()<=2003)
            comision = (this.getSueldoBasico()/100)*0.10;
        return (this.getSueldoBasico() + comision + this.Sueldo());
    }
}
