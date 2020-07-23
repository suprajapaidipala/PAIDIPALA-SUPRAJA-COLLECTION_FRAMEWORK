package com.supraja.epamtask6_Supraja;

public class NewlyCreatedCustumList<E> 
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object values[];
    
    public NewlyCreatedCustumList(){
        values = new Object[DEFAULT_CAPACITY];
    }
    
    public int size() {
        return size;
    }
    
    public void add(E e){
        values[size++] = e;
    }
    
    public E get(int i){
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) values[i];
    }
    
    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = values[i];
        int numElts = values.length - ( i + 1 ) ;
        System.arraycopy(values, i + 1, values, i, numElts) ;
        size--;
        return (E) item;
    }
    
    public void clear(){
    	if (size != 0) {
    		while(size > 0){
    			size--;
    		}
    	}
    }
    
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(values[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
}