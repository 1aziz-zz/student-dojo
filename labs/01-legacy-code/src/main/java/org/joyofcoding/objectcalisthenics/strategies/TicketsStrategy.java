package org.joyofcoding.objectcalisthenics.strategies;

import org.joyofcoding.objectcalisthenics.Item;

/**
 * Created by aziz on 20-4-17 :)
 */
public class TicketsStrategy implements ProductStrategy {

    @Override
    public void operate(Item item) {
        item.increaseQuality();

        if (item.getSellIn() < 11) {
            item.increaseQuality();
        }

        if (item.getSellIn() < 6) {
            item.increaseQuality();
        }

        item.decreaseSellIn();
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
