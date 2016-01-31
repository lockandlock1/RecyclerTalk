package com.example.listenandrepeat.recyclertalk;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ListenAndRepeat on 2016. 1. 25..
 */

 class ReceiveViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    ImageView iconView;
    ReceiveData data;
    public ReceiveViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.textView);
        iconView = (ImageView)itemView.findViewById(R.id.imgeView);
    }

    public void setReceiveData(ReceiveData data){
        this.data = data;
        textView.setText(data.message);
        iconView.setImageResource(data.iconId);
    }
}
