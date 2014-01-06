package com.kec.tut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Kec on 1/3/14.
 */
public class NewActivity extends Activity {

    TextView nameOut;
    TextView commentOut;
    TextView otherOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        Intent intent = getIntent();
        String text = intent.getStringExtra("screenText");
        Log.i("NewActivity", text);

        nameOut = (TextView)findViewById(R.id.name);
        commentOut = (TextView)findViewById(R.id.comment);
        otherOut = (TextView)findViewById(R.id.other);

        if(text!=null)
        {
            nameOut.setText(text);
        }
    }

    public void addComment(View v)
    {
        String name, comment, other;

        EditText nameLn = (EditText)findViewById(R.id.nameLn);
        EditText commentLn = (EditText)findViewById(R.id.commentLn);
        EditText otherLn = (EditText)findViewById(R.id.otherLn);

        name = nameLn.getText().toString();
        comment = commentLn.getText().toString();
        other = otherLn.getText().toString();

        nameOut.setText(name);
        commentOut.setText(comment);
        otherOut.setText(other);


    }
}
