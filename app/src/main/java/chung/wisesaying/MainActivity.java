package chung.wisesaying;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost mTab = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        // Option Tab
        intent = new Intent(this, OptionActivity.class);
        spec = mTab.newTabSpec("Option").setIndicator("Option").setContent(intent);
        mTab.addTab(spec);

        // Widget Tab
        intent = new Intent(this, WidgetActivity.class);
        spec = mTab.newTabSpec("Widget").setIndicator("Widget").setContent(intent);
        mTab.addTab(spec);

        // Favorite Tab
        intent = new Intent(this, FavoriteActivity.class);
        spec = mTab.newTabSpec("Favorite").setIndicator("Favorite").setContent(intent);
        mTab.addTab(spec);
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
