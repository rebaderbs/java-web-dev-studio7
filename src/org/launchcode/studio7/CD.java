package org.launchcode.studio7;

public class CD extends BaseDisc implements AnyDisc {

    public CD(String name, double storageCapacity, String contents, String discType)    {
        super(name, storageCapacity, contents, discType);
    }
    @Override
    public void spinDisc() {
        System.out.println("The CD, " + this.name + ", spins at a rate of 200 - 500 rpm. Holy cow, that's fast!");
    }

    @Override
    public void writeData() {
        System.out.println("The " + this.discType + ", " + this.name + ", has been burned onto a CD, you pirate.");
    }

    @Override
    public void readData() {
        System.out.println("The CD is currently playing the " + this.discType + " named '" + this.name + "'. Enjoy the soothing voice of Dallas Green.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
