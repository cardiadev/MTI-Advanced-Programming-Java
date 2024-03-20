public class PruebaLista {
    public static void main(String args[]) {
        Lista lista = new Lista();
        try {
            lista.eliminarDelFinal();
        } catch (ExcepcionListaVacia excepcionListaVacia) {
            excepcionListaVacia.printStackTrace();
        }
    }
}

class ExcepcionListaVacia extends RuntimeException {
    public ExcepcionListaVacia() {
        super("Lista vacia");
    }
}

class Lista {
    Object Elementos[];
    int ultimo;

    public Object eliminarDelFinal() throws ExcepcionListaVacia {
        if (estaVacia())
            throw new ExcepcionListaVacia();
        ultimo--;
        return Elementos[ultimo];
    }

    public boolean estaVacia() {
        return true;
    }
}