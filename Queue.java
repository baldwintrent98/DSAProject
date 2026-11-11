/*
 * Purpose: Data Structure and Algorithms Lab 6 Problem 0-1
 * Status:  Complete and thoroughly tested
 * Last update: 10/04/26
 * Submitted:  10/04/26
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: Andre Tenney
 * @version: 2026.10.04
 */
import java.lang.StringBuilder;
//import java.util.Arrays;

public class Queue<T> implements QueueInterface<T>
{
    protected T[] items;
    protected int front, back, numItems;

    public Queue()
    {
        items = (T[]) new Object[3];
        front = 0;
        back = 0;
        numItems = 0;
    }

    public boolean isEmpty()
    {
        return numItems == 0;
    }

    public void enqueue(T item) throws QueueException
    {
        if(items.length == numItems) {
            resize();
        }
        items[back] = item;
        back = (back + 1) % items.length;
        numItems++;
    }

    public T dequeue() throws QueueException
    {
        if(numItems == 0) {
            throw new QueueException("Cannot dequeue since the queue is empty!");
        }
        T result = items[front];
        items[front] = null;
        front = (front + 1) % items.length;
        numItems--;
        return result;
    }

    public T peek() throws QueueException
    {
        if(numItems == 0) {
            throw new QueueException("Cannot peek since the queue is empty!");
        }
        return items[front];
    }

    public void dequeueAll()
    {
        items = (T[]) new Object[3];
        front = 0;
        back = 0;
        numItems = 0;
    }

    protected void resize()
    {
        T[] temp = (T[]) new Object[items.length<<1];
        for(int i = 0; i < numItems; i++) {
            temp[i] = items[front];
            front = (front + 1) % items.length;
        }
        front = 0;
        back = numItems;
        items = temp;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        int curr = front;
        for(int i = 0; i < numItems; i++) {
            sb.append(items[curr].toString()).append("\n");
            curr = (curr + 1) % items.length;
        }

        return sb.toString();
    }
}
