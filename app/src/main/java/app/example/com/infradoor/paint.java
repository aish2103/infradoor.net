package app.example.com.infradoor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Lenovo-pc on 6/3/2015.
 */
public class paint extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint);
    }

    public void form1(View view) {
        Intent intent = null;
        switch (view.getId())
        {
            case R.id.paintbutton1:
                intent = new Intent(this,form.class);
                startActivity(intent);
                break;
            case R.id.paintbutton2:
                intent = new Intent(this,form.class);
                startActivity(intent);
                break;
            case R.id.paintbutton3:
                intent = new Intent(this,form.class);
                startActivity(intent);
                break;
        }

    }
}