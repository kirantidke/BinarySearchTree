package com.bridgelabzday15;
import com.bridgelabz.BinaryTree;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Assert;


public class BinarySearchTest {
    @Test
    public void given3Numbers_WhenAddedToBST_ShouldReturnSize3() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int size = binaryTree.getSize();
        Assert.assertEquals(3, size);
    }
}