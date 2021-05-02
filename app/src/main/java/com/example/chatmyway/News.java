package com.example.chatmyway;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

public class News extends AppCompatActivity {
    TextView Date1;
    TextView Headline1;
    TextView Source1;
    ImageView image1;
    TextView Date2;
    TextView Headline2;
    TextView Source2;
    ImageView image2;
    TextView Date3;
    TextView Headline3;
    TextView Source3;
    ImageView image3;
    TextView Date4;
    TextView Headline4;
    TextView Source4;
    ImageView image4;
    TextView Date5;
    TextView Headline5;
    TextView Source5;
    ImageView image5;
    TextView Date6;
    TextView Headline6;
    TextView Source6;
    ImageView image6;
    TextView Date7;
    TextView Headline7;
    TextView Source7;
    ImageView image7;
    TextView Date8;
    TextView Headline8;
    TextView Source8;
    ImageView image8;
    TextView Date9;
    TextView Headline9;
    TextView Source9;
    ImageView image9;
    TextView Date10;
    TextView Headline10;
    TextView Source10;
    ImageView image10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
        setTitle("Latest news");
        // COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Date1=(TextView)(findViewById(R.id.date1));
        Date2=(TextView)(findViewById(R.id.date2));
        Date3=(TextView)(findViewById(R.id.date3));
        Date4=(TextView)(findViewById(R.id.date4));
        Date5=(TextView)(findViewById(R.id.date5));
        Date6=(TextView)(findViewById(R.id.date6));
        Date7=(TextView)(findViewById(R.id.date7));
        Date8=(TextView)(findViewById(R.id.date8));
        Date9=(TextView)(findViewById(R.id.date9));
        Date10=(TextView)(findViewById(R.id.date10));
        image1=(ImageView)(findViewById(R.id.img1));
        image2=(ImageView)(findViewById(R.id.img2));
        image3=(ImageView)(findViewById(R.id.img3));
        image4=(ImageView)(findViewById(R.id.img4));
        image5=(ImageView)(findViewById(R.id.img5));
        image6=(ImageView)(findViewById(R.id.img6));
        image7=(ImageView)(findViewById(R.id.img7));
        image8=(ImageView)(findViewById(R.id.img8));
        image9=(ImageView)(findViewById(R.id.img9));
        image10=(ImageView)(findViewById(R.id.img10));
        Source1=(TextView)(findViewById(R.id.source1));
        Source2=(TextView)(findViewById(R.id.source2));
        Source3=(TextView)(findViewById(R.id.source3));
        Source4=(TextView)(findViewById(R.id.source4));
        Source5=(TextView)(findViewById(R.id.source5));
        Source6=(TextView)(findViewById(R.id.source6));
        Source7=(TextView)(findViewById(R.id.source7));
        Source8=(TextView)(findViewById(R.id.source8));
        Source9=(TextView)(findViewById(R.id.source9));
        Source10=(TextView)(findViewById(R.id.source10));
        Headline1=(TextView)(findViewById(R.id.headline1));
        Headline2=(TextView)(findViewById(R.id.headline2));
        Headline3=(TextView)(findViewById(R.id.headline3));
        Headline4=(TextView)(findViewById(R.id.headline4));
        Headline5=(TextView)(findViewById(R.id.headline5));
        Headline6=(TextView)(findViewById(R.id.headline6));
        Headline7=(TextView)(findViewById(R.id.headline7));
        Headline8=(TextView)(findViewById(R.id.headline8));
        Headline9=(TextView)(findViewById(R.id.headline9));
        Headline10=(TextView)(findViewById(R.id.headline10));
        getNews();

    }

    public void myListener(View view) {
        String url = url1;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }



    public void myListener1(View view){
        String url = url2;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    public void myListener2(View view){
        String url = url3;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    public void myListener3(View view){
        String url = url4;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    public void myListener4(View view){
        String url = url5;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    public void myListener5(View view){
        String url = url6;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    public void myListener6(View view){
        String url = url7;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    public void myListener7(View view){
        String url = url8;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    public void myListener8(View view){
        String url = url9;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    public void myListener9(View view){
        String url = url10;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        int colorInt = Color.parseColor("#15A6DC"); //cyan
        builder.setToolbarColor(colorInt);

    }
    String url1;
    String url2;
    String url3;
    String url4;
    String url5;
    String url6;
    String url7;
    String url8;
    String url9;
    String url10;

    private void getNews() {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://gnews.io/api/v4/top-headlines?token=cb4a2ce701cf2aa33d7bf8a526065dc2";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray articles=response.getJSONArray("articles");
                            JSONObject new1=articles.getJSONObject(0);
                            String title1=new1.getString("title");
                            String icon1=new1.getString("image");
                            url1=new1.getString("url");
                            Glide.with(News.this).load(icon1).into(image1);

                            try{
                                String date1=new1.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d1 = format3.format(format1.parse(date1));
                                Date1.setText(Main_day_d1);

                            }catch (Exception e){

                            }

                            JSONObject source1=new1.getJSONObject("source");
                            String realSource1=source1.getString("name");
                            Headline1.setText(title1);
                            Source1.setText(realSource1);

                            JSONObject new2=articles.getJSONObject(1);
                            String title2=new2.getString("title");
                            String icon2=new2.getString("image");
                            url2=new2.getString("url");
                            Glide.with(News.this).load(icon2).into(image2);

                            try{
                                String date2=new2.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d2 = format3.format(format1.parse(date2));
                                Date2.setText(Main_day_d2);

                            }catch (Exception e){

                            }

                            JSONObject source2=new2.getJSONObject("source");
                            String realSource2=source2.getString("name");
                            Headline2.setText(title2);
                            Source2.setText(realSource2);

                            JSONObject new3=articles.getJSONObject(2);
                            String title3=new3.getString("title");
                            String icon3=new3.getString("image");
                            url3=new3.getString("url");
                            Glide.with(News.this).load(icon3).into(image3);

                            try{
                                String date3=new3.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d3 = format3.format(format1.parse(date3));
                                Date3.setText(Main_day_d3);

                            }catch (Exception e){

                            }

                            JSONObject source3=new3.getJSONObject("source");
                            String realSource3=source3.getString("name");
                            Headline3.setText(title3);
                            Source3.setText(realSource3);

                            JSONObject new4=articles.getJSONObject(3);
                            String title4=new4.getString("title");
                            String icon4=new4.getString("image");
                            url4=new4.getString("url");
                            Glide.with(News.this).load(icon4).into(image4);

                            try{
                                String date4=new4.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d4 = format3.format(format1.parse(date4));
                                Date4.setText(Main_day_d4);

                            }catch (Exception e){

                            }

                            JSONObject source4=new4.getJSONObject("source");
                            String realSource4=source4.getString("name");
                            Headline4.setText(title4);
                            Source4.setText(realSource4);

                            JSONObject new5=articles.getJSONObject(4);
                            String title5=new5.getString("title");
                            String icon5=new5.getString("image");
                            url5=new5.getString("url");
                            Glide.with(News.this).load(icon5).into(image5);

                            try{
                                String date5=new5.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d5 = format3.format(format1.parse(date5));
                                Date5.setText(Main_day_d5);

                            }catch (Exception e){

                            }

                            JSONObject source5=new5.getJSONObject("source");
                            String realSource5=source5.getString("name");
                            Headline5.setText(title5);
                            Source5.setText(realSource5);

                            JSONObject new6=articles.getJSONObject(5);
                            String title6=new6.getString("title");
                            String icon6=new6.getString("image");
                            url6=new6.getString("url");
                            Glide.with(News.this).load(icon6).into(image6);

                            try{
                                String date6=new6.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d6 = format3.format(format1.parse(date6));
                                Date6.setText(Main_day_d6);

                            }catch (Exception e){

                            }

                            JSONObject source6=new6.getJSONObject("source");
                            String realSource6=source6.getString("name");
                            Headline6.setText(title6);
                            Source6.setText(realSource6);

                            JSONObject new7=articles.getJSONObject(6);
                            String title7=new7.getString("title");
                            String icon7=new7.getString("image");
                            url7=new7.getString("url");
                            Glide.with(News.this).load(icon7).into(image7);

                            try{
                                String date7=new7.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d7 = format3.format(format1.parse(date7));
                                Date7.setText(Main_day_d7);

                            }catch (Exception e){

                            }

                            JSONObject source7=new7.getJSONObject("source");
                            String realSource7=source7.getString("name");
                            Headline7.setText(title7);
                            Source7.setText(realSource7);

                            JSONObject new8=articles.getJSONObject(7);
                            String title8=new8.getString("title");
                            String icon8=new8.getString("image");
                            url8=new8.getString("url");
                            Glide.with(News.this).load(icon8).into(image8);

                            try{
                                String date8=new8.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d8 = format3.format(format1.parse(date8));
                                Date8.setText(Main_day_d8);

                            }catch (Exception e){

                            }

                            JSONObject source8=new8.getJSONObject("source");
                            String realSource8=source8.getString("name");
                            Headline8.setText(title8);
                            Source8.setText(realSource8);

                            JSONObject new9=articles.getJSONObject(8);
                            String title9=new9.getString("title");
                            String icon9=new9.getString("image");
                            url9=new9.getString("url");
                            Glide.with(News.this).load(icon9).into(image9);

                            try{
                                String date9=new9.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
                                String Main_day_d9 = format3.format(format1.parse(date9));
                                Date9.setText(Main_day_d9);

                            }catch (Exception e){

                            }

                            JSONObject source9=new9.getJSONObject("source");
                            String realSource9=source9.getString("name");
                            Headline9.setText(title9);
                            Source9.setText(realSource9);

                            JSONObject new10=articles.getJSONObject(9);
                            String title10=new10.getString("title");
                            String icon10=new10.getString("image");
                            url10  =new10.getString("url");
                            Glide.with(News.this).load(icon10).into(image10);

                            try{
                                String date10=new10.getString("publishedAt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd yyyy hh:mm a");
                                String Main_day_d10 = format3.format(format1.parse(date10));
                                Date10.setText(Main_day_d10);

                            }catch (Exception e){

                            }

                            JSONObject source10=new10.getJSONObject("source");
                            String realSource10=source10.getString("name");
                            Headline10.setText(title10);
                            Source10.setText(realSource10);


                        } catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();


                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(News.this, error.toString(), Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}


