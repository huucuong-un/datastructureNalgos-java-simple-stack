/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class ArrayBasedStack<E> implements StackADT<E> {

    public static final int CAPACITY = 1000; //default array capacity
    private E[] data;   //generic array used for storage
    private int t = -1; //index of the top element in stack
    public ArrayBasedStack() { this(CAPACITY);} //constructs stack with default capacity
    public ArrayBasedStack(int capacity) {
        data = (E[]) new Object[capacity];
    }
    @Override
    public int size() {
        return t + 1;
    }
    
    @Override
    public boolean isEmpty() {
        return t == -1;
    }
    
    @Override
    public void push(E e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;  //increment t before storing new item 
    }
    
    @Override
    public E top() {
        if(isEmpty()) return null;
        return data[t];
    }
    
    @Override
    public E pop() {
        if(isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
    
    
    
    
    
    
    
    
   

  
 
   

  

}
