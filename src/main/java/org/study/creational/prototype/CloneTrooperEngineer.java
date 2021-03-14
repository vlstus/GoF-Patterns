package org.study.creational.prototype;

public class CloneTrooperEngineer
        extends CloneTrooper {

    private Object engineeringTool;

    @Override
    public String describeCombatRole() {
        return "Repairing";
    }

    @Override
    public CloneTrooperEngineer clone() throws CloneNotSupportedException {
        var clone = (CloneTrooperEngineer) super.clone();
        clone.engineeringTool = new Object();
        return clone;
    }

}
