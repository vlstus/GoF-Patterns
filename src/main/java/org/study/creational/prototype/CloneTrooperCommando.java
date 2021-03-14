package org.study.creational.prototype;

public class CloneTrooperCommando
        extends CloneTrooper {

    private Object weapons;

    @Override
    public String describeCombatRole() {
        return "Fighting";
    }

    @Override
    public CloneTrooperCommando clone() throws CloneNotSupportedException {
        var clone = (CloneTrooperCommando) super.clone();
        clone.weapons = new Object();
        return clone;
    }

}
