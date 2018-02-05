package bst_traversal;

import java.util.LinkedList;
import java.util.Queue;

class Main {
  private static void preorderTraversal(Node root) {
    if (root != null) {
      System.out.print(root);
      preorderTraversal(root.getLeft());
      preorderTraversal(root.getRight());
    }
  }

  private static void inorderTraversal(Node root) {
    if (root != null) {
      inorderTraversal(root.getLeft());
      System.out.print(root);
      inorderTraversal(root.getRight());
    }
  }

  private static void postorderTraversal(Node root) {
    if (root != null) {
      postorderTraversal(root.getLeft());
      postorderTraversal(root.getRight());
      System.out.print(root);
    }
  }

  private static void levelorderTraversal(Node root) {
    Queue queue = new LinkedList();
    queue.offer(root);
    while (!queue.isEmpty()) {
      Node node = (Node) queue.poll();
      System.out.print(node);
      if (node.getLeft() != null)
        queue.offer(node.getLeft());

      if (node.getRight() != null)
        queue.offer(node.getRight());
    }

  }

  public static void main(String[] args) {
    Node root = new Node(3);
    root.setLeft(new Node(1));
    root.setRight(new Node(5));

    root.getLeft().setLeft(new Node(0));
    root.getLeft().setRight(new Node(2));
    root.getRight().setLeft(new Node(4));
    root.getRight().setRight(new Node(6));

    root.getLeft().getRight().setLeft(new Node(7));
    root.getLeft().getRight().setRight(new Node(8));

    System.out.print("전위 순회 ");
    preorderTraversal(root);
    System.out.print("\n중위 순회 ");
    inorderTraversal(root);
    System.out.print("\n후위 순회 ");
    postorderTraversal(root);
    System.out.print("\n레벨 순회 ");
    levelorderTraversal(root);
  }
}
