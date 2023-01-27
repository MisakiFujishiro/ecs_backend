package org.debugroom.mynavi.sample.ecs.backend.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBootを有効化・Appが配置されているパッケージでpCOmponentをスキャン・Bean登録などを実施
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}