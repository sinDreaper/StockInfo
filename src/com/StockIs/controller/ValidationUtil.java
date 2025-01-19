/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author prashantrijal
 * LMU ID 23048683
 */

package com.StockIs.controller;

import java.util.regex.Pattern;


public class ValidationUtil {

    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern STOCK_ID_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern TYPE_PATTERN = Pattern.compile("^(Equity|Ordinary|Preference|Deferred|Non-voting)$");
    private static final Pattern LISTING_DATE_PATTERN = Pattern.compile("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");
    private static final Pattern TOTAL_SHARES_PATTERN = Pattern.compile("^\\d+$");
    private static final Pattern OPEN_PRICE_PATTERN = Pattern.compile("^\\d+(\\.\\d+)?$");
    private static final Pattern CLOSE_PRICE_PATTERN = Pattern.compile("^\\d+(\\.\\d+)?$");

    // Method to validate stockId (must match the STOCK_ID_PATTERN)
    public static boolean validateStockId(String stockId) {
        return stockId != null && STOCK_ID_PATTERN.matcher(stockId).matches();
    }

    // Method to validate name (must match the NAME_PATTERN)
    public static boolean validateName(String name) {
        return name != null && NAME_PATTERN.matcher(name).matches();
    }

    // Method to validate type (must match the TYPE_PATTERN)
    public static boolean validateType(String type) {
        return type != null && TYPE_PATTERN.matcher(type).matches();
    }

    // Method to validate listingDate (must match the LISTING_DATE_PATTERN)
    public static boolean validateListingDate(String listingDate) {
        return listingDate != null && LISTING_DATE_PATTERN.matcher(listingDate).matches();
    }

    // Method to validate totalShares (must match the TOTAL_SHARES_PATTERN)
    public static boolean validateTotalShares(String totalShares) {
        return totalShares != null && TOTAL_SHARES_PATTERN.matcher(totalShares).matches() && Integer.parseInt(totalShares) > 0;
    }

    // Method to validate openPrice (must match the OPEN_PRICE_PATTERN)
    public static boolean validateOpenPrice(String openPrice) {
        return openPrice != null && OPEN_PRICE_PATTERN.matcher(openPrice).matches() && Double.parseDouble(openPrice) > 0;
    }

    // Method to validate closePrice (must match the CLOSE_PRICE_PATTERN)
    public static boolean validateClosePrice(String closePrice) {
        return closePrice != null && CLOSE_PRICE_PATTERN.matcher(closePrice).matches() && Double.parseDouble(closePrice) > 0;
    }

    
 }
