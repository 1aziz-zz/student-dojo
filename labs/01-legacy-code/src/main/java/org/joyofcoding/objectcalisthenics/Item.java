package org.joyofcoding.objectcalisthenics;

public class Item {
    private String name;
    private SellIn sellIn;
    private Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = new Quality(quality);
        this.sellIn = new SellIn(sellIn);
    }
    // Getters and setter methods

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn.getValue();
    }

    public int getQuality() {
        return quality.getValue();
    }

    public void setQuality(int quality) {
        this.quality.setValue(quality);
    }

    // Increase or decrease methods

    public void increaseQuality() {
        if (quality.getValue() < 50) {
            quality.setValue(quality.getValue() + 1);
        }
    }

    public void decreaseQuality() {
        if (quality.getValue() > 0) {
            quality.setValue(quality.getValue() - 1);
        }
    }

    public void increaseSellIn() {
        this.sellIn.setValue(this.sellIn.getValue() + 1);
    }

    public void decreaseSellIn() {
        this.sellIn.setValue(this.sellIn.getValue() - 1);
    }

}