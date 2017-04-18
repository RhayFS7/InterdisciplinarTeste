package com.example.rhayf.interdisciplinar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MenuActivity extends Activity {

    private Button btnList;
    private Button btnGroup;
    private Button btnNotices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
}
