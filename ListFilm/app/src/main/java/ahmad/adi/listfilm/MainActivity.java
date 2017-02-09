package ahmad.adi.listfilm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String [] filmTitle = {"The Thor","Harry Poter", "Inception",
                                    "Wolf of Wallstreet", "Django Unchiened",
                                    "Titanic", "Captain Amerika", "Doctor stronge",
                                    "X-man Apocalypse", "Shulter Island",
                                    "The Avanger", "Fantactis Beasts & Where to Find Them"};

    private ArrayList<Movie> movies = new ArrayList<>();

    private void initMovies(){
        movies.add(new Movie("The Thor","Film super hero yang turun ke bumi",7.5, 2009));
        movies.add(new Movie("Harry Potter", "Film yang menceritakna tentang kehidupan seorang anak penyihir",
                8,2010));
        movies.add(new Movie("Inception", " Film yang menceritakan tentang agen FBI", 8,2005));
        movies.add(new Movie("Captain Amerika","Film yang menceritakan superhero yang melindungi kota",
                8, 2011));
        movies.add(new Movie("Shulter Island","Film yang mencerikan kehidupan di sebuah pulau", 7.5, 2012));
        movies.add(new Movie("The Avanger","Film yang menceritakan perang", 8, 2012));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMovies();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, filmTitle);
        ListView listView = (ListView) findViewById(R.id.list_film);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Movie selectedMovie = movies.get(position);
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                intent.putExtra("ahmad.adi.listfilm",selectedMovie);
                startActivity(intent);
            }
        });
    }

}
