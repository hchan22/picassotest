package nyc.c4q.helenchan.picassotest11117;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by helenchan on 1/11/17.
 */

public class KeyActivity extends AppCompatActivity {
    ImageView keyboardIV;
    String url;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);
        Intent intent = getIntent();
        url = intent.getStringExtra("urlK");
        keyboardIV = (ImageView) findViewById(R.id.keyboard_iv);
        Picasso.with(getApplicationContext())
                .load(url)
                .into(keyboardIV);
    }
}


