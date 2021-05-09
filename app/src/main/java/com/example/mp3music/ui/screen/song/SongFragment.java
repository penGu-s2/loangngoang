package com.example.mp3music.ui.screen.song;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mp3music.R;
import com.example.mp3music.databinding.FragmentSongBinding;
import com.example.mp3music.model.Song;
import com.example.mp3music.ui.base.BaseBindingAdapter;
import com.example.mp3music.ui.base.BaseFragment;
import com.example.mp3music.ui.screen.MediaListener;
import com.example.mp3music.ui.screen.main.MainActivity;

public class SongFragment extends BaseFragment<FragmentSongBinding, SongViewModel> implements MediaListener<Song> {

    private BaseBindingAdapter<Song> adapter;

    @Override
    protected Class<SongViewModel> getViewModelClass() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_song;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new BaseBindingAdapter<>(
                R.layout.item_song, getLayoutInflater());
        binding.setAdapter(adapter);
        adapter.setListener(this);
        adapter.setData(viewModel.getSong(getContext()));
    }

    @Override
    public void onItemMediaClicked(Song item) {
        MainActivity activity = (MainActivity) getActivity();
        activity.getService().setData(adapter.getData());
        activity.getService().getController()
                .create(adapter.getData().indexOf(item));
    }
}