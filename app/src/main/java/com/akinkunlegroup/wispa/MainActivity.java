package com.akinkunlegroup.wispa;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    RecyclerView mRecyclerView;
    ArrayList<FeedModel> mFeedModels = new ArrayList<>();
    FeedAdapter mFeedAdapter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mRecyclerView = this.findViewById(R.id.recycler);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mFeedAdapter = new FeedAdapter(this, mFeedModels);
        mRecyclerView.setAdapter(mFeedAdapter);


        populateView();
    }

    public void populateView(){
        FeedModel feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 201,100, R.drawable.uploaded1, 0, "10 hrs ago",
                "I have just decided to put myself first always before anybody, I can't take shit anymore",
                "Funmilayo Wilson");
        mFeedModels.add(feedModel);feedModel = new FeedModel(1, 301,748, R.drawable.uploaded1, R.drawable.uploaded2, "2 hrs ago",
                "I Just took this picture as I travelled to the United States of America. They loved me and I felt welcomed",
                "Akin Wilderman");
        mFeedModels.add(feedModel);
        feedModel = new FeedModel(1, 197,530, R.drawable.uploaded5, R.drawable.uploaded4, "5 hrs ago",
                "My beautiful friend Louchee Chels, stay beautiful forever. I cannot express how much I adore you, I just" +
                        "want you to know that you are loved.",
                "Thelma");

        mFeedAdapter.notifyDataSetChanged();

    }

}
