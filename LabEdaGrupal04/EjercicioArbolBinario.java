import java.util.*;
public class EjercicioArbolBinario {
    public static void main(String[] args) {
        ArbolBinario<Integer> arbol = new ArbolBinario<>();
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de números que tendrá el árbol: ");
        int limite = sc.nextInt();

        System.out.println("Ingresar los números: ");
        for (int i = 0; i < limite; i++){
            int numero = sc.nextInt();
            arbol.insertar(numero);
        }

        System.out.println("Recorrido en preorden:");
        arbol.recorrerPreorden();
        System.out.println("\n\nRecorrido en inorden:");
        arbol.recorrerInorden();
        System.out.println("\n\nRecorrido en postorden:");
        arbol.recorrerPostorden();
    }
}

class NodoArbol<T extends Comparable<T>> {
    T dato;
    NodoArbol<T> hijoIzquierdo;
    NodoArbol<T> hijoDerecho;

    public NodoArbol(T dato) {
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
}

class ArbolBinario<T extends Comparable<T>> {
    NodoArbol<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(T dato) {
        raiz = insertarRecursivo(this.raiz, dato);
    }

    private NodoArbol<T> insertarRecursivo(NodoArbol<T> nodo, T dato) {
        if (nodo == null) {
            return new NodoArbol<>(dato);
        }

        int comparacion = dato.compareTo(nodo.dato);

        if (comparacion < 0) {
            nodo.hijoIzquierdo = insertarRecursivo(nodo.hijoIzquierdo, dato);
        } else if (comparacion > 0) {
            nodo.hijoDerecho = insertarRecursivo(nodo.hijoDerecho, dato);
        }

        return nodo;
    }

    public void recorrerPreorden() {
        recorrerPreordenRecursivo(raiz);
    }

    private void recorrerPreordenRecursivo(NodoArbol<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            recorrerPreordenRecursivo(nodo.hijoIzquierdo);
            recorrerPreordenRecursivo(nodo.hijoDerecho);
        }
    }

    public void recorrerInorden() {
        recorrerInordenRecursivo(raiz);
    }

    private void recorrerInordenRecursivo(NodoArbol<T> nodo) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.hijoIzquierdo);
            System.out.print(nodo.dato + " ");
            recorrerInordenRecursivo(nodo.hijoDerecho);
        }
    }

    public void recorrerPostorden() {
        recorrerPostordenRecursivo(raiz);
    }

    private void recorrerPostordenRecursivo(NodoArbol<T> nodo) {
        if (nodo != null) {
            recorrerPostordenRecursivo(nodo.hijoIzquierdo);
            recorrerPostordenRecursivo(nodo.hijoDerecho);
            System.out.print(nodo.dato + " ");
        }
    }
}