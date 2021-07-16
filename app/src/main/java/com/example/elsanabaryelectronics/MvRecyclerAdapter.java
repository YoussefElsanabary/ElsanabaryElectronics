package com.example.elsanabaryelectronics;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MvRecyclerAdapter extends RecyclerView.Adapter {

    String[] mv = null;
    int[] mv_photo = null;
    public MvRecyclerAdapter(String[] tv, int[] tv_photo) {
        this.mv = mv;
        this.mv_photo = mv_photo;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CardView cv = (CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_layout,viewGroup,false );
        return new MvRecyclerAdapter.MyViewHolder(cv);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        final CardView cv =((MyRecyclerAdapter.MyViewHolder) viewHolder).getCv();

        //  View.OnClickListener listener =new  View.OnClickListener() {

        //    @Override
        //  public void onClick(View view) {
        //    Intent intent =new Intent(cv.getContext(),CatDetails.class);
        //  cv.getContext().startActivity(intent);
        //  }
        //};

        // cv.setOnClickListener(listener);

        if (cv != null){
            TextView textView = cv.findViewById(R.id.cat__name);
            ImageView imageView = cv.findViewById(R.id.cat__img);

            textView.setText(mv[position]);
            imageView.setImageResource(mv_photo[position]);
        }
    }
    @Override
    public int getItemCount() {
        return mv.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        CardView cv = null;
        public MyViewHolder(@NonNull CardView cardView) {
            super(cardView);
            cv = cardView;
        }
        public CardView getCv(){
            return cv;
        }
    }
}
