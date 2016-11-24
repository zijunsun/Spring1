package service.impl;

import org.springframework.stereotype.Component;
import service.Instrument;

/**
 * Created by SUN on 2016/11/18.
 */

public class guitar implements Instrument {
    public void play() {
        System.out.println("guitar");
    }
}
