package org.launchcode.studio7;

public class FloppyDisk extends BaseDisc implements AnyDisc{

    public FloppyDisk(String name, double storageCapacity, String contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The floppy disk spins at a rate of 300 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("The " + this.discType + ", " + this.name + ", has been copied to the floppy disk.");
    }

    @Override
    public void readData() {
        System.out.println("The floppy disk is currently running the " + this.discType + " named '" + this.name + "'. Happy trails.");

    }
}
