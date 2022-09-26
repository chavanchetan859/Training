package Quetion2;

import java.util.Scanner;

public class MailnSongList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many songs you want to add");
        QueueSongList playList=new QueueSongList(sc.nextInt());

        playList.enqueSong(new SongList("song1"));
        playList.enqueSong(new SongList("song2"));
        playList.enqueSong(new SongList("song3"));
        playList.enqueSong(new SongList("song4"));
        playList.enqueSong(new SongList("song5"));

        playList.playSong("song123");
        playList.playSong("song1");
        playList.allSongs();
        playList.dequeueSong();
        playList.allSongs();
        playList.totalSongs();
    }
}
