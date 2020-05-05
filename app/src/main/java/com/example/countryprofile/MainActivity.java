package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countryNames;
    private int[] flags={R.drawable.australia,R.drawable.bangladesh,R.drawable.canada,R.drawable.denmark,
            R.drawable.egypt,R.drawable.france,R.drawable.germany,R.drawable.hongkong,
            R.drawable.india,R.drawable.japan,R.drawable.kuwait,R.drawable.malaysia,
            R.drawable.newzealand,R.drawable.pakistan,R.drawable.qatar,R.drawable.russia,
            R.drawable.saudiarabia,R.drawable.unitedkingdom,R.drawable.unitedstates,R.drawable.vietnam,R.drawable.zimbabwe
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames=getResources().getStringArray(R.array.country_names);

        listView=findViewById(R.id.listViewId);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        myToolbar.setLogo(R.drawable.logo);
        myToolbar.setTitle("     Country Profile");
        setSupportActionBar(myToolbar);




        final CustomAdaptor  adapter=new CustomAdaptor(this,countryNames,flags);
        listView.setAdapter(adapter);
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,CountryProfile.class);
                intent.putExtra("name",countryNames[position]);
                startActivity(intent);
            }
        });

           }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertBuilder=new AlertDialog.Builder(MainActivity.this);
        alertBuilder.setIcon(R.drawable.question);
        alertBuilder.setTitle(R.string.title_text);
        alertBuilder.setMessage(R.string.message_text);
        alertBuilder.setCancelable(false);
        alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog=alertBuilder.create();
        alertDialog.show();
    }
}
