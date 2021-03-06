package com.example.mp3music.ui.screen.album;

import android.content.Context;


import com.example.mp3music.model.Album;
import com.example.mp3music.ui.base.BaseViewModel;
import com.example.mp3music.utils.SystemData;

import java.util.ArrayList;

public class AlbumViewModel extends BaseViewModel {

    private ArrayList<Album> albums;

    public ArrayList<Album> getAlbum(Context context) {
        if (albums == null) {
            SystemData data = new SystemData(context);
            albums = data.getData(Album.class);
        }
        return albums;
    }

}