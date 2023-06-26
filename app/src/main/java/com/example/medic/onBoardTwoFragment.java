package com.example.medic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class onBoardTwoFragment extends Fragment {

    private ImageView mImageView;
    private int mImageId;

    public onBoardTwoFragment() {
    }
    public static onBoardTwoFragment newInstance(int imageId) {
        onBoardTwoFragment fragment = new onBoardTwoFragment();
        Bundle args = new Bundle();
        args.putInt("image_id", imageId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImageId = getArguments().getInt("image_id");
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        mImageView = view.findViewById(R.id.imageFrag2);
        mImageView.setImageResource(mImageId);
        return view;
    }
}