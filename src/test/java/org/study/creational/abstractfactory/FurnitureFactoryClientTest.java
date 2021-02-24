package org.study.creational.abstractfactory;

import org.junit.jupiter.api.Test;
import org.study.creational.abstractfactory.factory.impl.artdeco.ArtDecoFurnitureFactory;
import org.study.creational.abstractfactory.factory.impl.victorian.VictorianFurnitureFactory;
import org.study.creational.abstractfactory.product.impl.artdeco.ArtDecoChair;
import org.study.creational.abstractfactory.product.impl.artdeco.ArtDecoSofa;
import org.study.creational.abstractfactory.product.impl.artdeco.ArtDecoTable;
import org.study.creational.abstractfactory.product.impl.victorian.VictorianChair;
import org.study.creational.abstractfactory.product.impl.victorian.VictorianSofa;
import org.study.creational.abstractfactory.product.impl.victorian.VictorianTable;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureFactoryClientTest {

    @Test
    void shouldUseVictorianFactory() {
        FurnitureFactoryClient client = new FurnitureFactoryClient();
        client.factory = new VictorianFurnitureFactory();
        assertTrue(client.factory.getChair() instanceof VictorianChair);
        assertTrue(client.factory.getTable() instanceof VictorianTable);
        assertTrue(client.factory.getSofa() instanceof VictorianSofa);
    }

    @Test
    void shouldUseArtDecoFactory() {
        FurnitureFactoryClient client = new FurnitureFactoryClient();
        client.factory = new ArtDecoFurnitureFactory();
        assertTrue(client.factory.getChair() instanceof ArtDecoChair);
        assertTrue(client.factory.getTable() instanceof ArtDecoTable);
        assertTrue(client.factory.getSofa() instanceof ArtDecoSofa);
    }

}