package com.example.ralemproductions.ezchat;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private String currentNumber= "";
    private TextView callText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callText = (TextView)findViewById(R.id.call);
        UpdateCallText();
    }

    public void ClickButton(String s) {
        currentNumber += s;
        UpdateCallText();
    }

    public void BackSpace(){
        if(currentNumber.length() <= 0){return;}
        currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
        UpdateCallText();
    }
    public void UpdateCallText(){
        callText.setText("CALL: " + currentNumber);
    }

    public void Call(){
        try{
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + currentNumber));
            startActivity(callIntent);

        }catch(ActivityNotFoundException activityException){

        }
    }

    public void Button1(View view) {
        ClickButton("1");
    }
    public void Button2(View view) {
        ClickButton("2");
    }
    public void Button3(View view) {
        ClickButton("3");
    }
    public void Button4(View view) {
        ClickButton("4");
    }
    public void Button5(View view) {
        ClickButton("5");
    }
    public void Button6(View view) {
        ClickButton("6");
    }
    public void Button7(View view) {
        ClickButton("7");
    }
    public void Button8(View view) {
        ClickButton("8");
    }
    public void Button9(View view) {
        ClickButton("9");
    }
    public void Button0(View view) {
        ClickButton("0");
    }
    public void ButtonPound(View view) {
        ClickButton("#");
    }
    public void ButtonStar(View view) {
        ClickButton("*");
    }
    public void ButtonDelete(View view){
        BackSpace();
    }
    public void ButtonCall(View view){
        Call();
    }
}
