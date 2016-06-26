package com.tutorials.hp.recyclercontextmenumasterdetail.Master.Recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclercontextmenumasterdetail.Master.Data.Movie;
import com.tutorials.hp.recyclercontextmenumasterdetail.Master.Detail.DetailActivity;
import com.tutorials.hp.recyclercontextmenumasterdetail.R;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 4/8/2016 for ProgrammingWizards Channel.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Movie> movies;
    String moviename;
    int movieimage;


    public MyAdapter(Context c, ArrayList<Movie> movies) {
        this.c = c;
        this.movies = movies;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        MyHolder holder=new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
         final String name=movies.get(position).getName();
        final int img=movies.get(position).getImage();

        //BIND DATA
        holder.nameTxt.setText(name);
        holder.img.setImageResource(img);

        //LONG CLICK
        holder.setItemLongClickListener(new ItemLongClickListener() {
            @Override
            public void onLongClick(int pos) {
                moviename=name;
                movieimage=img;
            }
        });


    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public void getSelectedContextMenuItem(MenuItem item)
    {
        this.openDetailActivity(item.getTitle().toString());
    }

    //OPENNING A NEW ACTIVITY AND PASS DATA
    private void openDetailActivity(String choice)
    {
        //INTENT OBJ
        Intent i=new Intent(c, DetailActivity.class);

        //PACK DATA TO IT
        i.putExtra("NAME_KEY",moviename);
        i.putExtra("IMAGE_KEY",movieimage);
        i.putExtra("CHOICE_KEY",choice);

        //OPEN ACTIVITY
        c.startActivity(i);

    }
}
