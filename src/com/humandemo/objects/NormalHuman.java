package com.humandemo.objects;

import com.humandemo.interfaces.Human;
import com.humandemo.interfaces.HumanService;

public class NormalHuman implements Human {

    // create private field for Service
    private HumanService humanService;

    // create constructor based DI
    public NormalHuman(HumanService theHumanService){
        humanService = theHumanService;
    }

    @Override
    public String legs() {
        return humanService.legsService();
    }

    @Override
    public String arms() {
        return humanService.armsService();
    }

    @Override
    public String head() {
        return humanService.headService();
    }

}
