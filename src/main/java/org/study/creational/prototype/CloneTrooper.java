package org.study.creational.prototype;

public abstract class CloneTrooper
        implements Cloneable {

    protected int troopedSpecializationId;
    protected String trooperSpecialization;

    protected abstract String describeCombatRole();

    @Override
    protected CloneTrooper clone() throws CloneNotSupportedException {
        return (CloneTrooper) super.clone();
    }

}
