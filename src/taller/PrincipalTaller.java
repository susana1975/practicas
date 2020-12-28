
package taller;


public class PrincipalTaller {

    
    public static void main(String[] args) {
        Coche c1 = new Coche();
        
        c1.getMotor().arrancar();
        c1.getPuertaD().getVentana().abrir();
        c1.getRuedaTD().getPresion();
    }
    
}
