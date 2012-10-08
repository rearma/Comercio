package com.arsisec.model;

import com.arsisec.model.auto._ComercioDM;

public class ComercioDM extends _ComercioDM {

    private static ComercioDM instance;

    private ComercioDM() {}

    public static ComercioDM getInstance() {
        if(instance == null) {
            instance = new ComercioDM();
        }

        return instance;
    }
}
