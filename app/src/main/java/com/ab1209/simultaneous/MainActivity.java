package com.ab1209.simultaneous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ab1209.simultaneous.interfaces.ScrollViewListener;
import com.ab1209.simultaneous.views.ObservableHorizontalScrollView;
import com.ab1209.simultaneous.views.ObservableScrollView;

public class MainActivity extends AppCompatActivity implements ScrollViewListener {
    private final static String TAG = "MainActivity";

    private ObservableScrollView scrollViewVerticalBoth;
    private ObservableScrollView scrollViewVerticalOnly;
    private ObservableHorizontalScrollView scrollViewHorizontalBoth;
    private ObservableHorizontalScrollView scrollViewHorizontalOnly;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollViewVerticalBoth = (ObservableScrollView) findViewById(R.id.activity_main_scrollview_vertical_both);
        scrollViewVerticalOnly = (ObservableScrollView) findViewById(R.id.activity_main_scrollview_vertical_only);
        scrollViewHorizontalBoth = (ObservableHorizontalScrollView) findViewById(R.id.activity_main_horizontal_scrollview_both);
        scrollViewHorizontalOnly = (ObservableHorizontalScrollView) findViewById(R.id.activity_main_horizontal_scrollview_only);

        scrollViewVerticalBoth.setScrollViewListener(this);
        scrollViewVerticalOnly.setScrollViewListener(this);
        scrollViewHorizontalBoth.setScrollViewListener(this);
        scrollViewHorizontalOnly.setScrollViewListener(this);
    }

    @Override
    public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldX, int oldY) {
        Log.i(TAG, "VERTICAL");
        scrollViewVerticalBoth.scrollTo(x, y);
        scrollViewVerticalOnly.scrollTo(x, y);
    }

    @Override
    public void onScrollChanged(ObservableHorizontalScrollView scrollView, int x, int y, int oldX, int oldY) {
        Log.i(TAG, "HORIZONTAL");
        scrollViewHorizontalBoth.scrollTo(x, y);
        scrollViewHorizontalOnly.scrollTo(x, y);
    }
}
