package com.educodes.booksort;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BookRecyclerAdapter extends RecyclerView.Adapter<BookRecyclerAdapter.MyViewHolder> {

    private ArrayList<Book> books;

    private Context context;

    public BookRecyclerAdapter(ArrayList<Book> books, Context context) {
        this.books = books;
        this.context = context;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView bookPrice;
        ImageView publishingHouse;
        private CardView parent;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            bookPrice = itemView.findViewById(R.id.bookPrice);
            publishingHouse = itemView.findViewById(R.id.publishingHouse);
            parent = itemView.findViewById(R.id.parent);

        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_book_list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.bookPrice.setText(books.get(position).getBookPrice());
        Picasso.get().load(books.get(position).getPublishingHouse()).into(holder.publishingHouse);
        
    }
    @Override
    public int getItemCount() {
        return books.size();
    }

    public void setBranches(ArrayList<Book> branches) {
        this.books = branches;
        notifyDataSetChanged();
    }
}
