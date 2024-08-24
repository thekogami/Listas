public class List {
  private Node head;

  public void addInitial(Double value) {
    // 1 - Inserir no inicio da lista
    Node node = new Node();
    node.setValue(value);
    node.setNext(head);
    head = node;
  }

  public void addFinal(Double value) {
    // 2 - Inserir no final da lista
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

  public void addPosition(int position, Double value) {
    // 3 - Inserir em uma posição específica
    if (position == 0) {
      addInitial(value);
    } else {
      Node node = new Node();
      node.setValue(value);
      Node aux = head;
      for (int i = 0; i < position - 1; i++) {
        if (aux == null) {
          return;
        }
        aux = aux.getNext();
      }
      if (aux == null) {
        return;
      }
      node.setNext(aux.getNext());
      aux.setNext(node);
    }
  }

  public int size() {
    // 4 - Quantidade de nós (tamanho)
    int count = 0;
    Node aux = head;
    while (aux != null) {
      count++;
      aux = aux.getNext();
    }
    return count;
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
