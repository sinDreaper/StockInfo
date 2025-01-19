/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A class that sorts a list of stockModel objects by Date, Stock ID, Open Price, or Close Price using Merge sort.
 * Sorting can be done in ascending or descending order.
 * 
 * @author prashantrijal
 * LMU Id: 23048683
 */
package com.StockIs.controller.algorithm;

import com.StockIs.model.stockModel;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    /**
     * Sorts a list of stockModel objects by Date in ascending or descending order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByDate(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }
        return mergeSort(stockList, isDesc, (a, b) -> 
            isDesc ? b.getListingDate().compareTo(a.getListingDate()) : a.getListingDate().compareTo(b.getListingDate()));
    }

    /**
     * Sorts a list of stockModel objects by Stock ID in ascending or descending order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByStockID(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }
        return mergeSort(stockList, isDesc, (a, b) -> 
            isDesc ? Integer.compare(Integer.parseInt(b.getStockId()), Integer.parseInt(a.getStockId()))
                   : Integer.compare(Integer.parseInt(a.getStockId()), Integer.parseInt(b.getStockId())));
    }

    /**
     * Sorts a list of stockModel objects by Open Price in ascending or descending order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByOpenPrice(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }
        return mergeSort(stockList, isDesc, (a, b) -> 
            isDesc ? Double.compare(b.getOpenPrice(), a.getOpenPrice())
                   : Double.compare(a.getOpenPrice(), b.getOpenPrice()));
    }

    /**
     * Sorts a list of stockModel objects by Close Price in ascending or descending order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByClosePrice(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }
        return mergeSort(stockList, isDesc, (a, b) -> 
            isDesc ? Double.compare(b.getClosePrice(), a.getClosePrice())
                   : Double.compare(a.getClosePrice(), b.getClosePrice()));
    }
    /**
     * Sorts a list of stockModel objects by Name in alphabetical order
     * (ascending or descending).
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByName(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }
        return mergeSort(stockList, isDesc, (a, b)
                -> isDesc ? b.getName().compareTo(a.getName()) : a.getName().compareTo(b.getName()));
    }

    /**
     * Generic merge sort method to sort stockModel objects based on a comparator.
     *
     * @param stockList the list to be sorted
     * @param isDesc specifies the sort order
     * @param comparator the comparator to determine sort order
     * @return the sorted list
     */
    private List<stockModel> mergeSort(List<stockModel> stockList, boolean isDesc, java.util.Comparator<stockModel> comparator) {
        if (stockList.size() <= 1) {
            return stockList;
        }

        int mid = stockList.size() / 2;
        List<stockModel> left = mergeSort(new ArrayList<>(stockList.subList(0, mid)), isDesc, comparator);
        List<stockModel> right = mergeSort(new ArrayList<>(stockList.subList(mid, stockList.size())), isDesc, comparator);

        return merge(left, right, comparator);
    }

    /**
     * Merges two sorted lists into one sorted list.
     *
     * @param left the left sublist
     * @param right the right sublist
     * @param comparator the comparator to determine sort order
     * @return the merged sorted list
     */
    private List<stockModel> merge(List<stockModel> left, List<stockModel> right, java.util.Comparator<stockModel> comparator) {
        List<stockModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i++));
        }

        while (j < right.size()) {
            merged.add(right.get(j++));
        }

        return merged;
    }
}
