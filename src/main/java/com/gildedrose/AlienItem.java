package com.gildedrose;

public class AlienItem {
    private String code;
    private int shelfLive;
    private int price;

    public AlienItem(String code, int shelfLive, int price) {
        this.code = code;
        this.shelfLive = shelfLive;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getShelfLive() {
        return shelfLive;
    }

    public void setShelfLive(int shelfLive) {
        this.shelfLive = shelfLive;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
