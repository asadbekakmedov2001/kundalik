package com.example.kundalikodob.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.kundalikodob.MainActivity2;
import com.example.kundalikodob.MainActivity3;
import com.example.kundalikodob.MainActivity5;
import com.example.kundalikodob.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {




    RecyclerView mRecyclerView;
    View rootView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_home, container, false);


        // ruyhatni eloni va sozlanmasi
        mRecyclerView = rootView.findViewById(R.id.recyclerView1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        mRecyclerView.setAdapter(userAdapter);


        return rootView;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.ertak,"Ertaklar","Bolajonlar uchun barcha mavzularga doir eng sara, qiziqarli, ibratli o'zbek xalq ertaklari...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.hikoyalar,"Hikoyalar","Barcha mavzularga oid eng sara ibratli hikoyalar...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.maqol,"Maqollar","Barcha mavzularga oid eng sara o'zbek va jahon maqollari...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.tez_aytish,"Tez aytishlar","Xalq ogʻzaki ijodi turlaridan biri boʻlmish tez aytish ayrim nutq tovushlarining koʻp qaytarilishi yoki tovushlarning soʻz va iboralar tarkibida talaffuzni qiyinlashtiradigan darajada murakkab joylashishiga asoslanadi... ","https://github.com/asadbekakmedov2001/ustoziga/raw/master/app/src/main/assets/tez_aytishlar.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.topishmoq,"Topishmoqlar","Barcha mavzularga oid eng sara topishmoqlar javobi bilan...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.beshbob,"Ertaklar mashg'ulot ishlanmalari","",""));


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        if (modelRcycler.getTextName().toLowerCase().startsWith("xalq") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("pers") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("adabiyot")
        ){
//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
        }
        else {

            startActivity(new Intent(getContext(), MainActivity2.class).putExtra("swimmers",modelRcyclers.indexOf(modelRcycler)));


        }

    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        modelRcyclers.clear();
//    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}