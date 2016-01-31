package com.example.listenandrepeat.recyclertalk;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ListenAndRepeat on 2016. 1. 25..
 */
public class MultiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<ChattingData> items = new ArrayList<ChattingData>();

    private static final int VIEW_TYPE_COUNT = 3;

    private static final int TYPE_RECEIVE = 0;
    private static final int TYPE_SEND = 1;
    private static final int TYPE_DATE = 2;

    public void add(ChattingData data){
        items.add(data);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        ChattingData data = items.get(position);
        if(data instanceof ReceiveData) return TYPE_RECEIVE;
        else if (data instanceof SendData) return TYPE_SEND;
        else return TYPE_DATE;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        switch (viewType){
            case TYPE_SEND :
                view = inflater.inflate(R.layout.view_send,parent,false);
                return new SendViewHolder(view);
            case TYPE_RECEIVE:
                view = inflater.inflate(R.layout.view_receive,parent,false);
                return new ReceiveViewHolder(view);
            case TYPE_DATE:
                view = inflater.inflate(R.layout.view_date,parent,false);
                return new DateViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case TYPE_SEND :
                ((SendViewHolder)holder).setSendData((SendData) items.get(position));
                break;
            case TYPE_RECEIVE:
                ((ReceiveViewHolder)holder).setReceiveData((ReceiveData)items.get(position));
                break;
            case TYPE_DATE:
                ((DateViewHolder)holder).setDateData((DateData)items.get(position));
                break;

        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
