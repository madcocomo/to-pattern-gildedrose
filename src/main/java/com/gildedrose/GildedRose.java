package com.gildedrose;

import com.gildedrose.strategy.*;

import java.util.Arrays;

class GildedRose {
    SelfUpdateItem[] items;

    static Item createItem(String name, int sellIn, int quality) {
        return new Item(name, sellIn, quality);
    }

    public GildedRose(Item[] items) {
        this.items = Arrays.stream(items)
                .map(this::toSelfUpdateItem)
                .toArray(SelfUpdateItem[]::new);
    }

    private SelfUpdateItem toSelfUpdateItem(Item item) {
        UpdateStrategy strategy = getUpdateStrategyFor(item);
        return new SelfUpdateItem(item, strategy);
    }

    private UpdateStrategy getUpdateStrategyFor(Item item) {
        UpdateStrategy strategy;
        if (item.name.equals("Aged Brie")) {
            strategy = new AgedBrieStrategy();
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            strategy = new PassesStrategy();
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            strategy = new SulfurasStrategy();
        } else {
            strategy = new NormalItemStrategy();
        }
        return strategy;
    }

    public void updateQuality() {
        for (SelfUpdateItem item : items) {
            item.update();
        }
    }

}
