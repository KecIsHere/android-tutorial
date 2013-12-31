package com.kec.tut;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private final String TAG = "MainActivity";
    Button myButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        Log.i(TAG, "onCreate");
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

    public void buttonClicked(View v)
    {
        String text = textView.getText().toString();
        if(text.contains("Android"))
        {
            textView.setText("Hello World");
        }
        else
        {
            textView.setText("Hello Android");
        }
    }
}
