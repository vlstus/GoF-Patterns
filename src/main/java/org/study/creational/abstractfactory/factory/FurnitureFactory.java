package org.study.creational.abstractfactory.factory;

import org.study.creational.abstractfactory.product.Chair;
import org.study.creational.abstractfactory.product.Sofa;
import org.study.creational.abstractfactory.product.Table;

public interface FurnitureFactory {

    Chair getChair();

    Sofa getSofa();

    Table getTable();

}
