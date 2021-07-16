package com.example.elsanabaryelectronics;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoriesFragment extends Fragment {
    ListView lst;
    Button b1;
    SQLiteDatabase db =null;
    Cursor cursor= null;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CategoriesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CategoriesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CategoriesFragment newInstance(String param1, String param2) {
        CategoriesFragment fragment = new CategoriesFragment();
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


        View view = inflater.inflate(R.layout.fragment_categories, container, false);
        String[] cat = {"Tv", "Blinder", "MicroWaves", "Mobail"};
        String[] tv = {"hoho", "wings", "moon light", "lg"};
        int[] tv_photo = {R.drawable.hoho, R.drawable.moonlight, R.drawable.wings, R.drawable.lg};
        ListView listView = view.findViewById(R.id.list_view500);
        ArrayAdapter adapter = new ArrayAdapter(inflater.getContext(), android.R.layout.simple_list_item_1, cat);
       // lst = (ListView)view.findViewById(R.id.list_view500);
       // MyDBhelper dBhelper = new MyDBhelper(inflater.getContext());
       // SQLiteDatabase db = dBhelper.getWritableDatabase();
       // Cursor cursor= db.rawQuery("select  _id,name from CATEGORIES" , null);
       // SimpleCursorAdapter cursorAdapter = new SimpleCursorAdapter(
         //       inflater.getContext(),android.R.layout.simple_list_item_1 ,cursor ,
           //     new String[]{"NAME"}, new int[]{android.R.id.text1},0);

       listView.setAdapter(adapter);


        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
           @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int position , long id) {



                    Tv_Fragment tv_fragment = new Tv_Fragment();
                    Blinder_Fragment blinder_fragment = new Blinder_Fragment();
                    Mobaile_Fragment mobaile_fragment = new Mobaile_Fragment();
                    Microwave_Fragment microwave_fragment = new Microwave_Fragment();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();


                    if (position == 1){
                        transaction.replace(R.id.frame , tv_fragment);
                    }if (position == 2){
                        transaction.replace(R.id.frame , blinder_fragment);
                    }if (position == 3){
                        transaction.replace(R.id.frame , microwave_fragment);
                    }if (position == 4){
                        transaction.replace(R.id.frame , mobaile_fragment);
                    }

                    transaction.addToBackStack(null);
                    transaction.commit();

         }
         };

        b1 = view.findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AddToCat.class));
            }
        });


         listView.setOnItemClickListener(listener);


        // Inflate the layout for this fragment

          RecyclerView recyclerView = view.findViewById(R.id.recycler);
          MyRecyclerAdapter adapter1 = new MyRecyclerAdapter(tv,tv_photo);
          recyclerView.setAdapter(adapter1);
          GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
          recyclerView.setLayoutManager(manager);
        return view;
    }

    //@Override
   /* public void onDestroy() {
        super.onDestroy();
        cursor.close();
        db.close();

    }*/

}