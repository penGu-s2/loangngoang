package com.example.mp3music.ui.screen.artist;

import android.content.Context;

import com.example.mp3music.model.Artist;
import com.example.mp3music.ui.base.BaseViewModel;
import com.example.mp3music.utils.SystemData;

import java.util.ArrayList;

public class ArtistViewModel extends BaseViewModel {
    private ArrayList<Artist> artists;

    public ArrayList<Artist> getArtist(Context context) {
        if (artists == null) {
            SystemData data = new SystemData(context);
            artists = data.getData(Artist.class);
        }
        return artists;
    }

}