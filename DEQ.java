/*
 * Purpose: Data Structure and Algorithms Lab 6 Problem 1
 * Status:  Complete and thoroughly tested
 * Last update: 10/04/26
 * Submitted:  10/04/26
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: Andre Tenney
 * @version: 2026.10.04
 */
public class DEQ<T> extends Queue<T> implements ExtendedQueueInterface<T>
{
    public DEQ()
    {
        super();
    }

    public void enqueueFront(T item) throws ExtendedQueueException
    {
        if(numItems == items.length)
        {
            resize();
        }
        front = (front - 1 + items.length) % items.length;
        items[front] = item;
        numItems++;
    }

    public T peekBack() throws ExtendedQueueException
    {
        if(numItems == 0) {
            throw new ExtendedQueueException("Cannot peek back since the queue is empty!");
        }
        return items[(back - 1 + items.length) % items.length];
    }

    public T dequeueBack() throws ExtendedQueueException
    {
        if(numItems == 0) {
            throw new ExtendedQueueException("Cannot dequeue back since the queue is empty!");
        }
        back = (back - 1 + items.length) % items.length;
        T result = items[back];
        items[back] = null;
        numItems--;
        return result;
    }
}
