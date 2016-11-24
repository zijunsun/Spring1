package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import service.Instrument;
import service.Performer;




/**
 * Created by SUN on 2016/11/17.
 */
public class Instrumentalist implements Performer {
    public void perform() throws Exception {
        System.out.println("playing" + song + ":");
        instrument.play();
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
    public String screamSong(){
        return song;
    }

    @Autowired
    @Qualifier("piano")
    private Instrument instrument;


}
