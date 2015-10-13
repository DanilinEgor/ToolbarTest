package ru.egor_d.toolbartest;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.image)
    ImageView imageView;
    @Bind(R.id.search_view)
    SearchView searchView;
    @Bind(R.id.text)
    TextView textView;
    @Bind(R.id.edit_text)
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setFragment(new ImageViewFragment());
    }

    private void hideAll() {
        searchView.setVisibility(View.GONE);
        textView.setVisibility(View.GONE);
        editText.setVisibility(View.GONE);
        imageView.setVisibility(View.GONE);
    }

    public void setImageView() {
        hideAll();
        imageView.setVisibility(View.VISIBLE);
    }

    public void setTextView() {
        hideAll();
        textView.setVisibility(View.VISIBLE);
    }

    public void setSearchView() {
        hideAll();
        searchView.setVisibility(View.VISIBLE);
    }

    public void setEditText() {
        hideAll();
        editText.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.image)
    public void imageClicked() {
        Toast.makeText(this, "ImageView clicked", Toast.LENGTH_SHORT).show();
    }

    public void setFragment(final Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, fragment).commit();
    }
}
