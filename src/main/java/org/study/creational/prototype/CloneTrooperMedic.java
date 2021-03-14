package org.study.creational.prototype;

public class CloneTrooperMedic
        extends CloneTrooper {

    private Object emergencyKit;

    @Override
    public String describeCombatRole() {
        return "Healing";
    }

    @Override
    public CloneTrooperMedic clone() throws CloneNotSupportedException {
        var clone = (CloneTrooperMedic) super.clone();
        clone.emergencyKit = new Object();
        return clone;
    }

}
