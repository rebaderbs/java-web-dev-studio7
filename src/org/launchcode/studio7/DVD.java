package org.launchcode.studio7;

public class DVD extends BaseDisc implements AnyDisc {

    public DVD(String name, double storageCapacity, String contents, String discType)    {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The DVD, " + this.name + ", spins at a rate of 570 - 1600 rpm. 'Feels like we're running at an incredible rate, Hare!'");
    }

    @Override
    public void writeData() {
        System.out.println("The " + this.discType + ", " + this.name + ", has been burned onto a DVD, you pirate.");
    }

    @Override
    public void readData() {
        System.out.println("The DVD is currently playing the " + this.discType + " named '" + this.name + "'. I hope you're watching on a larger screen for an optimal viewing experience.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
