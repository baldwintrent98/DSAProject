/*
 * Purpose: Data Structure and Algorithms Lab 5 Problem 3
 * Status:  Complete and thoroughly tested
 * Last update: 10/01/26
 * Submitted:  10/01/26
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: Andre Tenney
 * @version: 2026.10.01
 */

public class ListRA<T> extends ListA<T>
{
    public ListRA()
    {

    }

    public void add(int index, T item)
    {
        if(numItems == items.length) {
            resize();
        }

        super.add(index, item);
    }

    public void resize()
    {
        T[] newItems = (T[]) new Object[items.length<<1];
        for(int i = 0; i < numItems; i++) {
            newItems[i] = items[i];
        }

        items = newItems;
    }

    public void reverse()
    {
        T temp;
        int start = 0, end = numItems - 1;
        while(start < end) {
            temp = items[start];
            items[start] = items[end];
            items[end] = temp;

            start++;
            end--;
        }
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numItems; i++) {
            sb.append(items[i].toString() + " ");
        }
        return sb.toString();
    }
}