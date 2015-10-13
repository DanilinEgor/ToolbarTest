package ru.egor_d.toolbartest;

import android.graphics.Color;
import android.os.Bundle;

/**
 * Created by Egor Danilin on 13.10.15.
 */
public class ImageViewFragment extends MainFragment {
    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getView() != null) {
            getView().setBackgroundColor(Color.parseColor("#8000ff00"));
        }
        ((MainActivity) getActivity()).setImageView();
    }
}
