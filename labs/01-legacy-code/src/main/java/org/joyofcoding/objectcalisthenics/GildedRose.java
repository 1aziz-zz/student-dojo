package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.strategies.AgedBrieStrategy;
import org.joyofcoding.objectcalisthenics.strategies.ExpirableStrategy;
import org.joyofcoding.objectcalisthenics.strategies.TicketsStrategy;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());

    }

    List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }

    void updateQuality(List<Item> items) {

        ContextStrategy contextStrategyStrategy = ContextStrategy.getInstance();

        for (Item item : items) {
            String name = item.getName();

            if (!name.equals("Aged Brie") && !name.equals("Backstage passes to a TAFKAL80ETC concert") && !name.equals("Sulfuras, Hand of Ragnaros")) {
                contextStrategyStrategy.operate(item, new ExpirableStrategy());
            }

            if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                contextStrategyStrategy.operate(item, new TicketsStrategy());

            }
            if (name.equals("Aged Brie")) {
                contextStrategyStrategy.operate(item, new AgedBrieStrategy());

            }
        }
    }
}