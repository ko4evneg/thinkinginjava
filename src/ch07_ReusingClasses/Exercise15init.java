package ch07_ReusingClasses;

import ch07_ReusingClasses.Exercise15.Vehicle;

public class Exercise15init extends Vehicle{
    public static void main(String[] args) {
        Exercise15init bicycle = new Exercise15init();
        //bicycle.set(); //not working
        bicycle.set("JustSet");
        bicycle.setName("SetName");
        bicycle.setThisName("SetThisName");
    }

    public void setName (String s) {
        super.set(s);
    }
    public void setThisName (String s) {
        this.set(s);
    }
}
