package com.example.listenandrepeat.recyclertalk;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ListenAndRepeat on 2016. 1. 25..
 */
public class SendViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    ImageView iconView;
    SendData data;

    public SendViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.textView2);
        iconView = (ImageView)itemView.findViewById(R.id.imageView2);

    }

    public void setSendData(SendData data){
        this.data = data;
        iconView.setImageResource(data.iconId);
        textView.setText(data.message);
    }
}
