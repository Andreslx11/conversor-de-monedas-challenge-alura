
/********************************************************************
 * IMPORTANTE aclaración es evidente esto no lo codifique
 * como necesitava usar un Pair para que en class interfaceUsuario
 * el switch me retorna dos valores y no queria  instalar javaFX
 * busque esto en internet copi pegue suplia la necesidad
 * ******************************************************************
 * */

public class Pair<A, B> {

    private final A first;
    private final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    // Opcionalmente, puedes sobrescribir los métodos equals(), hashCode() y toString()
    // dependiendo de tus necesidades.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + second.hashCode();
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}


