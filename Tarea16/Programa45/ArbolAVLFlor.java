package Tarea16.Programa45;

public class ArbolAVLFlor {
    private NodoAVLFlor raiz;

    public int altura(NodoAVLFlor nodo) {
        return (nodo == null) ? -1 : nodo.altura;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private NodoAVLFlor rotarIzquierda(NodoAVLFlor nodo) {
        NodoAVLFlor nuevaRaiz = nodo.izquierdo;
        nodo.izquierdo = nuevaRaiz.derecho;
        nuevaRaiz.derecho = nodo;
        nodo.altura = max(altura(nodo.izquierdo), altura(nodo.derecho)) + 1;
        nuevaRaiz.altura = max(altura(nuevaRaiz.izquierdo), nodo.altura) + 1;
        return nuevaRaiz;
    }

    private NodoAVLFlor rotarDerecha(NodoAVLFlor nodo) {
        NodoAVLFlor nuevaRaiz = nodo.derecho;
        nodo.derecho = nuevaRaiz.izquierdo;
        nuevaRaiz.izquierdo = nodo;
        nodo.altura = max(altura(nodo.izquierdo), altura(nodo.derecho)) + 1;
        nuevaRaiz.altura = max(altura(nuevaRaiz.derecho), nodo.altura) + 1;
        return nuevaRaiz;
    }

    public NodoAVLFlor insertar(Flor flor, NodoAVLFlor nodo) {
        if (nodo == null) {
            nodo = new NodoAVLFlor(flor);
            if (raiz == null)
                raiz = nodo;
        } else if (flor.clave <= nodo.flor.clave) {
            nodo.izquierdo = insertar(flor, nodo.izquierdo);
            int fe = altura(nodo.izquierdo) - altura(nodo.derecho);
            if (fe == 2) {
                if (flor.clave < nodo.izquierdo.flor.clave)
                    nodo = rotarIzquierda(nodo);
                else {
                    nodo.izquierdo = rotarDerecha(nodo.izquierdo);
                    nodo = rotarIzquierda(nodo);
                }
            }
        } else {
            nodo.derecho = insertar(flor, nodo.derecho);
            int fe = altura(nodo.derecho) - altura(nodo.izquierdo);
            if (fe == 2) {
                if (flor.clave > nodo.derecho.flor.clave)
                    nodo = rotarDerecha(nodo);
                else {
                    nodo.derecho = rotarIzquierda(nodo.derecho);
                    nodo = rotarDerecha(nodo);
                }
            }
        }
        nodo.altura = max(altura(nodo.izquierdo), altura(nodo.derecho)) + 1;
        return nodo;
    }

    public void insertar(Flor flor) {
        raiz = insertar(flor, raiz);
    }

    public void enOrden(NodoAVLFlor nodo) {
        if (nodo != null) {
            enOrden(nodo.izquierdo);
            System.out.println(nodo.flor);
            enOrden(nodo.derecho);
        }
    }

    public void mostrar() {
        enOrden(raiz);
    }

    public Flor buscar(int clave, NodoAVLFlor nodo) {
        if (nodo == null)
            return null;
        if (clave == nodo.flor.clave)
            return nodo.flor;
        if (clave < nodo.flor.clave)
            return buscar(clave, nodo.izquierdo);
        else
            return buscar(clave, nodo.derecho);
    }

    public Flor buscar(int clave) {
        return buscar(clave, raiz);
    }
}
