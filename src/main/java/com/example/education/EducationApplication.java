package com.example.education;

import com.example.education.xml_dependency_injection.ClassicalMusic;
import com.example.education.xml_dependency_injection.Music;
import com.example.education.xml_dependency_injection.MusicPlayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EducationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // тест init и destroy методов (должно вывестить initialization и destruction)
        ClassicalMusic musicBean = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic musicBean1 = context.getBean("musicBean", ClassicalMusic.class);

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer == musicPlayer1); // проверяем, что бин не singleton

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getColor());
        for (Music music : musicPlayer.getMusicList()) {
            System.out.println(music.getSong());
        }

        context.close();
    }

}
