package com.example.elsanabaryelectronics;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Mobaile_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Mobaile_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Mobaile_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Mobaile_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Mobaile_Fragment newInstance(String param1, String param2) {
        Mobaile_Fragment fragment = new Mobaile_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mobaile_, container, false);
        String[] mobaile = {"hoho", "wings", "moon light", "lg"};
        int[] mobaile_photo = {R.drawable.hoho, R.drawable.moonlight, R.drawable.wings, R.drawable.lg};
        // Inflate the layout for this fragment

        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        MyRecyclerAdapter adapter1 = new MyRecyclerAdapter(mobaile,mobaile_photo);
        recyclerView.setAdapter(adapter1);
        GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(manager);
        return view;

    }
}