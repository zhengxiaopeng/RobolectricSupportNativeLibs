package xyz.rocko.rsnl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import xyz.rocko.rsnl.nativeinterface.NativeSample;

public class MainActivity extends AppCompatActivity {



  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText(NativeSample.stringFromJNI());
  }

}
