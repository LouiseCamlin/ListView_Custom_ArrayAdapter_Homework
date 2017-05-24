package com.codeclan.example.topdogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Louise on 24/05/2017.
 */

public class TopDogsAdapter extends ArrayAdapter<Dog> {

    public TopDogsAdapter(Context context, ArrayList<Dog> dogs) {
        super(context, 0, dogs);

    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.dogs_item, parent, false);
        }

        Dog currentDog = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentDog.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.breed);
        title.setText(currentDog.getBreed());

        TextView year = (TextView) listItemView.findViewById(R.id.status);
        year.setText(currentDog.getStatus());

        listItemView.setTag(currentDog);

        return listItemView;
    }
}
