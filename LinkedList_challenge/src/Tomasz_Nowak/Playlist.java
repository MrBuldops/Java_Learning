package Tomasz_Nowak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    LinkedList<Song> playlist = new LinkedList<Song>();


    public void Play(){
        Scanner scanner  = new Scanner(System.in);
        boolean quit = false;
        boolean goForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        Song NowSong ;

        if(playlist.isEmpty()) {
            System.out.println("playlist is empty");
            return;
        }else {
            NowSong = listIterator.next();
            System.out.println("Now playing: " + NowSong.getTitle() + ":" + NowSong.getDuration());
            //PrintMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("goodbye!");
                    quit = true;
                    break;
                case 1:
                    if(goForward) {
                        listIterator.previous();
                        goForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        NowSong =listIterator.previous();
                        System.out.println("Now playing: " + NowSong.getTitle() + ":" + NowSong.getDuration());
                    }else {
                        System.out.println("We are at the start of playlist");
                    }
                    break;
                case 2: //replay

                    if(!goForward) {
                        NowSong = listIterator.next();
                        goForward = true;
                    }
                    else {
                        NowSong = listIterator.previous();
                        goForward = false;
                    }
                    System.out.println("Now playing: " + NowSong.getTitle() + ":" + NowSong.getDuration());
                    break;
                case 3:
                    if(!goForward) {
                       listIterator.next();
                        goForward = true;
                    }
                    if(listIterator.hasNext()){
                        NowSong = listIterator.next();
                        System.out.println("Now playing: " + NowSong.getTitle() + ":" + NowSong.getDuration());
                    }else {
                        System.out.println("Reached the end of playlist");
                        goForward = false;
                    }
                    break;
            }
        }
    }

    public boolean AddToPlaylist(String SongTitle, ArrayList<Album> albums){
       for(int i = 0; i<albums.size();i++){
           if(albums.get(i).getByTitle(SongTitle) != null){
               playlist.add(albums.get(i).getByTitle(SongTitle));
              return true;
           }

       }
       return false;
    }

    public void PrintPlayList(){
        for(int i = 0; i<playlist.size();i++ ){
            System.out.println((i+1) + ". " + playlist.get(i).getTitle());
        }

    }






}
