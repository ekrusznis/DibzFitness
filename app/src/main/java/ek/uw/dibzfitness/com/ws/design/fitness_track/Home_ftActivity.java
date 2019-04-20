package ek.uw.dibzfitness.com.ws.design.fitness_track;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import ek.uw.dibzfitness.R;
import ek.uw.dibzfitness.adapter.Home_adapter;
import ek.uw.dibzfitness.model.Home_model;

public class Home_ftActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Home_adapter home_adapter;
    private ArrayList<Home_model> home_models;

    Integer categories[] = {R.drawable.crown, R.drawable.forkknife, R.drawable.checklist, R.drawable.progresstrasker,
            R.drawable.cal, R.drawable.likeicon, R.drawable.chaticon, R.drawable.watchicon, R.drawable.crown};

    String text_body[] = {"My Profile","Nutrition","Today's Task","Progress Tracker","Calender","My Group","Share Ideas",
            "My Devices", "Become  Pro!"};

    LinearLayout li1,li2,li3,li4;
    ImageView img1,img2,img3,img4;
    TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ft);

        recyclerView = findViewById(R.id.recycle1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Home_ftActivity.this, 3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        home_models = new ArrayList<>();

        for (int i = 0; i < categories.length; i++) {
            Home_model ab = new Home_model(categories[i],text_body[i]);
            home_models.add(ab);
        }
        home_adapter = new Home_adapter(Home_ftActivity.this, home_models);
        recyclerView.setAdapter(home_adapter);
//
//        li1 = findViewById(R.id.li1);
//        li2 = findViewById(R.id.li2);
//        li3 = findViewById(R.id.li3);
//        li4 = findViewById(R.id.li4);
//
//        img1 = findViewById(R.id.img1);
//        img2 = findViewById(R.id.img2);
//        img3 = findViewById(R.id.img3);
//        img4 = findViewById(R.id.img4);
//
//        tv1 = findViewById(R.id.tv1);
//        tv2 = findViewById(R.id.tv2);
//        tv3 = findViewById(R.id.tv3);
//        tv4 = findViewById(R.id.tv4);
//
//        li1.setOnClickListener(this);
//        li2.setOnClickListener(this);
//        li3.setOnClickListener(this);
//        li4.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.li1:
//                img1.setColorFilter(Color.parseColor("#0086ff"));
//                img2.setColorFilter(Color.parseColor("#323643"));
//                img3.setColorFilter(Color.parseColor("#323643"));
//                img4.setColorFilter(Color.parseColor("#323643"));
//
//                tv1.setTextColor(Color.parseColor("#0086ff"));
//                tv2.setTextColor(Color.parseColor("#323643"));
//                tv3.setTextColor(Color.parseColor("#323643"));
//                tv4.setTextColor(Color.parseColor("#323643"));
//                break;
//
//            case R.id.li2:
//                img1.setColorFilter(Color.parseColor("#323643"));
//                img2.setColorFilter(Color.parseColor("#0086ff"));
//                img3.setColorFilter(Color.parseColor("#323643"));
//                img4.setColorFilter(Color.parseColor("#323643"));
//
//                tv1.setTextColor(Color.parseColor("#323643"));
//                tv2.setTextColor(Color.parseColor("#0086ff"));
//                tv3.setTextColor(Color.parseColor("#323643"));
//                tv4.setTextColor(Color.parseColor("#323643"));
//                break;
//
//            case R.id.li3:
//                img1.setColorFilter(Color.parseColor("#323643"));
//                img2.setColorFilter(Color.parseColor("#323643"));
//                img3.setColorFilter(Color.parseColor("#0086ff"));
//                img4.setColorFilter(Color.parseColor("#323643"));
//
//                tv1.setTextColor(Color.parseColor("#323643"));
//                tv2.setTextColor(Color.parseColor("#323643"));
//                tv3.setTextColor(Color.parseColor("#0086ff"));
//                tv4.setTextColor(Color.parseColor("#323643"));
//                break;
//
//            case R.id.li4:
//                img1.setColorFilter(Color.parseColor("#323643"));
//                img2.setColorFilter(Color.parseColor("#323643"));
//                img3.setColorFilter(Color.parseColor("#323643"));
//                img4.setColorFilter(Color.parseColor("#0086ff"));
//
//                tv1.setTextColor(Color.parseColor("#323643"));
//                tv2.setTextColor(Color.parseColor("#323643"));
//                tv3.setTextColor(Color.parseColor("#323643"));
//                tv4.setTextColor(Color.parseColor("#0086ff"));
//                break;
//        }
    }
