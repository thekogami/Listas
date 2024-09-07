# Linked List Project

This project implements a singly linked list in Java. It includes two main classes: `List` and `Node`. The `List` class provides various operations to manipulate the linked list, while the `Node` class represents the individual elements of the list.

## Classes

### Node

The `Node` class represents a single element in the linked list. It contains the following attributes and methods:

#### Attributes

- `Double value`: The value stored in the node.
- `Node next`: A reference to the next node in the list.

#### Methods

- `Double getValue()`: Returns the value of the node.
- `void setValue(Double value)`: Sets the value of the node.
- `Node getNext()`: Returns the reference to the next node.
- `void setNext(Node next)`: Sets the reference to the next node.

### List

The `List` class provides various operations to manipulate the linked list. It contains the following methods:

#### Methods

- `void addInitial(Double value)`: Adds a new node with the given value at the beginning of the list.
- `void addFinal(Double value)`: Adds a new node with the given value at the end of the list.
- `void addPosition(int position, Double value)`: Adds a new node with the given value at the specified position in the list.
- `int size()`: Returns the number of nodes in the list.
- `int search(Double value)`: Searches for a node with the given value and returns its position. Returns `-1` if the value is not found.
- `void removeInitial()`: Removes the first node from the list.
- `void removeFinal()`: Removes the last node from the list.
- `void removePosition(int position)`: Removes the node at the specified position in the list.
- `String toString()`: Returns a string representation of the list.

## Usage

To use this project, you can create instances of the `List` class and perform various operations on the linked list. Below is an example:

```java
public class Main {
    public static void main(String[] args) {
        List list = new List();

        // Add elements to the list
        list.addInitial(1.0);
        list.addFinal(2.0);
        list.addPosition(1, 1.5);

        // Print the list
        System.out.println(list);

        // Get the size of the list
        System.out.println("Size: " + list.size());

        // Search for an element
        System.out.println("Position of 1.5: " + list.search(1.5));

        // Remove elements from the list
        list.removeInitial();
        list.removeFinal();
        list.removePosition(0);

        // Print the list again
        System.out.println(list);
    }
}
