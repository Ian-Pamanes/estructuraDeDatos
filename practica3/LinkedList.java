package practica3;

import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {
	private Node<E> header;
	private int size;
	
	public LinkedList() {
		header = new Node<E>();
		size = 0;
	}
	
	/**
	 * Gets the node at the specified index.
	 * @param index the index of the node to get
	 * @return the node at the specified position
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
	 */
	private Node<E> node(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index < (size >> 1)) {
            Node<E> x = header.next;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = header.prev;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
            }
	}
        
        
        
        

	@Override
	public void addFirst(E e) {
            
            Node<E> x = new Node<E>(e);
            x.next = header.next;
            x.prev = header;
            header.next.prev = x;
            header.next = x;
            
            size++;
            
		// TODO Auto-generated method stub
		
	}
        
        
        
        

	@Override
	public void addLast(E e) {
            
            Node<E> x = new Node<E>(e);
            x.next = header;
            x.prev = header.prev;
            header.prev.next = x;
            header.prev = x;
            
            size--;
            
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int index, E element) {
            
            Node<E> newNode = new Node<E>(element);
            if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
            else if (index < (size >> 1)) {
            Node<E> x = header.next;
            for (int i = 0; i < index; i++){
                x = x.next;}
            
            newNode.next = x.next;
            newNode.prev = x;
            x.next.prev = newNode;
            x.next = newNode;
            
            
        } else {
            Node<E> x = header.prev;
            for (int i = size - 1; i > index; i--){
                x = x.prev;}
            
            newNode.next = x;
            newNode.prev = x.prev;
            x.prev.next = newNode;
            x.prev = newNode;
            
        }
	
            size++;
// TODO Auto-generated method stub
		
	}
        
        
        

	@Override
	public E removeFirst() {
            
            if(header.next == header){ throw new NoSuchElementException();}
            
            else{
            Node<E> nodeToRemove = header.next;
            nodeToRemove.next.prev = header;
            header.next = nodeToRemove.next;
            }
		// TODO Auto-generated method stub
            return null;
	}
        
        
        

	@Override
	public E removeLast() {
            
            if(header.next == header){ throw new NoSuchElementException();}
            
            else{
            Node<E> nodeToRemove = header.prev;
            nodeToRemove.prev.next = header;
            header.prev = nodeToRemove.prev;
            }
		// TODO Auto-generated method stub
            return null;
	}
        
        

	@Override
	public E remove(int index) {
           
            if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
            else if (index < (size >> 1)) {
            Node<E> x = header.next;
            for (int i = 0; i < index; i++){
                x = x.next;}
            
            x.next = x.next.next;
            x.next.next.prev = x;
            
            
        } else {
            Node<E> x = header.prev;
            for (int i = size - 1; i > index; i--){
                x = x.prev;}
            
            x.prev = x.prev.prev;
            x.prev.prev.next = x;
            
        }
	
            size--;
		// TODO Auto-generated method stub
		return null;
	}
        
        

	@Override
	public boolean remove(Object o) {
            
            Node<E> current = header.next;
            for (int i = 0; current.next.value != o || current.next != header; i++){
                current = current.next;}
            
            if(current.next.value == o){
            current.next = current.next.next;
            current.next.next.prev = current;
            size--;
		// TODO Auto-generated method stub
		return true;
            }
            return false;
	}
        
        

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return header.next.value;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return header.prev.value;
	}

	@Override
	public E get(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
            else if (index < (size >> 1)) {
            Node<E> current = header.next;
            for (int i = 0; i < index; i++){
                current = current.next;}
            
            return current.next.value;
            
            
        } else {
            Node<E> current = header.prev;
            for (int i = size - 1; i > index; i--){
                current = current.prev;}
            
            return current.prev.value;
            }
        }

	@Override
	public E set(int index, E element) {
	
            if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
            else if (index < (size >> 1)) {
            Node<E> current = header.next;
            for (int i = 0; i < index; i++){
                current = current.next;}
            
            Node<E> nodeToReplace = current.next;
            current.next.value = element;
            
            return nodeToReplace.value;
            
            
        } else {
            Node<E> current = header.prev;
            for (int i = size - 1; i > index; i--){
                current = current.prev;}
            
            Node<E> nodeToReplace = current.prev;
            current.prev.value = element;
            
            return nodeToReplace.value;
        }
	
            
// TODO Auto-generated method stub
		
	
	
        }
	

	@Override
	public boolean contains(E e) {
            
            Node<E> current = header.next;
            for (int i = 0; current.value != e || current.next != header; i++){
                current = current.next;
                if(current.next.value == e){ return true; }   
            }
            
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object o) {
            
            Node<E> current = header.next;
            for (int i = 0; current.value != o; i++){
                current = current.next;
                if (current.next == header) { return -1; }
                if (current.next.value == o){ return i+1; }
                
            }
            
                
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public void clear() {
            header.next = header;
            header.prev = header;
            
            size = 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return header.next == header;
	}

	@Override
	public Object[] toArray() {
            Object[] o = new Object[size];
            Node<E> current = header.next;
            for(int i = 0; i < size; i++){
                o[i] =current.value;}
                
            return o;
	}
	
	@Override
	public String toString() {
            String o = "";
            Node<E> current = header.next;
            for(int i = 0; i < size; i++){
                o += String.valueOf(current.value);}
                
	return o;
	}
}
