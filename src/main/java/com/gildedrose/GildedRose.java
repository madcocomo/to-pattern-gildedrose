package com.gildedrose;

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
        if (item.name.equals("Aged Brie")) {
            return new SelfUpdateItem(item, new AgedBrieStrategy());
        }
        return new SelfUpdateItem(item);
    }

    public void updateQuality() {
        for (SelfUpdateItem item : items) {
            item.update();
        }
    }

}
