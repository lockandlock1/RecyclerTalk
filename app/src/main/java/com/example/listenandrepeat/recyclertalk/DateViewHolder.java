package com.example.listenandrepeat.recyclertalk;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ListenAndRepeat on 2016. 1. 25..
 */
public class DateViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    DateData data;
    public DateViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.textView3);
    }

    public void setDateData(DateData data){
        this.data = data;
        textView.setText(data.message);
    }
}
