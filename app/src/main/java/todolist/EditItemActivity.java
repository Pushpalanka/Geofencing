package todolist;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.location.sample.geofencing.R;

/**
 * Created by thakshilad on 4/11/2015.
 */
public class EditItemActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_item);
    }

}
