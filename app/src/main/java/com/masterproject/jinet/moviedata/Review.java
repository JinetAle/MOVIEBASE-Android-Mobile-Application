package com.masterproject.jinet.moviedata;


public class Review {

    private String title;
    private String review;

    public Review(){

    }

    public Review(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
