package com.educodes.booksort;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ResultPrice extends AppCompatActivity {

    private RecyclerView booksRecView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_price);

        booksRecView = findViewById(R.id.booksRecView);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("12.25 TL", "https://i.imgur.com/DvpvklR.png"));
        books.add(new Book("12.25 TL", "https://i.imgur.com/DvpvklR.png"));
        books.add(new Book("12.25 TL", "https://i.imgur.com/DvpvklR.png"));
        books.add(new Book("12.25 TL", "https://i.imgur.com/DvpvklR.png"));
        books.add(new Book("12.25 TL", "https://i.imgur.com/DvpvklR.png"));
        books.add(new Book("12.25 TL", "https://i.imgur.com/DvpvklR.png"));

        BookRecyclerAdapter adapter = new BookRecyclerAdapter(books,this);
        adapter.setBranches(books);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

    }


    }
