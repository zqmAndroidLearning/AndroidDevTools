package com.example.laznrbfe.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTAR_MESSAGE);

        TextView textView = new TextView(this);

        textView.setTextSize(40);
        textView.setText(message);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);

        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment() {}


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            return super.onCreateView(inflater, container, savedInstanceState);
//            View rootView = inflater.inflate(R.layout.fragment_display_message, container, false);
//            return rootView;
        }
    }

}
