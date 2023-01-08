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

public class MainActivity5 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {



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
        setContentView(R.layout.activity_main5);


        Intent intent = getIntent();
        imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView4);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
//        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName10);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout2);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));


        switch (getChemgeItemPosition){
            case 0: {

                textViewSelectedChapterName.setText("Bolajonlarni Avtobusda kattalarga xurmat odobi");

                modelRcyclers.add(new ModelRcycler("Avtobusda o'tirish odobi 1-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/odob1.pdf"));
                modelRcyclers.add(new ModelRcycler("Kattalarga joy berish odobi 2-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/odob2.pdf"));
                modelRcyclers.add(new ModelRcycler("Kichkina bo'lib joy bermaslik odobsizlik 3-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/odob3.pdf"));
                modelRcyclers.add(new ModelRcycler("Kattalarga joy berish odobi 4-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/odob4.pdf"));
                modelRcyclers.add(new ModelRcycler("Shafyorga yo'l haqini berish odobi 5-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/odob5.pdf"));
                modelRcyclers.add(new ModelRcycler("Tartib bilan shafyorga yo'l haqini berish odobi 6-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/odob6.pdf"));
                modelRcyclers.add(new ModelRcycler("Avtobusda harakatlanish 7-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/odob7.pdf"));
                modelRcyclers.add(new ModelRcycler("Abtobusda harakatlanish 8-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/odob8.pdf"));


            }break;
            case 1: {

                textViewSelectedChapterName.setText("Bolalarni Muzey va badiiy adabiyotlar bilan tanishtirish");

                modelRcyclers.add(new ModelRcycler("Bolalarni Muzey va badiiy adabiyotlar bilan tanishtirish 1-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/muzey1.pdf"));
                modelRcyclers.add(new ModelRcycler("Bolalarni Muzey va badiiy adabiyotlar bilan tanishtirish 2-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/muzey2.pdf"));
                modelRcyclers.add(new ModelRcycler("Bolalarni Muzey va badiiy adabiyotlar bilan tanishtirish 3-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/muzey3.pdf"));
                modelRcyclers.add(new ModelRcycler("Bolalarni Muzey va badiiy adabiyotlar bilan tanishtirish 4-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/muzey4.pdf"));
                modelRcyclers.add(new ModelRcycler("Bolalarni Muzey va badiiy adabiyotlar bilan tanishtirish 5-odob","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/muzey5.pdf"));


            }break;

            case 2: {

                textViewSelectedChapterName.setText("Do'stiga yordam berish odobi");

                modelRcyclers.add(new ModelRcycler("Do'stiga yordam berish odobi 1-qism","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/dust1.pdf"));
                modelRcyclers.add(new ModelRcycler("Do'stiga yordam berish odobi 2-qism","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/dus2.pdf"));



            }break;

            case 3: {

                textViewSelectedChapterName.setText("Kattalarni xurmat qilish odobi");

                modelRcyclers.add(new ModelRcycler("Kattalarni xurmat qilish odobi 1-qism","kc72xPN0Hmk"));
                modelRcyclers.add(new ModelRcycler("Kattalarni xurmat qilish odobi 2-qism","PIGxz-cHF9Q"));
                modelRcyclers.add(new ModelRcycler("Kattalarni xurmat qilish odobi 3-qism","HcxKn0usuHY"));

            }break;
            case 4: {

                textViewSelectedChapterName.setText("Salomlashish odobi");

                modelRcyclers.add(new ModelRcycler("Salomlashish odobi 1-qism","kc72xPN0Hmk"));
                modelRcyclers.add(new ModelRcycler("Salomlashish odobi 2-qism","kc72xPN0Hmk"));

            }break;


        }

        userAdapter  = new UserAdapterAC2(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);



    }

    @RequiresApi(api = Build.VERSION_CODES.P)




    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        if (modelRcycler.getLessonName().toLowerCase().startsWith("avtobusda") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("kattalarga") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("kichkina")||
                modelRcycler.getLessonName().toLowerCase().startsWith("shafyorga") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("tartib")||
                modelRcycler.getLessonName().toLowerCase().startsWith("bolalarni")||
                modelRcycler.getLessonName().toLowerCase().startsWith("do'stiga")
        ){
//
            startActivity(new Intent(MainActivity5.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
        }
        else {

            startActivity(new Intent(MainActivity5.this, MainActivity4.class).putExtra("data",modelRcycler.getLoadUrl()));


        }

    }
}