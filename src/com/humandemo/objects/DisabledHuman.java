package com.humandemo.objects;

import com.humandemo.interfaces.Human;
import com.humandemo.interfaces.HumanService;

public class DisabledHuman implements Human {

    private HumanService humanService;

    public void setHumanService(HumanService theHumanService){
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
