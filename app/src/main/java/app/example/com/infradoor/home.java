package app.example.com.infradoor;

import android.app.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by Lenovo-pc on 6/2/2015.
 */
public class home extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
         /* create a full screen window */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.home);

    /* adapt the image to the size of the display */
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        Bitmap bmp = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(
                getResources(),R.drawable.final2),size.x,size.y,true);

    /* fill the background ImageView with the resized image */
        ImageView iv_background = (ImageView) findViewById(R.id.imageView2);
        iv_background.setImageBitmap(bmp);

        Thread next = new Thread(){
            public void run()
            {
                try{
                    sleep(8000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally{
                    Intent ourIntent = new Intent("com.example.app.INDEX");
                    startActivity(ourIntent);
                }
            }
        };
        next.start();
    }
}
