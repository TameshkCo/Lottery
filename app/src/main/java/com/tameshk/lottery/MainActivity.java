package com.tameshk.lottery;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*ommit the title bar*/
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
    }

    ImageButton gcBtn = (ImageButton) findViewById(R.id.gc_btn);
    ImageButton elBtn = (ImageButton) findViewById(R.id.eli_btn);
    ImageButton rgBtn = (ImageButton) findViewById(R.id.reg_btn);
    ImageButton anBtn = (ImageButton) findViewById(R.id.winner_btn);
    ImageButton fqBtn = (ImageButton) findViewById(R.id.faq_btn);
    ImageButton wnBtn = (ImageButton) findViewById(R.id.winner_btn);
    ImageButton rsBtn = (ImageButton) findViewById(R.id.res_btn);
    ImageButton cnBtn = (ImageButton) findViewById(R.id.cont_btn);




    @Override
    public void onClick(View v) {
        

    }
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

