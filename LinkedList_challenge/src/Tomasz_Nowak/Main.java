package Tomasz_Nowak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Album> ListOfAlbums = new ArrayList<Album>();
        Playlist playlist = new Playlist();

        Album TempAlbum = new Album("36 Chambers");
        Song TempSong = new Song("C.R.E.A.M",252);
        TempAlbum.addSong(TempSong);
        TempSong = new Song("Method Man",351);
        TempAlbum.addSong(TempSong);
        TempSong = new Song("Protect Ya Neck",292);
        TempAlbum.addSong(TempSong);
        TempSong = new Song("Tearz",257);
        TempAlbum.addSong(TempSong);
        TempSong = new Song("Bring Da Ruckus",250);
        TempAlbum.addSong(TempSong);
        ListOfAlbums.add(TempAlbum);

        TempAlbum = new Album("Sticky Fingers");
        TempSong = new Song("Wild Horses",344);
        TempAlbum.addSong(TempSong);
        TempSong = new Song("Dead Flowers",245);
        TempAlbum.addSong(TempSong);
        TempSong = new Song("Bitch",217);
        TempAlbum.addSong(TempSong);
        TempSong = new Song("Sister Morphine",334);
        TempAlbum.addSong(TempSong);
        ListOfAlbums.add(TempAlbum);

        IsAdded(playlist.AddToPlaylist("Dead Flowers",ListOfAlbums));
        IsAdded(playlist.AddToPlaylist("Bring Da Ruckus",ListOfAlbums));
        IsAdded(playlist.AddToPlaylist("Wild Horses",ListOfAlbums));
        IsAdded(playlist.AddToPlaylist("Kazdy ponad kazdym",ListOfAlbums));
        IsAdded(playlist.AddToPlaylist("Bitch",ListOfAlbums));
        IsAdded(playlist.AddToPlaylist("Tearz",ListOfAlbums));
        IsAdded(playlist.AddToPlaylist("C.R.E.A.M",ListOfAlbums));

        System.out.println("\n\n");
        playlist.PrintPlayList();

        playlist.Play();

    }

    public static void IsAdded(boolean flag){
        if(flag){
            System.out.println("Song was added successfully to the play list ");
        }
        else{
            System.out.println("No song added. There is no such song in any album");
        }
    }
}
