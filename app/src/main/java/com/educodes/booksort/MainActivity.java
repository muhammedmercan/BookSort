package com.educodes.booksort;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    private Elements desktopOnly;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OpenUrl();


        try {

                Document doc = Jsoup.connect("http://example.com").get();


            doc.select("p").forEach(System.out::println);
                desktopOnly = doc.getElementsByClass("betternet-wrapper");
                String articleHtml = desktopOnly.html();
                Toast.makeText(this, articleHtml, Toast.LENGTH_SHORT).show();


        } catch (IOException e) {
            Toast.makeText(this, "deneme2", Toast.LENGTH_SHORT).show();

            e.printStackTrace();
        }




    }

    private void OpenUrl() {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kitabinabak.com/sorgu/Kitap?bak=9789750719387&sira=ord"));
        startActivity(browserIntent);

    }

}