package com.example.kundalikodob;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {



    Toolbar toolbar;
    RecyclerView recyclerView;
    List<com.example.kundalikodob.ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;


    ConstraintLayout constraintLayout;
    UserAdapterAC2 userAdapter;
    ImageView imageViewc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
//        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.teal_200));


        switch (getChemgeItemPosition){
            case 0: {

                textViewSelectedChapterName.setText("ERTAKLAR");

                modelRcyclers.add(new ModelRcycler("Alisher Navoiyning Non isi ertagi","VTmL1Pgt09g"));
                modelRcyclers.add(new ModelRcycler("Sehrli daraxt multfilm","IR0gAxJe5xQ"));
                modelRcyclers.add(new ModelRcycler("Do'stlar multfilm","tKFHgKTPgbk"));
                modelRcyclers.add(new ModelRcycler("Dugonalar_miltfilm","QoSmI_blx1Q"));
                modelRcyclers.add(new ModelRcycler("Echki bolalari multfilm","8xvpfy63gPw"));
                modelRcyclers.add(new ModelRcycler("Multfilm: Oltin tarvuz ","LMop0DT2W_A"));
                modelRcyclers.add(new ModelRcycler("O'n ikki oy multfilm","EFuvSv_BGN8"));
                modelRcyclers.add(new ModelRcycler("Sumalak va 1000 tilak multfilm","yeB9X9dO_p0"));
                modelRcyclers.add(new ModelRcycler("Yo'l va bolalar multfilm","jcVqTXFpAJA"));
                modelRcyclers.add(new ModelRcycler("Zumrad va Qimmat yangi talqin multfilm","r9i-646a1-Q"));

            }break;
            case 1: {

                textViewSelectedChapterName.setText("HIKOYALAR");

                modelRcyclers.add(new ModelRcycler("Ibratli hikoya Duoning kuchi","pTWwjHcs41Q"));
                modelRcyclers.add(new ModelRcycler("Ibratli hikoya Ota va bola suhbati","PTfPFu6QzA8"));
                modelRcyclers.add(new ModelRcycler("Ikki chelak nok multfilm","6XEST2Vuq7M"));
                modelRcyclers.add(new ModelRcycler("Och ko'z xo'roz multfilm","Q_1zK4WbgcA"));
                modelRcyclers.add(new ModelRcycler("Onangizni qadrlang multfilm","S1djLvuIlhI"));
                modelRcyclers.add(new ModelRcycler("To'g'rivoy bilan Egrivoy multfilm","KYofXUmAFCo"));
                modelRcyclers.add(new ModelRcycler("Uddaburon shogird multfilm","aZEkG6BPleY"));
                //modelRcyclers.add(new ModelRcycler("Umid tabassumi Ayblashga shoshilmang","Ef1uNOKbsVI"));
                modelRcyclers.add(new ModelRcycler("Umid tabassumi Yaqinlaringizni qadrlang","CPb8zevf4Gc"));
                modelRcyclers.add(new ModelRcycler("Umid tabassumi Ona mehri","IssCGlJzpQw"));

            }break;

            case 2: {

                textViewSelectedChapterName.setText("MAQOLLAR");

                modelRcyclers.add(new ModelRcycler("Maqollardan parchalar","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/maqol.pdf"));
                modelRcyclers.add(new ModelRcycler("Maqollar videosi 1-qism","yUQLm-s3BaY"));
                modelRcyclers.add(new ModelRcycler("Maqollar videosi 2-qism","-nstRZ0ED08"));
                modelRcyclers.add(new ModelRcycler("Maqollar videosi 3-qism","6dtpU_1OtjY"));


            }break;
            case 3: {

                textViewSelectedChapterName.setText("TEZ AYTISHLAR");

                modelRcyclers.add(new ModelRcycler("Tez aytishlar parchalar","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/tez_aytishlar.pdf"));
                modelRcyclers.add(new ModelRcycler("1-tez aytish","SvjJzr5LyRM"));
                modelRcyclers.add(new ModelRcycler("2-tez aytish","0g5lDzbgtFk"));
                modelRcyclers.add(new ModelRcycler("3-tez aytish","TDmPqPJwnOs"));
                modelRcyclers.add(new ModelRcycler("4-tez aytish","_AF1F8zDthw"));
                modelRcyclers.add(new ModelRcycler("5-tez aytish","hpAKJAsyTno"));
                modelRcyclers.add(new ModelRcycler("6-tez aytish","LqV3XzpoBpk"));
                modelRcyclers.add(new ModelRcycler("7-tez aytish","lAlJVAW8EGU"));
                modelRcyclers.add(new ModelRcycler("8-tez aytish","5psTdY8WELc"));
                modelRcyclers.add(new ModelRcycler("9-tez aytish","9lfYUaYs9fc"));
                modelRcyclers.add(new ModelRcycler("10-tez aytish","t4RpAHi0-lo"));
                modelRcyclers.add(new ModelRcycler("11-tez aytish","lc6pa2ulGpE"));
                modelRcyclers.add(new ModelRcycler("12-tez aytish","Q9RuN61sJi4"));
                modelRcyclers.add(new ModelRcycler("13-tez aytish","06EP2Kfmj3Y"));
                modelRcyclers.add(new ModelRcycler("14-tez aytish","m55LXYHZtjQ"));
                modelRcyclers.add(new ModelRcycler("15-tez aytish","EonjZ43Ju_A"));
                modelRcyclers.add(new ModelRcycler("16-tez aytish","2nfTINrMBOw"));

            }break;


            case 4: {

                textViewSelectedChapterName.setText("TOPISHMOQLAR");

                modelRcyclers.add(new ModelRcycler("Topishmoqlardan parchalar","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/topishmoqlar.pdf"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 1-qism","gdSrRcgaPgo"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 2-qism","LZtAjiAqtxI"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 3-qism","odCcBaYeCqw"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 4-qism","t7mbKT4pQK0"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 5-qism","Z9Z7hb4XEoU"));

            }break;
            case 5: {

                textViewSelectedChapterName.setText("ERTAKLAR MASHG'ULOT ISHLANMALARI");

                modelRcyclers.add(new ModelRcycler("O'n ikki oy ertagi","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/12oy_ertagi.pdf"));
                modelRcyclers.add(new ModelRcycler("Bog'bon ertagi","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/bogbon.pdf"));
                modelRcyclers.add(new ModelRcycler("Do'stlik ertagi","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/dustlik.pdf"));
                modelRcyclers.add(new ModelRcycler("Mehmon keldi(Sumalak)","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/mehmon_keldi.pdf"));
                modelRcyclers.add(new ModelRcycler("Non isi(Rivoyat)","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/non_isi.pdf"));
                modelRcyclers.add(new ModelRcycler("Oltin tarvuz","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/oltin_tarvuz.pdf"));
                modelRcyclers.add(new ModelRcycler("Dan xodimi (Yo‘l va bolalar) ","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/yol_va_bolalar.pdf"));
                modelRcyclers.add(new ModelRcycler("O‘zbek xalq ertagi Zumrad va Qimmat ","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/zumrad_va_qimmat.pdf"));

            }break;


        }

        userAdapter  = new UserAdapterAC2(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);



    }

    @RequiresApi(api = Build.VERSION_CODES.P)




    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        if (modelRcycler.getLessonName().toLowerCase().startsWith("maqollardan") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("topishmoqlardan") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("o'n") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("12oy")||
        modelRcycler.getLessonName().toLowerCase().startsWith("bog'bon") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("do'stlik")||
        modelRcycler.getLessonName().toLowerCase().startsWith("mehmon") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("non")||
        modelRcycler.getLessonName().toLowerCase().startsWith("oltin") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("dan")||
                modelRcycler.getLessonName().toLowerCase().startsWith("tez")||
                modelRcycler.getLessonName().toLowerCase().startsWith("o‘zbek")
        ){
//
            startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
        }
        else {

            startActivity(new Intent(MainActivity2.this, MainActivity4.class).putExtra("data",modelRcycler.getLoadUrl()));


        }

    }
}