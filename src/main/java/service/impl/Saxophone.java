package service.impl;

import org.springframework.stereotype.Component;
import service.Instrument;

/**
 * Created by SUN on 2016/11/17.
 */

public class Saxophone implements Instrument {
    public void play() {
        System.out.println("Saxophone");
    }
}
