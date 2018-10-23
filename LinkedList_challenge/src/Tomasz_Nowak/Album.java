package Tomasz_Nowak;

import java.util.ArrayList;

public class Album {

    private String title;
    ArrayList<Song> SongList = new ArrayList<Song>();

    public Album(String title) {
        this.title = title;
    }

    public void addSong(Song song){
        SongList.add(song);
    }

    public boolean CheckisInAlbum(String SongTitle){
        for( int i = 0;i < SongList.size();i++){
            if(SongTitle.equals(SongList.get(i).getTitle())){
                return true;
            }
        }
        return false;
    }

    public Song getByTitle(String Title){
        for(int i = 0; i < SongList.size(); i++){
            if(Title.equals(SongList.get(i).getTitle())){
                return SongList.get(i);
            }
        }
        return null;

    }



}
