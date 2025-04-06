package Practicas.Pila.Gael.Programa2;

import java.util.Stack;

public class Pila {
    private Stack<Integer> stack = new Stack<Integer>();

    public void push(int value) {
        this.stack.push(value);
    }

    public void pop() {
        if (this.stack.isEmpty()) {
            System.err.println("\u001B[31mPila vacia\u001B[0m\n");
            return;
        }
        System.out.printf("Se eliminó el elemento %s\n", this.stack.peek());
        this.stack.pop();
    }

    public Integer top() {
        if (this.stack.isEmpty()) {
            System.err.println("\u001B[31mPila vacia\u001B[0m\n");
            return null;
        }
        return this.stack.peek();
    }

    public Object[] asArray() {
        return this.stack.toArray();
    }

    public int size() {
        return stack.size();
    }

}
