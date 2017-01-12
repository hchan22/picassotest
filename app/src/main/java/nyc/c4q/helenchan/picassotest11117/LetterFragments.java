package nyc.c4q.helenchan.picassotest11117;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.helenchan.picassotest11117.network.KeyService;
import nyc.c4q.helenchan.picassotest11117.network.Keys;
import nyc.c4q.helenchan.picassotest11117.network.KeysResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by helenchan on 1/11/17.
 */
public class LetterFragments extends Fragment {
    List<Keys> keysList = new ArrayList<>();
    RecyclerView recyclerView;
    KeysAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mRoot = inflater.inflate(R.layout.main_fragment, container, false);
        recyclerView = (RecyclerView) mRoot.findViewById(R.id.main_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(mRoot.getContext()));
        recyclerView.setAdapter(new KeysAdapter(keysList));
        return mRoot;
    }

    @Override
    public void onStart() {
        super.onStart();
        fetchKeys();
    }

    private void fetchKeys() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://jsjrobotics.nyc/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        KeyService service = retrofit.create(KeyService.class);
        Call<KeysResponse> call = service.getKeys();
        call.enqueue(new Callback<KeysResponse>() {
            @Override
            public void onResponse(Call<KeysResponse> call, Response<KeysResponse> response) {
                keysList = response.body().getAvailableKeys();
                adapter = new KeysAdapter(keysList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<KeysResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Cannot download", Toast.LENGTH_LONG).show();
            }
        });

    }
}
