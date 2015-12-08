package com.example.ch133.weekdayimproved;

import android.widget.TextView;


public interface MyActivityInterface {

    // Displays the date picker and day
    public void pickDateDisplayDay();

    // Sets the TextView to message
    public void setText(String message);

    // Adds fade animation to the text
    public void fadeAnimation(TextView tv);

}
