package src;


public interface IBST {
    IBST insert (int n);
    boolean contains(int n);
    int treeDepth();
    IBST getLeft();
    IBST getRight();

}