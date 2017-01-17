package com.oreilly;

import com.oreilly.config.AppConfig;
import com.oreilly.entities.Game;
import com.oreilly.entities.Team;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");

        Game game = context.getBean("game", Game.class);
//        Team royals = context.getBean("royals", Team.class);
//        Team redSox = context.getBean("redSox", Team.class);
//        Team cubs = context.getBean("cubs", Team.class);

//        game.setHomeTeam(royals);
//        game.setAwayTeam(cubs);
//        game.playGame();
        System.out.println("game.playGame() - " + game.playGame());

        System.out.println("There are " + context.getBeanDefinitionCount());

        for (String names:
             context.getBeanDefinitionNames()
                ) {
            System.out.println(names);
        }

//        game.setHomeTeam(cubs);
//        game.setAwayTeam(redSox);
//        game.playGame();
//        System.out.println(game.playGame());

//        context.close();
    }
}