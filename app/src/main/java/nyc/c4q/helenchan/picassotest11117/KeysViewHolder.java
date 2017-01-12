package nyc.c4q.helenchan.picassotest11117;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.helenchan.picassotest11117.network.Keys;

/**
 * Created by helenchan on 1/11/17.
 */
public class KeysViewHolder extends RecyclerView.ViewHolder {
    TextView keyTV;
    String keyUrl;
    Context context;
    private int keyColor;


    public KeysViewHolder(final View itemView) {
        super(itemView);
        context = itemView.getContext();
        keyTV = (TextView) itemView.findViewById(R.id.letter_textview);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, KeyActivity.class);
                intent.putExtra("urlK", keyUrl);
                context.startActivity(intent);
            }
        });
    }

    public void bind(Keys myKeys) {
        keyColor = Color.parseColor(myKeys.getTextColor());
        keyUrl = "http://jsjrobotics.nyc" + myKeys.getUrl();
        keyTV.setText(myKeys.getName());
        keyTV.setTextColor(keyColor);


    }
}
