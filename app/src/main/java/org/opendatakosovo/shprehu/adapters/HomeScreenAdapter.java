package org.opendatakosovo.shprehu.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import opendatakosovo.org.shprehu.R;

/**
 * Created by pechorin on 8/31/15.
 */
public final class HomeScreenAdapter extends BaseAdapter {
    private final List<Item> mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    public HomeScreenAdapter(Context context) {
        mInflater = LayoutInflater.from(context);

        mItems.add(new Item("Report",       R.drawable.puppy1));
        mItems.add(new Item("Light",   R.drawable.puppy1));
        mItems.add(new Item("Maps", R.drawable.puppy1));
        mItems.add(new Item("Analytics",      R.drawable.puppy1));
        mItems.add(new Item("Settings",     R.drawable.puppy1));
        mItems.add(new Item("Contact",      R.drawable.puppy1));
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mItems.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    private static class Item {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}