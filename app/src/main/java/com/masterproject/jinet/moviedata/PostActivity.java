package com.masterproject.jinet.moviedata;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PostActivity extends AppCompatActivity {

    private EditText movieEditTxt;
    private EditText reviewEditTxt;

    private Button submitBtn;

    private ProgressDialog mProgress;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Review");

        movieEditTxt = (EditText) findViewById(R.id.movieEditText);
        reviewEditTxt = (EditText) findViewById(R.id.reviewEditText);

        submitBtn = (Button) findViewById(R.id.submitbutton);

        mProgress = new ProgressDialog(this);

        submitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startPosting();
            }
        });
    }

    private void startPosting(){
        mProgress.setMessage("Posting your review...");
        mProgress.show();

        String title_val = movieEditTxt.getText().toString().trim();
        String review_val = reviewEditTxt.getText().toString().trim();

        if(!TextUtils.isEmpty(title_val) && !TextUtils.isEmpty(review_val)){

            DatabaseReference newPost = mDatabase.push();

            newPost.child("title").setValue(title_val);
            newPost.child("review").setValue(review_val);

            mProgress.dismiss();

            startActivity(new Intent(PostActivity.this, ReviewingActivity.class));

        }

    }

}
