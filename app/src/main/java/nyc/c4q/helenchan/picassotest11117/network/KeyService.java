package nyc.c4q.helenchan.picassotest11117.network;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by helenchan on 1/11/17.
 * http://jsjrobotics.nyc/cgi-bin/1_11_2017_exam.pl
 */

public interface KeyService {

    @GET("cgi-bin/1_11_2017_exam.pl")
    Call<KeysResponse> getKeys();
}
