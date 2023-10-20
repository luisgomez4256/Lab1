package sol;

import org.junit.Assert;
import org.junit.Test;
import src.*;
import sol.*;

public class BSTTest {

    @Test
    public void testExample() {
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void testTree() {
        int four = 4;
        int six = 6;
        int seven = 7;
        int eight = 8;

        IBST blueTree = new Node(six, new Leaf(), new Leaf());
        Assert.assertFalse(blueTree.contains(seven));
        Assert.assertTrue(blueTree.contains(six));
        Assert.assertFalse(blueTree.contains(four));
        blueTree.insert(four);
        blueTree.insert(eight);
        Assert.assertTrue(blueTree.contains(eight));
        Assert.assertTrue(blueTree.contains(four));
        Assert.assertEquals(blueTree.treeDepth(), 2);
    }

    @Test
    public void testDepth() {
        // Tests the height of the binary search tree
        // Note: A root node has a depth value of 1

        IBST root = new Node(6, new Leaf(), new Leaf());
        Assert.assertEquals(1, root.treeDepth());

        root.insert(8);
        Assert.assertEquals(2, root.treeDepth());

        root.insert(12);
        Assert.assertEquals(3, root.treeDepth());

        root.insert(14);
        Assert.assertEquals(4, root.treeDepth());

        root.insert(4);
        Assert.assertEquals(4, root.treeDepth());
    }

}
