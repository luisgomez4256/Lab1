package sol;
import src.IBST;

import java.lang.Math;


/**
 *
 */
public class Node implements IBST {
    private int value;
    private IBST left;
    private IBST right;

    /**
     * @param value
     * @param left
     * @param right
     */
    public Node(int value, IBST left, IBST right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * @param n
     * @return
     */
    @Override
    public IBST insert(int n) {
        if (n < this.value) {
            this.left = this.left.insert(n);
        }   else {
            this.right = this.right.insert(n);
        }
        return this;
    }

    /**
     * @param n
     * @return
     */
    @Override
    public boolean contains(int n) {
        if (this.value == n) {
            return true;
        } else if (this.value < n) {
            return this.right.contains(n);
        } else {
            return this.left.contains(n);
        }
    }

    /**
     * @return
     */
    @Override
    public int treeDepth() {

        int leftHeight = this.left.treeDepth();
        int rightHeight = this.right.treeDepth();

        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * @return
     */
    @Override
    public IBST getLeft() {
        return this.left;
    }

    /**
     * @return
     */
    @Override
    public IBST getRight() {
        return this.right;
    }

}