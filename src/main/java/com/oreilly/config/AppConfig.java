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

/**
 * Created by innuendo on 15/01/2017.
 */
//@Configuration
//@ComponentScan(basePackages = "com.oreilly")
//public class AppConfig {

//	@Autowired
//	private DataSource dataSource;
//
//	@Resource
//	private Team redSox;
//
//	@Qualifier("cubs")
//	@Autowired
//	private Team cubs2;
//
//	@Bean
//	public Game game() {
//		BaseballGame baseballGame= new BaseballGame(redSox, cubs2);
//		baseballGame.setDataSource(dataSource);
//
//		return baseballGame;
//	}

//	@Bean
//	public Team redSox() {
//		return new RedSox();
//	}
//
//	@Bean
//	public Team cubs() {
//		return new Cubs();
//	}

//	@Bean
//	public Team royals() {
//		return new Royals();
//	}
//}
