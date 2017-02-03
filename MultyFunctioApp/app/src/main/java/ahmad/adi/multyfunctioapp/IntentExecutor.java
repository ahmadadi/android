package ahmad.adi.multyfunctioapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentExecutor extends AppCompatActivity {

    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_executor);

        Button btn = (Button) findViewById(R.id.btn_execute);
        Intent intent =getIntent();
        operator = intent.getStringExtra(MainActivity.EXTRA);
        if (operator.equals("Browse")){
            btn.setText("Buka Browser");
        } else if(operator.equals("Phone")){
            btn.setText("Hubungi No tlp");
        }else if(operator.equals("Map")) {
            btn.setText("Buka peta");
        }
    }

    public void execute(View view) {
        Intent exeIntent = null;
        EditText txtExec = (EditText) findViewById(R.id.text_exce);
        String exec = txtExec.getText().toString();
        if (operator.equals("Browse")){
            Uri webpage = Uri.parse("http://"+exec);
            exeIntent = new Intent(Intent.ACTION_VIEW, webpage);
        }else if(operator.equals("Phone")){
            Uri number = Uri.parse("tel:"+exec);
            exeIntent = new Intent(Intent.ACTION_DIAL,number);
        }else if (operator.equals("Map")){
            Uri gmmIntentUri = Uri.parse("geo:"+exec);
            exeIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
        }

        startActivity(exeIntent);
    }
}
