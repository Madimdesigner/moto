package UD4;

/**
 * Moto.java*
 */
public class Main {

    public static void main(String[] args) {
        //Variables:        
        Moto miMoto;
        int stockActual = 1000;
        int cantidadAcomprar = 100;
                
        //Establezco la cantidad del stock
        miMoto = new Moto("Ducati", "rojo", stockActual);

        
        comprar_motos(miMoto, cantidadAcomprar);

        //SE VISUALIZA RESULTADO       
        //-Se muestra resultado ...          
        System.out.println("\n- El stock actual de motos es: " + miMoto);
    }

    public static void comprar_motos(Moto miMoto, int cantidad) {
        //SE REALIZA COMPRA DE MOTOS
        //-Proceso de compra de motos...
        try {
            System.out.println("- Compra de motos:");
            miMoto.comprar(cantidad);
            System.out.println("\tSe han comprado: " + cantidad + " motos");
        } catch (Exception e) {
            System.out.println("\t"+e);
        }
    }
}