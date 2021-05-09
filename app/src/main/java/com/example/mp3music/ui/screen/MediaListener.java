package com.example.mp3music.ui.screen;


import com.example.mp3music.model.BaseModel;
import com.example.mp3music.ui.base.BaseBindingAdapter;

public interface MediaListener<T extends BaseModel>
        extends BaseBindingAdapter.BaseBindingListener {
    void onItemMediaClicked(T item);
}