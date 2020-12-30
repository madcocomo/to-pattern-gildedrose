package com.gildedrose;

public class SelfUpdateItem {
    UpdateStrategy strategy = new UpdateStrategy();
    private final Item item;

    public SelfUpdateItem(Item item, UpdateStrategy strategy) {
        this.item = item;
        if (strategy != null) {
            this.strategy = strategy;
        }
    }

    public SelfUpdateItem(Item item) {
        this(item, null);
    }

    public void update() {
        strategy.updateItem(item);
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
