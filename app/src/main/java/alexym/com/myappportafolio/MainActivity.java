package alexym.com.myappportafolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButtons(View view) {
        Button b = (Button)view;
        String tagButton = (String) b.getTag();

        switch (tagButton){
            case "Button1":
                Log.i(TAG, "El boton es "+ tagButton);
                Toast.makeText(MainActivity.this,b.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case "Button2":
                Log.i(TAG, "El boton es "+ tagButton);
                Toast.makeText(MainActivity.this,b.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case "Button3":
                Log.i(TAG, "El boton es "+ tagButton);
                Toast.makeText(MainActivity.this,b.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case "Button4":
                Log.i(TAG, "El boton es "+ tagButton);
                Toast.makeText(MainActivity.this,b.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case "Button5":
                Log.i(TAG, "El boton es "+ tagButton);
                Toast.makeText(MainActivity.this,b.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case "Button6":
                Log.i(TAG, "El boton es "+ tagButton);
                Toast.makeText(MainActivity.this,b.getText().toString(),Toast.LENGTH_SHORT).show();
                break;

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
