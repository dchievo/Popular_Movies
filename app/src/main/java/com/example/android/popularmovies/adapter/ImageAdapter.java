package com.example.android.popularmovies.adapter;

import android.content.Context;
import com.example.android.popularmovies.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.example.android.popularmovies.R.drawable.*;

/**
 * Created by tench on 1/11/2016.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context c)
    {
        mContext = c;
    }

    private Integer[] mThumbIds = {
            com.example.android.popularmovies.R.drawable.sample_2, com.example.android.popularmovies.R.drawable.sample_3,
            com.example.android.popularmovies.R.drawable.sample_4, com.example.android.popularmovies.R.drawable.sample_5,
            com.example.android.popularmovies.R.drawable.sample_6, com.example.android.popularmovies.R.drawable.sample_7,
            com.example.android.popularmovies.R.drawable.sample_0, com.example.android.popularmovies.R.drawable.sample_1,
            com.example.android.popularmovies.R.drawable.sample_2, com.example.android.popularmovies.R.drawable.sample_3,
            com.example.android.popularmovies.R.drawable.sample_4, com.example.android.popularmovies.R.drawable.sample_5,
            com.example.android.popularmovies.R.drawable.sample_6, com.example.android.popularmovies.R.drawable.sample_7,
            com.example.android.popularmovies.R.drawable.sample_0, com.example.android.popularmovies.R.drawable.sample_1,
            com.example.android.popularmovies.R.drawable.sample_2, com.example.android.popularmovies.R.drawable.sample_3,
            com.example.android.popularmovies.R.drawable.sample_4, com.example.android.popularmovies.R.drawable.sample_5,
            com.example.android.popularmovies.R.drawable.sample_6, com.example.android.popularmovies.R.drawable.sample_7
    };

    @Override
    public int getCount() {
        return mThumbIds.length;
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
        ImageView imageView;
        if (convertView == null)
        {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
}
