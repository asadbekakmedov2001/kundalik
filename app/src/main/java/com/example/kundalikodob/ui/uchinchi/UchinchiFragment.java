package com.example.kundalikodob.ui.uchinchi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.kundalikodob.MainActivity4;
import com.example.kundalikodob.R;

import java.util.ArrayList;
import java.util.List;

public class UchinchiFragment extends Fragment implements UserAdapter.SelectedUser{

    Context mContext;
    RecyclerView mRecyclerView;
    View rootView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mContext = getActivity().getApplicationContext();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_gallery, container, false);


        mRecyclerView = rootView.findViewById(R.id.recyclerView2);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers, this);
        mRecyclerView.setAdapter(userAdapter);



        return rootView;
    }
    private void initial() {

        modelRcyclers.add(new ModelRcycler(R.drawable.kun_tartibi,"Kun tartibi                  ","O’quvchilarning uzoq, vaqt davomida ish qobiliyati va asab tizimi qo’zg’alishini yuqori darajada saqlashda kun davomida mehnat va dam olish vaqtlarining oqilona taqsimlanishini ta’minlay oladigan kun tartibi katta ahamiyatga ega....","k3aLpXLPIUo"));
        modelRcyclers.add(new ModelRcycler(R.drawable.uyqudan_turmoq1,"Uyqudan turganda joylarni yig'ishtirish 1-qism                   ","...              ","9vle4HAh19E"));
        modelRcyclers.add(new ModelRcycler(R.drawable.uyqudan_turmoq2,"Uyqudan turganda joylarni yig'ishtirish 2-qism                   ","...              ","x2O8nbq2548"));
        modelRcyclers.add(new ModelRcycler(R.drawable.uyqudan_turmoq3,"Uyquda turganda joylarni yig'ishtirmaslik                    ","...              ","uuftnGPfCso"));
        modelRcyclers.add(new ModelRcycler(R.drawable.badantarbiya2,"Badantarbiya                                   ","Ertalabki badantarbiya - sog`lik garovi...","eKSzB2XRmVc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.qollar1,"Qo'llarni sovunlab yuvish 1-qism                 ","...","IHjLX4mJVSU"));
        modelRcyclers.add(new ModelRcycler(R.drawable.qollar2,"Qo'llarni sovunlab yuvish 2-qism                 ","...","335MtLDNxoU"));
        modelRcyclers.add(new ModelRcycler(R.drawable.qollar3,"Qo'larni sovunlab yuvish 3-qism                  ","...","1e6dA-Xyl3E"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tish,"Tishlarni yuvish                        ","Tish va og'iz bo'shlig'ining gigienasi mutaxassislar tomonidan maxsus vositalar va asboblar yordamida va uyda amalga oshirilishi mumkin...","iA0XfClHDj0"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ovqat1,"To'g'ri ovqatlanish 1-qism                                ","...","6sE0Kva9qI4"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ovqat2,"To'g'ri ovqatlanish 2-qism                                ","...","SBFB4qiY1Zs"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ovqat3,"Ovqatlangandan song qo'llarni yuvish                  ","...","tU-D1vYioZk"));
        modelRcyclers.add(new ModelRcycler(R.drawable.shax_gig1,"Shaxsiy gigiyena qoidalar 1-qism                   ","...","FJFEO1VF7JE"));
        modelRcyclers.add(new ModelRcycler(R.drawable.shax_gig2,"Shaxsiy gigiyena qoidalar 2-qism                   ","...","lQkNBM5C89U"));
        modelRcyclers.add(new ModelRcycler(R.drawable.shax_gig3,"Shaxsiy gigiyena qoidalar 3-qism                   ","...","iT3WHnn268A"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video1,"Uch ajoyib kichkintoy multfilm                    ","...","UI7R7-VOLLo"));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        Intent intent = new Intent(getContext(), MainActivity4.class);
        intent.putExtra("data", modelRcycler.getLoadUrl());
        startActivity(intent);
    }
}