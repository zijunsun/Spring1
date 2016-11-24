package service.impl;

import org.springframework.stereotype.Component;
import service.Poem;

/**
 * Created by SUN on 2016/11/17.
 */

public class Sonnet29 implements Poem {
    private static String[] LINES = {
            "When, in disgrace with fortune and men's eyes,",
            "I am alone beweep my outcast state",
            "And trouble deaf heaven with my bootless cries"
    };

    public void recite() {
        for(int i = 0;i<LINES.length;i++)
            System.out.println(LINES[i]);
    }
}
