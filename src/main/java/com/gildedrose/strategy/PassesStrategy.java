package com.gildedrose.strategy;

import com.gildedrose.Item;

public class PassesStrategy extends UpdateStrategyBase {
    @Override
    public void updateItem(Item item) {
        increaseQuality(item);
        if (item.getSellIn() < 11) {
            increaseQuality(item);
        }
        if (item.getSellIn() < 6) {
            increaseQuality(item);
        }

        decreaseSellIn(item);

        if (isExpired(item)) {
            item.setQuality(0);
        }
    }
}
