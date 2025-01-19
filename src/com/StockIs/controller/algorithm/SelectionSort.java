/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A class that sorts a list of stockModel objects by Date, Stock ID, Open Price, or Close Price using selection sort.
 * Sorting can be done in ascending or descending order.
 * 
 * @author prashantrijal
 * LMU Id: 23048683
 */

package com.StockIs.controller.algorithm;

import com.StockIs.model.stockModel;
import java.util.ArrayList;
import java.util.List;

/*

 * A class that sorts a list of stockModel objects by Date, Stock ID, Open Price, or Close Price.
 * Sorting can be done in ascending or descending order.
 * 
 * @author prashantrijal
 * LMU Id: 23048683
 */
public class SelectionSort {

    private List<stockModel> stockSortList;

    // Constructor
    public SelectionSort() {
        stockSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of stockModel objects by Date in ascending or descending
     * order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByDate(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 0; i < stockSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByDate(stockSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(stockSortList, i, extremumIndex);
            }
        }

        return stockSortList;
    }

    /**
     * Sorts a list of stockModel objects by Stock ID in ascending or descending
     * order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByStockID(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 0; i < stockSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByStockID(stockSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(stockSortList, i, extremumIndex);
            }
        }

        return stockSortList;
    }

    /**
     * Sorts a list of stockModel objects by Open Price in ascending or
     * descending order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByOpenPrice(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 0; i < stockSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByOpenPrice(stockSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(stockSortList, i, extremumIndex);
            }
        }

        return stockSortList;
    }

    /**
     * Sorts a list of stockModel objects by Close Price in ascending or
     * descending order.
     *
     * @param stockList the list of stockModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<stockModel> sortByClosePrice(List<stockModel> stockList, boolean isDesc) {
        if (stockList == null || stockList.isEmpty()) {
            throw new IllegalArgumentException("Stock list cannot be null or empty.");
        }

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 0; i < stockSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByClosePrice(stockSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(stockSortList, i, extremumIndex);
            }
        }

        return stockSortList;
    }

    private int findExtremumIndexByDate(List<stockModel> stockSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;
        for (int j = startIndex + 1; j < stockSortList.size(); j++) {
            if (shouldSwapByString(stockSortList.get(j).getListingDate(), stockSortList.get(extremumIndex).getListingDate(), isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }

    private boolean shouldSwapByInt(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    private int findExtremumIndexByStockID(List<stockModel> stockSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;
        for (int j = startIndex + 1; j < stockSortList.size(); j++) {
            if (shouldSwapByInt(
                    Integer.parseInt(stockSortList.get(j).getStockId()),
                    Integer.parseInt(stockSortList.get(extremumIndex).getStockId()),
                    isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }

    private int findExtremumIndexByOpenPrice(List<stockModel> stockSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;
        for (int j = startIndex + 1; j < stockSortList.size(); j++) {
            if (shouldSwapByDouble(stockSortList.get(j).getOpenPrice(), stockSortList.get(extremumIndex).getOpenPrice(), isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }

    private int findExtremumIndexByClosePrice(List<stockModel> stockSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;
        for (int j = startIndex + 1; j < stockSortList.size(); j++) {
            if (shouldSwapByDouble(stockSortList.get(j).getClosePrice(), stockSortList.get(extremumIndex).getClosePrice(), isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }

    private boolean shouldSwapByString(String current, String extremum, boolean isDesc) {
        return isDesc ? current.compareTo(extremum) > 0 : current.compareTo(extremum) < 0;
    }

    private boolean shouldSwapByDouble(double current, double extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    private void swap(List<stockModel> stockSortList, int i, int j) {
        stockModel temp = stockSortList.get(i);
        stockSortList.set(i, stockSortList.get(j));
        stockSortList.set(j, temp);
    }
}
