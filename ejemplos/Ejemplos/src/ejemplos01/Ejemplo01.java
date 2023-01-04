
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String miCiudad = obtenerCiudadMayuscula("Loja");
        System.out.printf("%s\n", miCiudad);
        
        
        //opcion 1
        String mensaje_R= obtenerNombre();
        System.out.printf("%s\n",mensaje_R);
        //opcion 2
        System.out.printf("%s\n",obtenerNombre());
        
    }
    
    
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    public static void obtenerMultiplicacion(int tabla, int limite){
        
    }
    
    public static String obtenerNombre(){
        return "Luis";
    }
    
    
}
