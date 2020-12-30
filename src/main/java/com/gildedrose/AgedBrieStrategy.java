package com.gildedrose;

public class AgedBrieStrategy extends UpdateStrategy {
    @Override
    void updateItem(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sell_in = item.sell_in - 1;

        if (item.sell_in < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }
}
