package com.javalearning;

/**
 * Created by lhy on 2018/12/25.
 */
public class MyArrayList<AnyType> implements Iterable<AnyType>
{
    //@ Fields
    private static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private AnyType[] theItems;


    //@ Constructors
    public MyArrayList()
    {
        doClear();
    }

    //@ Methods
    //  Returns the number of items in this collection.
    public int size()
    {
        return theSize;
    }

    //  Returns true if the collection is empty
    public boolean isEmpty()
    {
        return size()==0;
    }

    //  Returns the item at position idx
    public AnyType get(int idx)
    {
        if(idx<0 || idx>=size())
            throw new ArrayIndexOutOfBoundsException();
        return theItems[idx];
    }

    //  Changes the item at position idx
    public AnyType set(int idx, AnyType newVal)
    {
        if(idx<0 || idx>=size())
            throw new ArrayIndexOutOfBoundsException();
        AnyType oldVal = theItems[idx];
        theItems[idx] = newVal;
        return oldVal;
    }

    @SuppressWarnings("unchecked")
    public void ensureCapacity(int newCapacity)
    {
        if(newCapacity<theSize)
            return;
        AnyType[] old = theItems;
        //  the warning here should be suppressed
        theItems = (AnyType[]) new Object[newCapacity];
        for(int i=0; i<size(); i++)
            theItems[i] = old[i];
    }

    //  Adds an item to this collection at the end
    public boolean add(AnyType x)
    {
        add(size(),x);
        return true;
    }

    //  Adds an item to this collection at the specified index
    public void add(int idx, AnyType x)
    {
        if(theItems.length == size())
            ensureCapacity(size()*2+1);
        for (int i=theSize; i>idx; i--)
            theItems[i] = theItems[i-1];
        theItems[idx] = x;
        theSize++;
    }

    //  Removes an item from this collection
    public AnyType remove(int idx)
    {
        AnyType removedItem = theItems[idx];
        for (int i=idx; i<size()-1; i++)
            theItems[i] = theItems[i+1];
        theSize--;
        return removedItem;
    }

    //  Changes the size of the collection to zero
    public void clear()
    {
        doClear();
    }

    private void doClear()
    {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    //  Obtains an Iterator object used to traverse the collection
    public java.util.Iterator<AnyType> iterator()
    {
        return new ArrayListIterator();
    }


    /**
     * This is the implementation of the ArrayListIterator.
     * It maintains a notion of a current position and
     * the implicit reference to the MyArrayList.
     **/
    private class ArrayListIterator implements java.util.Iterator<AnyType>
    {
        private int current = 0;

        public boolean hasNext()
        {
            return current<size();
        }

        public AnyType next()
        {
            if(!hasNext())
                throw new java.util.NoSuchElementException();
            return theItems[current++];
        }

        public void remove()
        {
            MyArrayList.this.remove(--current);
        }
    }
}
