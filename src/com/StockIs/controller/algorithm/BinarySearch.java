/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * A class that searches Company name from the list and shows it in table.
 * 
 * @author prashantrijal
 * LMU Id: 23048683
 */
package com.StockIs.controller.algorithm;

import com.StockIs.model.stockModel;
import java.util.List;

public class BinarySearch {
    public stockModel search(List<stockModel> sortedList, String Name) {
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            stockModel midStock = sortedList.get(mid);
            
            int comparison = midStock.getName().compareTo(Name);
            if (comparison == 0) {
                return midStock; // Match found
            } else if (comparison < 0) {
                left = mid + 1; // Look in the right half
            } else {
                right = mid - 1; // Look in the left half
            }
        }
        return null; // Not found
    }
}
