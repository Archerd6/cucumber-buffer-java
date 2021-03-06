package io.cucumber.skeleton;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Clase que implementa un buffer acotado
 * @author Pruebas, cambiar
 * @version 1.1
 *
 */
public class BufferAcotado<T> {
	
	private int capacidad;
	private Queue<T> elements;

	/**
	 * CONSTRUCTOR
	 * @param capacidad :int capacidad del buffer (numero maximo de elementos que puede contener)
	 * @throws IllegalArgumentException if (!capacidad<=0) // precondition
	 */
	public BufferAcotado(int capacidad) {
		if(capacidad<=0) throw new IllegalArgumentException("La capacidad del buffer tiene que ser >0");
		this.capacidad = capacidad;
		elements=new ArrayDeque<T>();
	}
	
	/**
	 * Inserts the specified element at the end of the Buffer 
	 * if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available
	 * @param  element :T -- the element to insert
	 * @throws IllegalStateException if the buffer is full.
	 * @throws NullPointerException if the element to put is null
	 * @post   the size of the buffer is increased by 1
	 * @post   the new element becomes the last element of the buffer
	 */
	public void put(T element) {
		if(element==null) throw new NullPointerException("El elemento a insertar no puede ser nulo");
		if (this.isFull()) throw new IllegalStateException("The element cannot be added at this time because the buffer is full");
		boolean addedOK=elements.add(element);
		assert addedOK:"No pudo insertarse el elemento";
	}
	
	/**
	 * Retrieves and removes the head of the Buffer
	 * @return :T -- the element that was at the head of the Buffer
	 * @throws IllegalStateException if the buffer is empty -- precondition
	 * @post   the size of the buffer is decreased by 1
	 * @post   buffer@pre = buffer.prepend(result) 
	 */
	public T get() {
		if (this.isEmpty()) throw new IllegalStateException("The element cannot be obtained because the Buffer is empty");
		return elements.remove();
	}
	
	/**
	 * This is a query operation that returns the number of elements currently in the buffer
	 * @return :int -- elements.size()
	 */
	public int size() {
		return this.elements.size();
	}
	
	/**
	 * This is a query operation that checks if the buffer is full
	 * @return :boolean -- elements.size()==capacidad
	 */
	public boolean isFull() {
		return this.elements.size()==this.capacidad;
	}
	
	/**
	 * This is a query operation that checks if the buffer is empty
	 * @return :boolean -- elements.size()==0
	 */
	public boolean isEmpty() {
		return this.elements.size()==0;
	}
}
