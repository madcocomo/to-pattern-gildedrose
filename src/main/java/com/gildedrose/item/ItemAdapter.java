package com.gildedrose.item;

public class ItemAdapter implements UnionItemAdapter{
    private final Item adaptee;

    public ItemAdapter(Item adaptee) {
        this.adaptee = adaptee;
    }

    public String getName() {
        return adaptee.getName();
    }

    public int getSellIn() {
        return adaptee.getSellIn();
    }

    public void setSellIn(int sellIn) {
        adaptee.setSellIn(sellIn);
    }

    public int getQuality() {
        return adaptee.getQuality();
    }

    public void setQuality(int quality) {
        adaptee.setQuality(quality);
    }

    @Override
    public String itemInfo() {
        return adaptee.toString();
    }
}
