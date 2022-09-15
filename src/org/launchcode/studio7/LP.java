package org.launchcode.studio7;

public class LP extends BaseDisc implements AnyDisc{

    public LP(String name, double storageCapacity, String contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The LP, " + this.name + ", spins at a rate of 70 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("Nope, can't do that!");
    }

    @Override
    public void readData() {
        System.out.println("The LP is currently playing the " + this.discType + " named '" + this.name + "'.");
    }
}
