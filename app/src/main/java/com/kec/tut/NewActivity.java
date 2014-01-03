package com.kec.tut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Kec on 1/3/14.
 */
public class NewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
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

        TextView nameOut = (TextView)findViewById(R.id.name);
        TextView commentOut = (TextView)findViewById(R.id.comment);
        TextView otherOut = (TextView)findViewById(R.id.other);

        nameOut.setText(name);
        commentOut.setText(name);
        otherOut.setText(name);
    }
}
