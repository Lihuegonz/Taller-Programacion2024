
package ParcialEstacionServicioTema1;
public class Demo_Estacion {
    public static void main(String[] args) {
        Estacion es = new Estacion("Rodriguez adolfo");
        Surtidor s1 = new Surtidor ("infinia",4000,10);
        Surtidor s2 = new Surtidor ("super",2000,15);
        Surtidor s3 = new Surtidor ("comun",1000,13);
        Surtidor s4 = new Surtidor ("infinitee",7000,4);
        es.agregarSurtidor(s1);
        es.agregarSurtidor(s2);
        es.agregarSurtidor(s3);
        es.agregarSurtidor(s4);
        es.generarVenta(1, 435234, 5, "efectivo");
        es.generarVenta(2, 435234, 10, "debito");
        es.generarVenta(3, 435234, 30, "efectivo");
        es.generarVenta(4, 435234, 2, "tarjeta");
        System.out.println(es.toString());
    }
}
