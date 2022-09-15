package org.launchcode.studio7;

public abstract class BaseDisc {

    String name; //title
    double storageCapacity; // 700, 470
    String contents; //songs, motion picture
    String discType; //album, movie, etc.

    public BaseDisc(String name, double storageCapacity, String contents, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }
}
