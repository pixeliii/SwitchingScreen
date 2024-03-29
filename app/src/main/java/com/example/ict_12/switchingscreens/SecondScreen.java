package com.example.ict_12.switchingscreens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ICT-12 on 1.10.2014.
 */
public class SecondScreen extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView callingActivityMessage = (TextView)
                	                findViewById(R.id.calling_activity_info_text_view);

        callingActivityMessage.append("" + previousActivity);



    }

    public void onSendUsersName(View view){

        EditText userNameET = (EditText) findViewById(R.id.users_name_edit_text);

        EditText usersNameET = (EditText) findViewById(R.id.users_name_edit_text);

        String usersName = String.valueOf(usersNameET.getText());


        Intent goingBack = new Intent();

        goingBack.putExtra("UsersName", usersName);

        setResult(RESULT_OK, goingBack);

        finish();
    }
}
