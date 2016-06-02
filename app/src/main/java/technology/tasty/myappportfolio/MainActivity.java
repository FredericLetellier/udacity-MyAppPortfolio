package technology.tasty.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void sendMessage_popular_movies(View view) {
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.message_popular_movies);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void sendMessage_stock_hawk(View view) {
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.message_stock_hawk);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void sendMessage_build_it_bigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.message_build_it_bigger);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void sendMessage_make_your_app_material(View view) {
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.message_make_your_app_material);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void sendMessage_go_ubiquitous(View view) {
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.message_go_ubiquitous);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void sendMessage_capstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.message_capstone);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
