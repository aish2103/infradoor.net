package app.example.com.infradoor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo-pc on 6/2/2015.
 */
public class index extends Activity{
    Button paintbutton, bathbutton, tilesbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        paintbutton = (Button) findViewById(R.id.paintbutton);
        bathbutton = (Button) findViewById(R.id.bathbutton);
        tilesbutton = (Button) findViewById(R.id.tilesbutton);
    }
    public void process(View view)
    {
        Intent intent = null;
        if(view.getId()==R.id.paintbutton)
        {
            intent = new Intent(this,paint.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.tilesbutton)
        {
            intent = new Intent(this,tiles.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.bathbutton)
        {
            intent = new Intent(this,bath.class);
            startActivity(intent);
        }
    }
}
