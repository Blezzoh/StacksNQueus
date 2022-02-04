/**
Stacks uses 4 main methods:
push
pop
peek
isEmpty
LIFO
*/

public class Stack<T>{
  private static class Node<T>{
    private Node<T> next;
    private T data;
    public Node(T data){
      this.data = data;
    }
  }
  private Node<T> top;

  public T pop(){
    if(top == null) return null;
    T item = top.data;
    top = top.next;
    return item;
  } 

  public T peek(){
    if(top == null) return null;
    return top.data;
  }

  public boolean isEmpty(){
    return top.data != null;
  }

  public void push(T data){
    Node<T> node = new Node<T>(data);
    node.next = top;
    top = node;
  }
  public void print(){
    Node<T> p = top;
    String s = "";
    while(p != null){
      s +=(p.data + "->");
      p = p.next;
    }
    System.out.println(s);
  }
}