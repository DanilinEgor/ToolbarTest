package ru.egor_d.toolbartest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Egor Danilin on 13.10.15.
 */
public class MainFragment extends Fragment {
    @Bind(R.id.text)
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setText(getClass().getSimpleName());
    }

    @OnClick(R.id.button_image)
    public void buttonImageClicked() {
        ((MainActivity) getActivity()).setFragment(new ImageViewFragment());
    }

    @OnClick(R.id.button_search)
    public void buttonSearchClicked() {
        ((MainActivity) getActivity()).setFragment(new SearchViewFragment());
    }

    @OnClick(R.id.button_text)
    public void buttonTextClicked() {
        ((MainActivity) getActivity()).setFragment(new TextViewFragment());
    }

    @OnClick(R.id.button_edittext)
    public void buttonEditTextClicked() {
        ((MainActivity) getActivity()).setFragment(new EditTextFragment());
    }
}
