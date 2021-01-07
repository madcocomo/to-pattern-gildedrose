package com.gildedrose.strategy;

import com.gildedrose.Item;

public class UpdateStrategyBase implements UpdateStrategy {
    @Override
    public void updateItem(Item item) {
        updateQuality(item);
        decreaseSellIn(item);
        if (isExpired(item)) {
            updateQualityAfterExpiration(item);
        }
    }

    protected void updateQuality(Item item) {
    }

    protected void updateQualityAfterExpiration(Item item) {
    }

    protected boolean isExpired(Item item) {
        return item.sellIn < 0;
    }

    protected void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    protected void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
