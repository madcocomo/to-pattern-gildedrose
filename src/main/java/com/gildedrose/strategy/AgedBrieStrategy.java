package com.gildedrose.strategy;

import com.gildedrose.Item;

public class AgedBrieStrategy extends UpdateStrategyBase {
    @Override
    public void updateItem(Item item) {
        increaseQuality(item);

        decreaseSellIn(item);

        if (isExpired(item)) {
            increaseQuality(item);
        }
    }

}
