package service.impl;

import org.springframework.beans.factory.InitializingBean;
import service.Performer;

/**
 * Created by SUN on 2016/11/14.
 */
public class Juggler implements Performer {

    public void setBeanBags(int beanBags) {
        this.beanBags = beanBags;
    }

    private int beanBags = 3;

    public Juggler(){

    }

    public Juggler(int beanBags ){
        this.beanBags = beanBags;
    }

    public void perform() throws Exception {
        System.out.print("Juggler " + beanBags + " beanBags");

    }

}
