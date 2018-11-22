package com.ab1209.simultaneous.interfaces;

import com.ab1209.simultaneous.views.ObservableHorizontalScrollView;
import com.ab1209.simultaneous.views.ObservableScrollView;

public interface ScrollViewListener {

    void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldX, int oldY);

    void onScrollChanged(ObservableHorizontalScrollView scrollView, int x, int y, int oldX, int oldY);
}
