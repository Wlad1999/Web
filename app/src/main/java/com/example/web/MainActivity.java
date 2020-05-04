package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);
        final WebView webView = findViewById(R.id.web);

        final ArrayList<Object> list= new ArrayList<Object>();
        list.add("Google");
        list.add("Facebook");
        list.add("Instagram");
        list.add("Twitter");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,list);
        listView.setAdapter(arrayAdapter);
        listView.getSelectedItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0 ){
                    webView.loadUrl("https://www.google.com/");
                }
                else if(position == 1){
                    webView.loadUrl("https://www.facebook.com/");
                }
                else if(position == 2 ){
                    webView.loadUrl("https://www.instagram.com/");
                }
                else if (position == 3){
                    webView.loadUrl("https://www.twitter.com/");
                }
            }
        });
    }
}
