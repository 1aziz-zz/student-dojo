package org.joyofcoding.objectcalisthenics;

/**
 * Created by aziz on 17-4-17 :)
 */

class Quality {
    private int quality;

    Quality(int quality) {
        this.quality = quality;
    }

    void clear() {
        quality = 0;
    }

    int getValue() {
        return quality;
    }

    void setValue(int quality) {
        this.quality = quality;
    }
}