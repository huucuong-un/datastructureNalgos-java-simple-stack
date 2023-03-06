/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Admin
 */
public interface StackADT<E>   {
    void push (E element);
    E pop();
    E top();
    int size();
    boolean isEmpty();
}
