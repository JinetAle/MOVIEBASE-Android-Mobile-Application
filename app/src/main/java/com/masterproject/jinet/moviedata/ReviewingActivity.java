package com.masterproject.jinet.moviedata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ReviewingActivity extends AppCompatActivity {

    private RecyclerView ReviewsList;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewing);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Review");

        ReviewsList = (RecyclerView) findViewById(R.id.reviews_list);
        ReviewsList.setHasFixedSize(true);
        ReviewsList.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Review, ReviewViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Review, ReviewViewHolder>(
                Review.class,
                R.layout.reviews_row,
                ReviewViewHolder.class,
                mDatabase
        ){
            @Override
            protected void populateViewHolder(ReviewViewHolder viewHolder, Review model, int position){

                viewHolder.setTitle(model.getTitle());
                viewHolder.setReview(model.getReview());

            }
        };
        ReviewsList.setAdapter(firebaseRecyclerAdapter);
    }

    public static class ReviewViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public ReviewViewHolder(View itemView) {
            super(itemView);

            mView = itemView;
        }
        public void setTitle(String title){
            TextView post_title = (TextView) mView.findViewById(R.id.post_title);
            post_title.setText(title);
        }
        public void setReview(String review){
            TextView post_review = (TextView) mView.findViewById(R.id.post_review);
            post_review.setText(review);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.review_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_add){
            startActivity(new Intent(ReviewingActivity.this, PostActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
