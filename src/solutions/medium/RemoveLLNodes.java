/*
 * Write Recursive Approach for Removing Nodes From Linked List.
 */

package solutions.medium;

import core.Solution;
import java.util.Scanner;

public class RemoveLLNodes implements Solution {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node insert(Node head, int data) {
    if (head == null) {
      return new Node(data);
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = new Node(data);
    return head;
  }

  private Node createLinkedList() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of nodes: ");
      int number = sc.nextInt();
      System.out.print("Enter the nodes: ");
      String[] arr = new String[number];
      for (int i = 0; i < number; i++) {
        arr[i] = sc.next();
      }
      Node head = null;
      for (int i = 0; i < arr.length; i++) {
        String str = arr[i];
        int data = Integer.parseInt(str);
        head = insert(head, data);
      }
      return head;
    }
  }

  private String printLL(Node head) {
    if (head == null) {
      return "null";
    }
    return head.data + " -> " + printLL(head.next);
  }

  private Node removeAllNodes(Node head, int data) {
    if (head == null) {
      return null;
    }
    head.next = removeAllNodes(head.next, data);
    return head.data == data ? head.next : head;
  }

  @Override
  public void solve() {
    Node head = createLinkedList();
    System.out.println(printLL(head));
    int data = 2; // Enter the data to be removed
    head = removeAllNodes(head, data);
    System.out.println(printLL(head));
  }
}
