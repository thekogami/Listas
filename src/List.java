public class List {
  private Node head;

  public void addInitial(Double value) {
    //1 - Inserir no inicio da lista
    Node node = new Node();
    node.setValue(value);
    node.setNext(head);
    head = node;
  }

  public void addFinal(Double value) {
    //2 - Inserir no final da lista
    Node node = new Node();
    node.setValue(value);
    if (head == null) {
      head = node;
    } else {
      Node aux = head;
      while (aux.getNext() != null) {
        aux = aux.getNext();
      }
      aux.setNext(node);
    }
  }

  @Override
  public String toString() {
    
    StringBuffer sb = new StringBuffer();
    sb.append("Lista: ");

    Node p = head;
    while (p != null) {
      sb.append(p.getValue() + " ");
      p = p.getNext();
    }

    sb.append("\n");
    return sb.toString();
  }

}
