/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prashantrijal
 * LMU ID 23048683
 */
package com.StockIs.dataStructure;

import com.StockIs.model.stockModel;
import java.util.LinkedList;

public class StockQueue {

    private LinkedList<stockModel> StockList; // Internal storage for the queue.
    private int capacity; // Maximum number of elements the queue can hold.

    /**
     * Constructs a StockQueue with the specified capacity.
     *
     * @param capacity the maximum number of elements the queue can hold.
     * @throws IllegalArgumentException if the specified capacity is negative or zero.
     */
    public StockQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        StockList = new LinkedList<>();
        this.capacity = capacity;
    }

    /**
     * Removes and returns the first stockModel from the queue.
     *
     * @return the first stockModel in the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public stockModel deQueue() {
        try {
            return StockList.removeFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot remove from an empty queue.");
        }
    }

    /**
     * Adds a new stockModel to the end of the queue if it is not full.
     *
     * @param stock the stockModel to be added to the queue.
     * @return the current size of the queue after the operation.
     * @throws IllegalStateException if the queue is full.
     */
    public int enQueue(stockModel stock) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full. Cannot add more stocks.");
        }
        StockList.addLast(stock);
        return StockList.size();
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the number of elements in the queue.
     */
    public int poll() {
        return StockList.size();
    }

    /**
     * Retrieves, but does not remove, the first stockModel in the queue.
     *
     * @return the first stockModel in the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public stockModel peek() {
        try {
            return StockList.getFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot peek into an empty queue.");
        }
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return StockList.isEmpty();
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue has reached its capacity, false otherwise.
     */
    public boolean isFull() {
        return StockList.size() == capacity;
    }

}
