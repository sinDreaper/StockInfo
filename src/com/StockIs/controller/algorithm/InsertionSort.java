/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A class that sorts a list of stockModel objects by Date, Stock ID, Open Price, or Close Price using Insertion sort.
 * Sorting can be done in ascending or descending order.
 * 
 * @author prashantrijal
 * LMU Id: 23048683
 */
package com.StockIs.controller.algorithm;

import com.StockIs.model.stockModel;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that sorts a list of stockModel objects by Date, Stock ID, Open Price, or Close Price.
 * Sorting can be done in ascending or descending order.
 * 
 * @author prashantrijal
 * LMU Id: 23048683
 */
public class InsertionSort {

    private List<stockModel> stockSortList;

    // Constructor
    public InsertionSort() {
        stockSortList = new ArrayList<>();
    }

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

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 1; i < stockSortList.size(); i++) {
            stockModel key = stockSortList.get(i);
            int j = i - 1;

            while (j >= 0 && shouldSwapByString(key.getListingDate(), stockSortList.get(j).getListingDate(), isDesc)) {
                stockSortList.set(j + 1, stockSortList.get(j));
                j--;
            }

            stockSortList.set(j + 1, key);
        }

        return stockSortList;
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

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 1; i < stockSortList.size(); i++) {
            stockModel key = stockSortList.get(i);
            int j = i - 1;

            while (j >= 0 && shouldSwapByInt(
                    Integer.parseInt(key.getStockId()), 
                    Integer.parseInt(stockSortList.get(j).getStockId()), 
                    isDesc)) {
                stockSortList.set(j + 1, stockSortList.get(j));
                j--;
            }

            stockSortList.set(j + 1, key);
        }

        return stockSortList;
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

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 1; i < stockSortList.size(); i++) {
            stockModel key = stockSortList.get(i);
            int j = i - 1;

            while (j >= 0 && shouldSwapByDouble(key.getOpenPrice(), stockSortList.get(j).getOpenPrice(), isDesc)) {
                stockSortList.set(j + 1, stockSortList.get(j));
                j--;
            }

            stockSortList.set(j + 1, key);
        }

        return stockSortList;
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

        this.stockSortList.clear();
        this.stockSortList.addAll(stockList);

        for (int i = 1; i < stockSortList.size(); i++) {
            stockModel key = stockSortList.get(i);
            int j = i - 1;

            while (j >= 0 && shouldSwapByDouble(key.getClosePrice(), stockSortList.get(j).getClosePrice(), isDesc)) {
                stockSortList.set(j + 1, stockSortList.get(j));
                j--;
            }

            stockSortList.set(j + 1, key);
        }

        return stockSortList;
    }

    private boolean shouldSwapByString(String current, String previous, boolean isDesc) {
        return isDesc ? current.compareTo(previous) > 0 : current.compareTo(previous) < 0;
    }

    private boolean shouldSwapByInt(int current, int previous, boolean isDesc) {
        return isDesc ? current > previous : current < previous;
    }

    private boolean shouldSwapByDouble(double current, double previous, boolean isDesc) {
        return isDesc ? current > previous : current < previous;
    }
}
