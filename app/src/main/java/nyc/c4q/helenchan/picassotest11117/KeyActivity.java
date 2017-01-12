package nyc.c4q.helenchan.picassotest11117;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by helenchan on 1/11/17.
 */

public class KeyActivity extends AppCompatActivity {
    private static final String MYURL = "Please work";
    ImageView keyboardIV;
    String url;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);
        Intent intent = getIntent();
        url = intent.getStringExtra(KeyActivity.MYURL);
        keyboardIV = (ImageView) findViewById(R.id.keyboard_iv);
//        Picasso.with(getApplicationContext())
//                .load(url)
//                .placeholder(R.drawable.user_placeholder)
//                .error(R.drawable.user_placeholder_error)
//                .into(imageView);
    }
}


