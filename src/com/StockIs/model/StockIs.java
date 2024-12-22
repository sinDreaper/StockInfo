/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StockIs.model;

/**
 *
 * @author prashantrijal
 */
public class StockIs {
    private int StockId;
    private String Name;
    private String Type;
    private String ListingDate;
    private int TotalShares;
    private int OpenPrice;
    private int ClosePrice;

    public int getStockId() {
        return StockId;
    }

    public void setStockId(int StockId) {
        this.StockId = StockId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getListingDate() {
        return ListingDate;
    }

    public void setListingDate(String ListingDate) {
        this.ListingDate = ListingDate;
    }

    public int getTotalShares() {
        return TotalShares;
    }

    public void setTotalShares(int TotalShares) {
        this.TotalShares = TotalShares;
    }

    public int getOpenPrice() {
        return OpenPrice;
    }

    public void setOpenPrice(int OpenPrice) {
        this.OpenPrice = OpenPrice;
    }

    public int getClosePrice() {
        return ClosePrice;
    }

    public void setClosePrice(int ClosePrice) {
        this.ClosePrice = ClosePrice;
    }
    
}
