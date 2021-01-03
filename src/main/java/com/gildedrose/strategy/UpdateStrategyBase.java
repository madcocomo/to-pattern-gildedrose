package com.gildedrose.strategy;

import com.gildedrose.Item;

public abstract class UpdateStrategyBase implements UpdateStrategy {
    public abstract void updateItem(Item item);

    protected void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    protected void decreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    protected void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    protected boolean isExpired(Item item) {
        return item.getSellIn() < 0;
    }
}
