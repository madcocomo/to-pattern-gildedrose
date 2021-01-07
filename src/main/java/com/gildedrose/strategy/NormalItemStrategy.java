package com.gildedrose.strategy;

import com.gildedrose.Item;

public class NormalItemStrategy extends UpdateStrategyBase {
    @Override
    protected void updateQuality(Item item) {
        decreaseQuality(item);
    }

    @Override
    protected void updateQualityAfterExpiration(Item item) {
        decreaseQuality(item);
    }
}
