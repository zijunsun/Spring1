package service.config;

import org.aopalliance.intercept.Joinpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.Performer;
import service.impl.Juggler;

/**
 * Created by SUN on 2016/11/23.
 */
@Configuration
public class springConfig {
    @Bean
    public Performer duke(){
        Juggler juggler = new Juggler();
        juggler.setBeanBags(20);
        return juggler ;

    }
}

