package com.example.dankookworld;

import android.content.Context;
import java.util.ArrayList;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.List;


public class MyListAdapter_event extends BaseAdapter{

    Context context;
    ArrayList<Notice_itemList> list_itemArrayList;

    TextView nickname_textView;
    TextView title_textView;
    TextView date_textView;
    TextView content_textView;
    ImageView profile_imageView;

    public MyListAdapter_event(Context context, ArrayList<Notice_itemList> list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }

    @Override
    public int getCount() {
        return this.list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_event,null);
            nickname_textView = (TextView)convertView.findViewById(R.id.nickname_textview_event);
            content_textView = (TextView)convertView.findViewById(R.id.content_textview_event);
            date_textView = (TextView)convertView.findViewById(R.id.date_textview_event);
            title_textView  =(TextView)convertView.findViewById(R.id.title_textview_event);
            profile_imageView = (ImageView)convertView.findViewById(R.id.profile_imageview_event);
        }

        nickname_textView.setText(list_itemArrayList.get(position).getNickname());
        title_textView.setText(list_itemArrayList.get(position).getTitle());
        content_textView.setText(list_itemArrayList.get(position).getContent());
        date_textView.setText(list_itemArrayList.get(position).getWrite_date().toString());
        profile_imageView.setImageResource(list_itemArrayList.get(position).getProfile_image());

        return convertView;
    }
}