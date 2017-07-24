package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie =(ListView)findViewById(R.id.movieViewList);

        final ArrayList<MovieItems> movieInfo;
        final CustomAdapter caMovie;

        movieInfo = new ArrayList<MovieItems>();

        caMovie = new CustomAdapter(this, R.layout.movieitem_row, movieInfo);

        lvMovie.setAdapter(caMovie);

        final MovieItems item1 = new MovieItems("The Avengers","2012","pg13","Action | Sci-Fi","15/11/2014","Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        caMovie.add(item1);

        final MovieItems item2 = new MovieItems("Planes","2013","pg","Animation | Comedy","15/5/2015","Cathay - AMK Hub","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
        caMovie.add(item2);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getBaseContext(),MovieDesc.class);
                MovieItems movieItem = movieInfo.get(i);

                    intent.putExtra("image", movieItem.getRated());
                    intent.putExtra("title", movieItem.getTitle());
                    intent.putExtra("yeargen", movieItem.yearGen(item1.getYear(), item1.getGenre()));
                    intent.putExtra("desc", movieItem.getDesc());
                    intent.putExtra("place", movieItem.getIn_theatre());
                    intent.putExtra("date", movieItem.getWatched_on());
                    intent.putExtra("rate", movieItem.getRated());
                    intent.putExtra("position", i);
                    startActivity(intent);

            }
        });
    }
}
