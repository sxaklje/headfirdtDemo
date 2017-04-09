package lje.myapplication;

import android.app.Activity;
import android.app.IntentService;
import android.app.Service;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private int[] arrary = new int[]{0, 10, 28, 34, 55};
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewById1 = (TextView) findViewById(R.id.tv1);
        TextView viewById2 = (TextView) findViewById(R.id.tv2);
        IntentService d;
        Service s;
    }

}





