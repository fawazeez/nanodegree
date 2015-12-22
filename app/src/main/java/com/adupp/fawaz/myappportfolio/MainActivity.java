package com.adupp.fawaz.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button_app1 = (Button) findViewById(R.id.button_app1);
        button_app1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS BUTTON WILL LAUNCH MY " + getString(R.string.app1), Toast.LENGTH_SHORT).show();
                Snackbar.make(v, R.string.app1, Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

            }
        });

        Button button_app2a = (Button) findViewById(R.id.button_app2a);
        button_app2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS BUTTON WILL LAUNCH MY "+ getString(R.string.app2a), Toast.LENGTH_SHORT).show();
                Snackbar.make(v,R.string.app2a, Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

            }
        });

        Button button_app2b = (Button) findViewById(R.id.button_app2b);
        button_app2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS BUTTON WILL LAUNCH MY "+ getString(R.string.app2b), Toast.LENGTH_SHORT).show();
                Snackbar.make(v,R.string.app2b, Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

            }
        });

        Button button_app3 = (Button) findViewById(R.id.button_app3);
        button_app3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS BUTTON WILL LAUNCH MY " + getString(R.string.app3), Toast.LENGTH_SHORT).show();
                Snackbar.make(v,R.string.app3, Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

            }
        });
        Button button_app4 = (Button) findViewById(R.id.button_app4);
        button_app4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS BUTTON WILL LAUNCH MY " + getString(R.string.app4), Toast.LENGTH_SHORT).show();
                Snackbar.make(v,R.string.app4, Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

            }
        });
        Button button_app5 = (Button) findViewById(R.id.button_app5);
        button_app5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "THIS BUTTON WILL LAUNCH MY "+  getString(R.string.app5), Toast.LENGTH_SHORT).show();
                Snackbar.make(v,R.string.app5, Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

            }
        });
       /* fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
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
