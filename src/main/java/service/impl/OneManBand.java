package service.impl;

import service.Instrument;
import service.Performer;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/**
 * Created by SUN on 2016/11/17.
 */
public class OneManBand implements Performer {
    public void perform() throws Exception {
        for(Object key:instruments.keySet()){
            System.out.println(key + ":");
            System.out.println(instruments.getProperty(key.toString()));
        }
    }
    private Properties instruments;
    public void setInstruments(Properties instruments){
        this.instruments = instruments;
    }
}
