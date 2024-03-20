public class UsoDeExcepciones {
    public static void main(String args[]) {
        try {
            lanzaExcepcion();
        } catch (Exception exception) {
            System.err.println("\nLa excepcion se manejo en main");
        }
        noLanzaExcepcion();
    }

    public static void lanzaExcepcion() throws Exception {
        try {
            System.out.println("Metodo lanzaExcepcion()");
            throw new Exception(); // ¿Qué pasa si comento esta línea?
        } catch (Exception exception) {
            System.err.println("La excepcion se manejo en el metodo lanzaExcepcion()");
            throw exception; // ¿Qué pasa si comento esta línea?
        } finally {
            System.out.println("Se ejecuto finally en lanzaExcepcion()");
        }
    }

    public static void noLanzaExcepcion() {
        try {
            System.out.println("Metodo noLanzaExcepcion()");
        } catch (Exception exception) { // no se ejecuta
            System.err.println(exception);
        } finally {
            System.out.println("Se ejecuto finally en noLanzaExcepcion()");
        }
        System.out.println("Fin del metodo noLanzaExcepcion()");
    }
}
