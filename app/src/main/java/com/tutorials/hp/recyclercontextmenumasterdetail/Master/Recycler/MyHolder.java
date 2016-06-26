package com.tutorials.hp.recyclercontextmenumasterdetail.Master.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.recyclercontextmenumasterdetail.R;

/**
 * Created by Oclemmy on 4/8/2016 for ProgrammingWizards Channel.
 */
public class MyHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener,View.OnCreateContextMenuListener {

    TextView nameTxt;
    ImageView img;
    ItemLongClickListener itemLongClickListener;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        img= (ImageView) itemView.findViewById(R.id.movieImage);

        itemView.setOnLongClickListener(this);
        itemView.setOnCreateContextMenuListener(this);
    }

    public void setItemLongClickListener(ItemLongClickListener ic)
    {
        this.itemLongClickListener=ic;
    }

    @Override
    public boolean onLongClick(View v) {
        this.itemLongClickListener.onLongClick(getLayoutPosition());
        return false;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //OUR CONTEXT MENU
        menu.setHeaderTitle("Go To : ");
        menu.add(0, 0, 0, "Watch");
        menu.add(0,1,0,"Rate");
        menu.add(0,2,0,"Share");


    }
}
