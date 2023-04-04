package Latihan1;

class Stack {
    private Object[] elements;
    private int size;
    private int top;

    public Stack(int capacity) {
        elements = new Object[capacity];
        size = capacity;
        top = -1;
    }

    public void push(Object element) {
        if (isFull()) {
            throw new RuntimeException("Stack overflow");
        }
        top++;
        elements[top] = element;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        Object element = elements[top];
        elements[top] = null;
        top--;
        return element;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int search(Object element) {
        int distance = -1;
        for (int i = 0; i <= top; i++) {
            if (elements[i].equals(element)) {
                distance = top - i + 1;
                break;
            }
        }
        return distance;
    }
}

public class ExampleStack {
    public static void main(String[] args) {
        Stack st = new Stack(4);

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}