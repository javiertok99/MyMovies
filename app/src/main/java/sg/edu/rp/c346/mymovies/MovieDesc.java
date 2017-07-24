package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDesc extends AppCompatActivity {
    ImageView ivImage;
    TextView tvtitle;
    TextView tvyeargen;
    TextView tvdesc;
    TextView tvplace;
    TextView tvdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_desc);
        ivImage = (ImageView)findViewById(R.id.imageView2);
        tvtitle = (TextView)findViewById(R.id.title);
        tvyeargen = (TextView)findViewById(R.id.yeargenre);
        tvdesc = (TextView)findViewById(R.id.desc);
        tvplace = (TextView)findViewById(R.id.locationWatched);
        tvdate = (TextView)findViewById(R.id.dateWatched);

        Intent intentReceived = getIntent();
        String Title = intentReceived.getStringExtra("title");
        String yeargen = intentReceived.getStringExtra("yeargen");
        String desc = intentReceived.getStringExtra("desc");
        String Place = intentReceived.getStringExtra("place");
        String date = intentReceived.getStringExtra("date");
        String rate = intentReceived.getStringExtra("rate");
        int position = intentReceived.getIntExtra("position",-1);
        if(rate.equals("g")){
            ivImage.setImageResource(R.drawable.rating_g);
        }else if(rate.equals("pg")){
            ivImage.setImageResource(R.drawable.rating_pg);
        }else if(rate.equals("pg13")){
            ivImage.setImageResource(R.drawable.rating_pg13);
        }else if(rate.equals("nc16")){
            ivImage.setImageResource(R.drawable.rating_nc16);
        }else if(rate.equals("m18")){
            ivImage.setImageResource(R.drawable.rating_m18);
        }else{
            ivImage.setImageResource(R.drawable.rating_r21);
        }

        tvtitle.setText(Title);
        tvyeargen.setText(yeargen);
        tvdate.setText("Watched on: " + date);
        tvdesc.setText(desc);
        tvplace.setText("In theatre: " + Place);





    }
}
