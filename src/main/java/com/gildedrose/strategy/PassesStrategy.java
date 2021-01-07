package com.gildedrose.strategy;

import com.gildedrose.Item;

public class PassesStrategy extends UpdateStrategyBase {
    @Override
    protected void updateQuality(Item item) {
        increaseQuality(item);
        if (item.sellIn < 11) {
            increaseQuality(item);
        }
        if (item.sellIn < 6) {
            increaseQuality(item);
        }
    }

    @Override
    protected void updateQualityAfterExpiration(Item item) {
        item.quality = 0;
    }
}
