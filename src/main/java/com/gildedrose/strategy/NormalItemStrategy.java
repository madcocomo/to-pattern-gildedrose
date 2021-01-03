package com.gildedrose.strategy;

import com.gildedrose.Item;

public class NormalItemStrategy extends UpdateStrategyBase {
    @Override
    public void updateItem(Item item) {
        decreaseQuality(item);

        decreaseSellIn(item);

        if (isExpired(item)) {
            decreaseQuality(item);
        }
    }

}
