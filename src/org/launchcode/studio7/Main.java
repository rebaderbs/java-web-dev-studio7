package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

//songs, motion picture
//music, movie, etc.
// 700, 470

        // TODO: Declare and initialize a CD and a DVD object.

        CD cd = new CD("City and Colour", 700, "songs", "music album");
        DVD dvd = new DVD("Dumb and Dumber", 470, "motion picture", "movie");
        LP lp = new LP("Bon Iver", 90, "songs", "music album");
        FloppyDisk floppyDisk = new FloppyDisk("oregontrail.exe", 32, "files", "program");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.print("\n");
        cd.spinDisc();
        dvd.spinDisc();
        lp.spinDisc();
        floppyDisk.spinDisc();

        System.out.print("\n");
        cd.writeData();
        dvd.writeData();
        lp.writeData();
        floppyDisk.writeData();

        System.out.print("\n");
        cd.readData();
        dvd.readData();
        lp.readData();
        floppyDisk.readData();

    }
}
