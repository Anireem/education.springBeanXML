package com.example.education.xml_dependency_injection;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private String color;
    private List<Music> musicList;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music getMusic() {
        return music;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
