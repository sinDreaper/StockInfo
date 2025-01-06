/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StockIs.controller.algorithm;
import com.StockIs.model.stockModel;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that sorts a list of stockModel objects by their Stock ID or Date.
 * 
 * @author prashantrijal
 * LMU Id: 23048683
 */
public class SortDate {
    private List<stockModel> stockSortList;

    // Constructor
    public SortDate() {
        stockSortList = new ArrayList<>();
    }  

    /**
     * Sorts a list of stockModel objects by their Date in ascending or descending order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByDate(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 0; i < stockSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(stockSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(stockSortList, i, extremumIndex);
            }
        }

        return stockSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list from the start index.
     *
     * @param stockSortList the list of stockModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<stockModel> stockSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < stockSortList.size(); j++) {
            if (shouldSwap(stockSortList.get(j).getListingDate(), stockSortList.get(extremumIndex).getListingDate(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum based on sort order.
     *
     * @param current the current Date
     * @param extremum the current extremum Date
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return true if the current value should replace the extremum; false otherwise
     */
    private boolean shouldSwap(String current, String extremum, boolean isDesc) {
        return isDesc ? current.compareTo(extremum) > 0 : current.compareTo(extremum) < 0;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param stockSortList the list of stockModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<stockModel> stockSortList, int i, int j) {
        stockModel temp = stockSortList.get(i);
        stockSortList.set(i, stockSortList.get(j));
        stockSortList.set(j, temp);
    }
}
