/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StockIs.model;

/**
 *
 * @author prashantrijal
 */
public class stockModel {
    private String stockId;
    private String Name;
    private String Type;
    private String ListingDate;
    private int TotalShares;
    private double OpenPrice;
    private double ClosePrice;
    
    public stockModel(){
        
    }
    
    public stockModel(String stockId, String Name, String Type, String ListingDate, int TotalShares,double OpenPrice, double CLosePrice) {
        this.stockId = stockId;
        this.Name = Name;
        this.Type = Type;
        this.ListingDate = ListingDate;
        this.TotalShares = TotalShares;
        this.OpenPrice = OpenPrice;
        this.ClosePrice = CLosePrice;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
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

    public double getOpenPrice() {
        return OpenPrice;
    }

    public void setOpenPrice(double OpenPrice) {
        this.OpenPrice = OpenPrice;
    }

    public double getClosePrice() {
        return ClosePrice;
    }

    public void setClosePrice(double ClosePrice) {
        this.ClosePrice = ClosePrice;
    }


    
    
}
