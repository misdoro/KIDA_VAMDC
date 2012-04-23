package org.vamdc.kida.dao;

import org.vamdc.kida.dao.auto._KidaMap;

public class KidaMap extends _KidaMap {

    private static KidaMap instance;

    private KidaMap() {}

    public static KidaMap getInstance() {
        if(instance == null) {
            instance = new KidaMap();
        }

        return instance;
    }
}
