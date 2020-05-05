package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CountryProfile extends AppCompatActivity {
    ImageView imageCountry;
    TextView textCountry,tvShowMore;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        myToolbar.setLogo(R.drawable.logo);
        myToolbar.setTitle("     Country Profile");
        setSupportActionBar(myToolbar);

        imageCountry=findViewById(R.id.ivCountryImage);
        textCountry=findViewById(R.id.tvCountryProfile);
        tvShowMore=findViewById(R.id.tvShowMore);
        webView=findViewById(R.id.wvCountry);
        webView.setWebViewClient(new WebViewClient());


        webView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });


        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            String countryName=bundle.getString("name");
            tvShowMore.setText("More About "+countryName);
            showDetails(countryName);

        }


    }

    private void showDetails(String countryName) {
        if (countryName.equals("Australia")){
            imageCountry.setImageResource(R.drawable.australia_image);
            textCountry.setText(R.string.australia_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Australia");
        }
        else if (countryName.equals("Bangladesh")){
            imageCountry.setImageResource(R.drawable.bandladesh_image);
            textCountry.setText(R.string.bangladesh_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Bangladesh");
        }
        else if (countryName.equals("Canada")){
            imageCountry.setImageResource(R.drawable.canada_image);
            textCountry.setText(R.string.canada_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Canada");
        }
        else if (countryName.equals("Denmark")){
            imageCountry.setImageResource(R.drawable.denmark_image);
            textCountry.setText(R.string.denmark_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Denmark");
        }
        else if (countryName.equals("Egypt")){
            imageCountry.setImageResource(R.drawable.egypt_image);
            textCountry.setText(R.string.egypt_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Egypt");
        }
        else if (countryName.equals("France")){
            imageCountry.setImageResource(R.drawable.france_image);
            textCountry.setText(R.string.france_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/France");
        }
        else if (countryName.equals("Germany")){
            imageCountry.setImageResource(R.drawable.germany_image);
            textCountry.setText(R.string.germany_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Germany");
        }
        else if (countryName.equals("HongKong")){
            imageCountry.setImageResource(R.drawable.hongkong_image);
            textCountry.setText(R.string.hongkong_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Hong_Kong");
        }
        else if (countryName.equals("India")){
            imageCountry.setImageResource(R.drawable.india_image);
            textCountry.setText(R.string.india_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/India");
        }
        else if (countryName.equals("Japan")){
            imageCountry.setImageResource(R.drawable.japan_image);
            textCountry.setText(R.string.japan_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Japan");
        }
        else if (countryName.equals("Kuwait")){
            imageCountry.setImageResource(R.drawable.kuwait_image);
            textCountry.setText(R.string.kuwait_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Kuwait");
        }
        else if (countryName.equals("Malaysia")){
            imageCountry.setImageResource(R.drawable.malaysia_image);
            textCountry.setText(R.string.malaysia_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Malaysia");
        }
        else if (countryName.equals("New Zealand")){
            imageCountry.setImageResource(R.drawable.newzealand_image);
            textCountry.setText(R.string.newzealand_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/New_Zealand");
        }
        else if (countryName.equals("Pakistan")){
            imageCountry.setImageResource(R.drawable.pakistan_image);
            textCountry.setText(R.string.pakistan_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Pakistan");
        }
        else if (countryName.equals("Qatar")){
            imageCountry.setImageResource(R.drawable.qatar_image);
            textCountry.setText(R.string.qatar_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Qatar");
        }
        else if (countryName.equals("Russia")){
            imageCountry.setImageResource(R.drawable.russia_image);
            textCountry.setText(R.string.russia_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Russia");
        }
        else if (countryName.equals("Saudi Arabia")){
            imageCountry.setImageResource(R.drawable.saudiarabia_image);
            textCountry.setText(R.string.saudiarabia_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Saudi_Arabia");
        }
        else if (countryName.equals("United Kingdom")){
            imageCountry.setImageResource(R.drawable.uk_image);
            textCountry.setText(R.string.unitedkingdom_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/United_Kingdom");
        }
        else if (countryName.equals("United States of America")){
            imageCountry.setImageResource(R.drawable.us_image);
            textCountry.setText(R.string.usa_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/United_States");
        }
        else if (countryName.equals("Vietnam")){
            imageCountry.setImageResource(R.drawable.vietnam_image);
            textCountry.setText(R.string.vietnam_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Vietnam");
        }
        else if (countryName.equals("Zimbabwe")){
            imageCountry.setImageResource(R.drawable.zimbabwe_image);
            textCountry.setText(R.string.zimbabwe_profile);
            webView.loadUrl("https://en.wikipedia.org/wiki/Zimbabwe");
        }
    }
}
