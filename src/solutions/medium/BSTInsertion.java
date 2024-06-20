/*
 * Given a binary search tree (BST) and a value to be inserted, write a recursive algorithm to insert a new node with the given value into the BST while maintaining its properties.
 */

package solutions.medium;

import core.Solution;
import java.util.Scanner;

public class BSTInsertion implements Solution {
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

  @Override
  public void solve() {
    Node root = createTree();
    System.out.println(inOrderTraversal(root));
  }
}
