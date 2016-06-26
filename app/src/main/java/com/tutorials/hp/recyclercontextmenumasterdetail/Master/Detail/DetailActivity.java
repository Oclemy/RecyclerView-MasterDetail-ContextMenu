package com.tutorials.hp.recyclercontextmenumasterdetail.Master.Detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tutorials.hp.recyclercontextmenumasterdetail.R;

public class DetailActivity extends AppCompatActivity {


    ImageView img;
    TextView nameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //INITIALIZE
        img= (ImageView) findViewById(R.id.movieImageDetail);
        nameTxt= (TextView) findViewById(R.id.nameTxtDetail);

        //RECEIVE
        Intent i=getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        int image=i.getExtras().getInt("IMAGE_KEY");
        String choice=i.getExtras().getString("CHOICE_KEY");

        //BIND
        img.setImageResource(image);
        nameTxt.setText(name);

        Toast.makeText(this,"RECEIVED " +choice,Toast.LENGTH_SHORT).show();

    }

}
