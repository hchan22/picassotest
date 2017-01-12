package nyc.c4q.helenchan.picassotest11117;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.helenchan.picassotest11117.network.Keys;

/**
 * Created by helenchan on 1/11/17.
 */
public class KeysAdapter extends RecyclerView.Adapter<KeysViewHolder>{
    List<Keys> keysList;

    public KeysAdapter(List<Keys> keysList) {
        this.keysList = keysList;
    }

    @Override
    public KeysViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.key_itemview, parent, false);
        return new KeysViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(KeysViewHolder holder, int position) {
        Keys myKeys = keysList.get(position);
        holder.bind(myKeys);
    }


    @Override
    public int getItemCount() {
        return keysList.size();
    }
}
