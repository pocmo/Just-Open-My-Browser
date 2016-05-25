package com.androidzeitgeist.jomb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class DispatcherActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(getIntent().getData());
        intent.setPackage(Browser.FIREFOX_NIGHTLY.getPackageName());
        startActivity(intent);

        finish();
    }
}
