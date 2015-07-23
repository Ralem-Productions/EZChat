package com.example.ralemproductions.ezchat;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;
public class text extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);





    }
    public void Button1(View view){
        sendSMSMessage("Yes");


    }
    public void Button2(View view){
        sendSMSMessage("No");


    }
    public void Button3(View view){
        sendSMSMessage("Call me");


    }
    public void Button4(View view){
        sendSMSMessage("Thank you");


    }
    public void Button5(View view){
        sendSMSMessage("Give me 15");


    }
    public void Button6(View view){
        sendSMSMessage("HELP!");


    }
    protected void sendSMSMessage(String newMessage) {


        String message = newMessage;

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage("8608965042", null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
        }

        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS faild, please try again.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }



}