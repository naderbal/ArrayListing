package com.internship.listing20.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.internship.listing20.R;

import java.util.ArrayList;

/**
 * Created by Nader on 20-Aug-16.
 */

public class CustomSettingsAdapter extends ArrayAdapter {
    Context ctx;
    public CustomSettingsAdapter(Context ctx,ArrayList<Integer> settings){
        super(ctx, R.layout.custom_row_settings,settings);
        this.ctx=ctx;
    }

    public View getView(int postition,View convertView,ViewGroup parent){
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row_settings, parent, false);

        TextView textView = (TextView)customView.findViewById(R.id.tvCustomSettings);
        ImageView imageView = (ImageView)customView.findViewById(R.id.ivCustomSettings);

        String notification = ctx.getResources().getStringArray(R.array.settings)[postition];
        int image =(int) getItem(postition);

        textView.setText(notification);
        imageView.setImageResource(image);

        return customView;
    }


}
