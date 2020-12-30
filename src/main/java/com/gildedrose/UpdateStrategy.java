package com.gildedrose;

public class UpdateStrategy {
    void updateItem(Item item) {
        if (!isAgedBrie(item)
                && !isPasses(item)) {
            if (item.quality > 0) {
                if (!isSulfuras(item)) {
                    item.quality = item.quality - 1;
                }
            }
        } else {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

                if (isPasses(item)) {
                    if (item.sell_in < 11) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }

                    if (item.sell_in < 6) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                }
            }
        }

        if (!isSulfuras(item)) {
            item.sell_in = item.sell_in - 1;
        }

        if (item.sell_in < 0) {
            if (!isAgedBrie(item)) {
                if (!isPasses(item)) {
                    if (item.quality > 0) {
                        if (!isSulfuras(item)) {
                            item.quality = item.quality - 1;
                        }
                    }
                } else {
                    item.quality = 0;
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
    }

    protected boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    protected boolean isPasses(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    protected boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }
}
