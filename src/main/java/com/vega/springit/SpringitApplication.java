package com.vega.springit;

import com.vega.springit.domain.Comments;
import com.vega.springit.domain.Link;
import com.vega.springit.repository.CommentRepository;
import com.vega.springit.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
//@EnableConfigurationProperties(SpringitApplication.class)
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to Spring it!!");
    }

//    @Bean
////    @Profile("dev")
//    CommandLineRunner runner() {
//        return args -> {
//            System.out.println("This is something that we would only do in dev");
//        };
//    }

    @Bean
//    @Profile("dev")
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link =new Link("Getting Started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2");
            linkRepository.save(link);

            Comments comment =new Comments("This Spring Boot 2 link is awesome",link);
            commentRepository.save(comment);
            link.addComment(comment);

            System.out.println(link.toString());
            System.out.println("we just inserted a link and a comment");

            Link firstLink =linkRepository.findByTitle("Getting Started with Spring Boot 2");
            System.out.println(firstLink.getTitle());

        };
    }

}
