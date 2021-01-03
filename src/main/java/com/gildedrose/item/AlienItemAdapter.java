package com.gildedrose.item;

public class AlienItemAdapter implements UnionItemAdapter {
    private AlienItem adaptee;

    public AlienItemAdapter(AlienItem item) {
        adaptee = item;
    }

    @Override
    public String getName() {
        return adaptee.getCode();
    }

    @Override
    public int getSellIn() {
        return adaptee.getShelfLive();
    }

    @Override
    public void setSellIn(int sellIn) {
        adaptee.setShelfLive(sellIn);
    }

    @Override
    public int getQuality() {
        return adaptee.getPrice();
    }

    @Override
    public void setQuality(int quality) {
        adaptee.setPrice(quality);
    }

    @Override
    public String itemInfo() {
        return adaptee.getCode() + ", " + adaptee.getShelfLive() + ", " + adaptee.getPrice();
    }
}
