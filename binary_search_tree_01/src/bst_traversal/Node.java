package bst_traversal;

public class Node {
  private int data;
  private Node left;
  private Node right;
  private Node parent;

  public Node(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return data + " ";
  }
}
