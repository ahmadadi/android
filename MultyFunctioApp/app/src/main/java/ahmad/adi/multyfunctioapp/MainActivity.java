package ahmad.adi.multyfunctioapp;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA ="ahmad.adi.multyfunctioapp.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMessage(View view){
        // contoh penggunaan explicit intent
        Intent intent = new Intent(this, ShowMessage.class);
        TextView txtMessage = (TextView) findViewById(R.id.txt_message);
        intent.putExtra(EXTRA,txtMessage.getText().toString());
        startActivity(intent);
    }
    public void openBrowser (View view){
        // membuka aktivity yang akan mengeksekusi explicit intents
        Intent intent = new Intent(this, IntentExecutor.class);
        intent.putExtra(EXTRA, "Browse");
        startActivity(intent);
    }
    public void openPhone (View view){
        //membuka aktivity yang akan mengeksekusi explicit intents
        Intent intent = new Intent(this, IntentExecutor.class);
        intent.putExtra(EXTRA, "Phone");
        startActivity(intent);
    }
    public void openMap (View view){
        //membuka aktivity yang akan mengeksekusi explicit intents
        Intent intent = new Intent(this, IntentExecutor.class);
        intent.putExtra(EXTRA, "Map");
        startActivity(intent);
    }
    public void openEmail (View view){
        //membuka aktivity yang akan mengeksekusi explicit intents
        Intent intent = new Intent(this, IntentExecutor.class);
        intent.putExtra(EXTRA, "Email");
        startActivity(intent);
    }

}
