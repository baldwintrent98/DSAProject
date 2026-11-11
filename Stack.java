/*
 * Purpose: Data Structure and Algorithms Lab 5 Problem 0
 * Status:  Complete and thoroughly tested
 * Last update: 09/29/26
 * Submitted:  09/29/26
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: Andre Tenney
 * @version: 2026.09.29
 */

import java.lang.StringBuilder;

public class Stack<T> implements StackInterface<T>
{
    private T[] items;
    private int top;

    public Stack()
    {
        top = -1;
        items = (T[]) new Object[3];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public void popAll() throws StackException
    {
        items = (T[]) new Object[3];
        top = -1;
    }

    public void push(T newItem) throws StackException
    {
        if(++top == items.length) {
            resize();
        }

        items[top] = newItem;
    }

    private void resize()
    {
        T[] temp = (T[]) new Object[items.length<<1];
        for(int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }

        items = temp;
    }

    public T pop() throws StackException
    {
        if(top == -1) {
            throw new StackException("Stack is empty");
        }

        T result = items[top];
        items[top--] = null;
        return result;
    }

    public T peek() throws StackException
    {
        if(top == -1) {
            throw new StackException("Stack is empty");
        }

        return items[top];
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= top; i++) {
            sb.insert(0, items[i].toString() + "\n");
        }

        return sb.toString();
    }
}
