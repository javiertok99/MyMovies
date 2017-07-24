package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<MovieItems> movieList;

    public CustomAdapter(Context context, int resource,
                         ArrayList<MovieItems> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI Elements and assign to variables
        ImageView ivImage = (ImageView) rowView.findViewById(R.id.imageView);
        TextView tvTitle = (TextView) rowView.findViewById(R.id.title);
        TextView tvYearGenre = (TextView) rowView.findViewById(R.id.YearGenre);

        // Obtain the to-do item based on the 'position'.
        MovieItems currentItem = movieList.get(position);

        // Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        if(currentItem.getRated().equals("g")){
            ivImage.setImageResource(R.drawable.rating_g);
        }else if(currentItem.getRated().equals("pg")){
            ivImage.setImageResource(R.drawable.rating_pg);
        }else if(currentItem.getRated().equals("pg13")){
            ivImage.setImageResource(R.drawable.rating_pg13);
        }else if(currentItem.getRated().equals("nc16")){
            ivImage.setImageResource(R.drawable.rating_nc16);
        }else if(currentItem.getRated().equals("m18")){
            ivImage.setImageResource(R.drawable.rating_m18);
        }else{
            ivImage.setImageResource(R.drawable.rating_r21);
        }
        tvYearGenre.setText(currentItem.yearGen(currentItem.getYear(),currentItem.getGenre()));

        //return the View corresponding to the data at the specified position.
        return rowView;
    }
}
