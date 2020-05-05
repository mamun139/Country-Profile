package com.example.countryprofile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;


public class CustomAdaptor extends BaseAdapter {
    int[] flags;
    String[] countryNames;
    Context context;
    private LayoutInflater inflater;

    public CustomAdaptor(Context context, String[] countryNames, int[] flags) {
        this.context=context;
        this.countryNames=countryNames;
        this.flags=flags;
    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.sample_list_view,parent,false);

        }
        ImageView imageView= convertView.findViewById(R.id.ivCountryFlag);
        TextView textView=convertView.findViewById(R.id.tvCountryName);
        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);

        return convertView;

    }
    public void filter(String charText){
        charText=charText.toLowerCase(Locale.getDefault());

    }
}
