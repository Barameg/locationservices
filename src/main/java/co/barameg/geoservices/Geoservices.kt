package co.barameg.geoservices
import android.util.Log
import com.google.gson.*

class Geoservices {

    /**
     * A native method that is implemented by the 'demolib' native library,
     * which is packaged with this application.
     */

    external fun searchAutocomplete(
        client_id: String,
        client_key: String,
        language: String,
        country: String,
        query: String
    ): String
    external fun forwardGeocoding(
        client_id: String,
        client_key: String,
        language: String,
        country: String,
        query: String
    ): String
    external fun reverseGeocoding(
        client_id: String,
        client_key: String,
        language: String,
        country: String,
        latitude: String,
        longitude: String
    ): String
    external fun routes(
        client_id: String,
        client_key: String,
        origin_latitude: String,
        origin_longitude: String,
        destination_latitude: String,
        destination_longitude: String
    ): String

    companion object {
        // Used to load the 'demolib' library on application startup.
        init {
            System.loadLibrary("geoservices")
        }
    }
}

