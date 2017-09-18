/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.NoSuchElementException;

/**
 *
 * @author Ian
 */
public class Queue<E> implements iQueue<E>{
    
    
    private LinkedList<E> queue;
     
    public Queue(){
        queue = new LinkedList<E>();
    }

    @Override
    public void offer(E e) {
        if(queue.isEmpty()){ throw new NoSuchElementException();}
        queue.addFirst(e);
    }

    @Override
    public E remove() {
        if(queue.isEmpty()){ throw new NoSuchElementException();}
        return queue.removeLast();
    
    }
   
    @Override
    public E element() {
        if(queue.isEmpty()){ throw new NoSuchElementException();}
        return queue.getLast();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public Object[] toArray() {
        return queue.toArray();
    }
    
    
}
