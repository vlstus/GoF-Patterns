package org.study.creational.abstractfactory.factory.impl.artdeco;

import org.study.creational.abstractfactory.factory.FurnitureFactory;
import org.study.creational.abstractfactory.product.Chair;
import org.study.creational.abstractfactory.product.Sofa;
import org.study.creational.abstractfactory.product.Table;
import org.study.creational.abstractfactory.product.impl.artdeco.ArtDecoChair;
import org.study.creational.abstractfactory.product.impl.artdeco.ArtDecoSofa;
import org.study.creational.abstractfactory.product.impl.artdeco.ArtDecoTable;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa getSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table getTable() {
        return new ArtDecoTable();
    }

}
