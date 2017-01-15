package com.oreilly.config;

import com.oreilly.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by innuendo on 15/01/2017.
 */
@Configuration
public class AppConfig {

    @Bean
    public Game game(){
        return new BaseballGame(redSox(), cubs());
    }

    @Bean
    public Team redSox(){
        return new RedSox();
    }

    @Bean
    public Team cubs(){
        return new Cubs();
    }

    @Bean
    public Team royals(){
        return new Royals();
    }
}
