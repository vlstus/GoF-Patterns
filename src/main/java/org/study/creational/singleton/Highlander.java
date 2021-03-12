package org.study.creational.singleton;

import static java.util.Objects.isNull;

public class Highlander {

    private static volatile Highlander macLeod;

    private Highlander() {

    }

    /*
    https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java
    * */
    public static Highlander getHighLander() {
        var localRef = macLeod;
        if (isNull(localRef)) {
            synchronized (Highlander.class) {
                localRef = macLeod;
                if (isNull(localRef)) {
                    localRef = macLeod = new Highlander();
                }
            }
        }
        return localRef;
    }

    @Override
    public String toString() {
        return "There can be only one Highlander";
    }

}
