package org.study.creational.abstractfactory.factory.impl.victorian;

import org.study.creational.abstractfactory.factory.FurnitureFactory;
import org.study.creational.abstractfactory.product.Chair;
import org.study.creational.abstractfactory.product.Sofa;
import org.study.creational.abstractfactory.product.Table;
import org.study.creational.abstractfactory.product.impl.victorian.VictorianChair;
import org.study.creational.abstractfactory.product.impl.victorian.VictorianSofa;
import org.study.creational.abstractfactory.product.impl.victorian.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table getTable() {
        return new VictorianTable();
    }

}
