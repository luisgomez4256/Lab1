package sol;
import src.IBST;

import java.lang.Math;

/**
 *
 */
public class Leaf implements IBST {
    public Leaf() {}

    /**
     * @param n
     * @return
     */
    @Override
    public IBST insert(int n) {
        return new Node(n, new Leaf(), new Leaf());
    }

    /**
     * @param n
     * @return
     */
    @Override
    public boolean contains(int n) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public int treeDepth() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public IBST getLeft() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public IBST getRight() {
        return null;
    }
}
