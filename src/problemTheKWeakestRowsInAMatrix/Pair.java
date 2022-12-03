package problemTheKWeakestRowsInAMatrix;


public class Pair<L, R> {
    private final L left;
    private final R right;

    /**
     * Konstruktor
     * 
     * @param left linker Wert
     * @param right rechter Wert
     */
    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 
     * @return Liefert den linken Wert des Paars.
     */
    public L l() {
        return this.left;
    }

    /**
     * 
     * @return Liefert den rechten Wert des Paars.
     */
    public R r() {
        return this.right;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair<?, ?> other = (Pair<?, ?>) obj;
        if (left == null) {
            if (other.left != null) {
                return false;
            }
        } else if (!left.equals(other.left)) {
            return false;
        }
        if (right == null) {
            if (other.right != null) {
                return false;
            }
        } else if (!right.equals(other.right)) {
            return false;
        }
        return true;
    }

}
