package com.tameshk.lottery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*ommit the title bar*/
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        ImageButton gcBtn = (ImageButton) findViewById(R.id.gc_btn);
        gcBtn.setOnClickListener(this);
        ImageButton elBtn = (ImageButton) findViewById(R.id.eli_btn);
        elBtn.setOnClickListener(this);
        ImageButton rgBtn = (ImageButton) findViewById(R.id.reg_btn);
        rgBtn.setOnClickListener(this);
        ImageButton anBtn = (ImageButton) findViewById(R.id.an_btn);
        anBtn.setOnClickListener(this);
        ImageButton fqBtn = (ImageButton) findViewById(R.id.faq_btn);
        fqBtn.setOnClickListener(this);
        ImageButton wnBtn = (ImageButton) findViewById(R.id.winner_btn);
        wnBtn.setOnClickListener(this);
        ImageButton rsBtn = (ImageButton) findViewById(R.id.res_btn);
        rsBtn.setOnClickListener(this);
        ImageButton cnBtn = (ImageButton) findViewById(R.id.cont_btn);
        cnBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.gc_btn)
        startActivity(new Intent(MainActivity.this, GreenCard.class));
        if(v.getId() == R.id.eli_btn)
            startActivity(new Intent(MainActivity.this, Eligibility.class));
        if(v.getId() == R.id.reg_btn)
            startActivity(new Intent(MainActivity.this, Register.class));
        if(v.getId() == R.id.an_btn)
            startActivity(new Intent(MainActivity.this, Announcement.class));
        if(v.getId() == R.id.faq_btn)
            startActivity(new Intent(MainActivity.this, Faq.class));
        if(v.getId() == R.id.winner_btn)
            startActivity(new Intent(MainActivity.this, Winners.class));
        if(v.getId() == R.id.res_btn)
            startActivity(new Intent(MainActivity.this, Resources.class));
        if(v.getId() == R.id.cont_btn)
            startActivity(new Intent(MainActivity.this, Contact.class));


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

