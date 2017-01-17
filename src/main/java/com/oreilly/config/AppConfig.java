package com.oreilly.config;

import com.oreilly.entities.*;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

/**
 * Created by innuendo on 15/01/2017.
 */
@Configuration
@ComponentScan(basePackages = "com.oreilly")
public class AppConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private List<Team> teams;

//	@Resource
//	private Team redSox;
//
//	@Qualifier("cubs")
//	@Autowired
//	private Team cubs2;

    @Bean
    public Game game() {
        for (Team t:
             teams
                ) {
            System.out.println("--------------" + t.getName());

        }
        BaseballGame baseballGame = new BaseballGame(teams.get(0), teams.get(1));
        baseballGame.setDataSource(dataSource);

        return baseballGame;
    }

//	@Bean
//	public Team redSox() {
//		return new RedSox();
//	}
//
//	@Bean
//	public Team cubs() {
//		return new Cubs();
//	}
//
//	@Bean
//	public Team royals() {
//		return new Royals();
//	}
}
