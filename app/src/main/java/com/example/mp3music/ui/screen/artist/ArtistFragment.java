package com.example.mp3music.ui.screen.artist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mp3music.databinding.FragmentArtistBinding;
import com.example.mp3music.R;
import com.example.mp3music.model.Artist;
import com.example.mp3music.ui.base.BaseBindingAdapter;
import com.example.mp3music.ui.base.BaseFragment;

public class ArtistFragment extends BaseFragment<FragmentArtistBinding, ArtistViewModel> {

    private BaseBindingAdapter<Artist> adapter;

    @Override
    protected Class<ArtistViewModel> getViewModelClass() {
        return ArtistViewModel.class;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_artist;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new BaseBindingAdapter<>(
                R.layout.item_artist, getLayoutInflater());
        binding.setAdapter(adapter);
        adapter.setData(viewModel.getArtist(getContext()));
    }
}