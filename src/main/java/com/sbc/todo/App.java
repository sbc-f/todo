package com.sbc.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * アプリ起動
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
		SpringApplication.run(App.class, args);
        System.out.println( "Start!!" );
    }
}
