package nyc.c4q.helenchan.picassotest11117.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by helenchan on 1/11/17.
 * {
 "success": true,
 "available keys": [{
 "name": "Letter D",
 "textColor": "purple",
 "url": "/classroom/photos/letter_D.jpg"
 },
 */

public class KeysResponse {
    private boolean success;

    @SerializedName("available keys")
    private List<Keys> availableKeys;

    public boolean isSuccess() {
        return success;
    }

    public List<Keys> getAvailableKeys() {
        return availableKeys;
    }
}
