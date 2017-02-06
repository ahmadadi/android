package ahmad.adi.multyfunctioapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SendEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
    }
    public void SendEmail(View view) {
        EditText txtPenerima = (EditText) findViewById(R.id.penerima);
        EditText txtJudul = (EditText) findViewById(R.id.judul);
        EditText txtKontens = (EditText) findViewById(R.id.kontens);
        EditText txtKirim = (EditText) findViewById(R.id.kirim);

        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("emailto" + txtPenerima.getText().toString()));
        emailIntent.setType("text/plans");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "elfaatta@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, txtJudul.getText().toString());
        emailIntent.putExtra(Intent.EXTRA_TEXT, txtKontens.getText().toString());

    }
}
