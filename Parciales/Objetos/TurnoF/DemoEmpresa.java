
package ParcialTurnoF2023;

public class DemoEmpresa {

    public static void main(String[] args) {
        Encargado enc1 = new Encargado(20,"dilan",45322,2000,3000);
        Encargado enc2 = new Encargado(5,"bran",41322,2010,4000);
        Encargado enc3 = new Encargado(35,"lean",44322,2000,1000);
        Encargado enc4 = new Encargado(10,"gero",43322,1998,3500);
        DirectorEjecutivo director = new DirectorEjecutivo(2000,"Lihuel",493222,1999,5000);
        int n = 7;
        Empresa emp = new Empresa("Pollos Hermanos","Buenos Aires",director,n);
        emp.asignarEncargado(1, enc1);
        emp.asignarEncargado(2, enc2);
        emp.asignarEncargado(5, enc3);
        emp.asignarEncargado(6, enc4);
        System.out.println(emp.toString());
    }
}
