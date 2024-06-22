/*
 * Write a Recursive Approach to Split BST.
 * Given a Binary Search Tree (BST) and a target value, split the BST into two subtrees where one subtree contains nodes with values less than the target value, and the other subtree contains nodes with values greater than or equal to the target value. Return the two root nodes of the resulting subtrees.
 */

package solutions.hard;

import core.Solution;
import java.util.Scanner;

public class SplitBST implements Solution {
  class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  private Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }
    if (data < root.data) {
      root.left = insert(root.left, data);
    } else if (data > root.data) {
      root.right = insert(root.right, data);
    }
    return root;
  }

  private Node createTree() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of nodes: ");
      int number = sc.nextInt();
      System.out.print("Enter the nodes: ");
      String[] arr = new String[number];
      for (int i = 0; i < number; i++) {
        arr[i] = sc.next();
      }
      Node root = null;
      for (int i = 0; i < arr.length; i++) {
        String str = arr[i];
        if (str.equals("N") || str.equals("n")) {
          continue;
        }
        int data = Integer.parseInt(str);
        root = insert(root, data);
      }
      return root;
    }
  }

  private String inOrderTraversal(Node root) {
    if (root == null) {
      return "";
    }
    return inOrderTraversal(root.left) + root.data + " " + inOrderTraversal(root.right);
  }

  private boolean isNodePresent(Node root, int target) {
    if (root == null) {
      return false;
    }
    if (root.data == target) {
      return true;
    } else if (root.data > target) {
      return isNodePresent(root.left, target);
    } else {
      return isNodePresent(root.right, target);
    }
  }

  private Node[] splitBST(Node root, int target) {
    if (root == null) {
      return new Node[2];
    }
    if (root.data > target) {
      Node[] result = splitBST(root.left, target);
      root.left = result[0];
      result[0] = root;
      return result;
    } else {
      Node[] result = splitBST(root.right, target);
      root.right = result[1];
      result[1] = root;
      return result;
    }
  }

  @Override
  public void solve() {
    Node root = createTree();
    System.out.println(inOrderTraversal(root));
    Node[] result = new Node[2];
    int target = 7; // Enter the target around which the BST will be split
    if (!isNodePresent(root, target)) {
      root = insert(root, target);
    }
    result = splitBST(root, target);
    for (int i = 0; i < result.length; i++) {
      System.out.println(inOrderTraversal(result[i]));
    }
  }
}
