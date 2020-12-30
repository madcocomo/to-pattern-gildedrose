package com.gildedrose;

public class SelfUpdateItem {
    private final UpdateStrategy strategy;
    private final Item item;

    public SelfUpdateItem(Item item, UpdateStrategy strategy) {
        this.item = item;
        this.strategy = strategy;
    }

    public void update() {
        strategy.updateItem(item);
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
