package com.educodes.booksort;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView booksRecView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputStream is = null;
        try {
            is = (InputStream) new URL("https://cdnw.kitabinabak.com/anaresim/7eb9d1f1b65d49798e96a073cfdae126N.webp").getContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Drawable d = Drawable.createFromStream(is, "src name");

        booksRecView = findViewById(R.id.booksRecView);

        ArrayList<Book> branches = new ArrayList<>();
        branches.add(new Book("12.25", d));

    }
}