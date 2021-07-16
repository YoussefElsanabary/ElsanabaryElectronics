package com.example.elsanabaryelectronics;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elsanabaryelectronics.R;

public class BlRecyclerAdapter extends RecyclerView.Adapter {

        String[] blinder = null;
        int[] blinder_photo = null;
public BlRecyclerAdapter(String[] tv, int[] tv_photo) {
        this.blinder = tv;
        this.blinder_photo = tv_photo;
        }

@NonNull
@Override
public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CardView cv = (CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_layout,viewGroup,false );
        return new MyViewHolder(cv);

        }

@Override
public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
final CardView cv =((MyViewHolder) viewHolder).getCv();

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

        textView.setText(blinder[position]);
        imageView.setImageResource(blinder_photo[position]);
        }
        }
@Override
public int getItemCount() {
        return blinder.length;
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



