package com.example.dell.demolinearlayoutmanager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MusicApdapter extends RecyclerView.Adapter<MusicApdapter.MusicViewHolder> {
    private static final String TAG = "MusicAdapter";
    private List<Music> mmusic;
    private Context mcontext;
    private LayoutInflater mlayoutInflater;


    public MusicApdapter(Context context, List<Music> datas){
        mcontext = context;
        mmusic = datas;
        mlayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public  MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = mlayoutInflater.inflate(R.layout.music_list_row, parent,false);
        return  new MusicViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position){
        Music music = mmusic.get(position);
        holder.tenBaiHat.setText(music.getTenBaiHat());
        holder.tenCaSi.setText(music.getTenCaSi());
        holder.loiBaiHat.setText(music.getLoiBaiHat());
    }
    @Override
    public int getItemCount(){
        return mmusic.size();
    }
    class MusicViewHolder extends RecyclerView.ViewHolder{
        private TextView tenBaiHat;
        private TextView tenCaSi;
        private TextView loiBaiHat;

        public MusicViewHolder(View itemView){
            super(itemView);
            tenBaiHat = (TextView) itemView.findViewById(R.id.tenBaiHat);
            tenCaSi = (TextView) itemView.findViewById(R.id.tenCaSi);
            loiBaiHat = (TextView) itemView.findViewById(R.id.loiBaiHat);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Music music = mmusic.get(getAdapterPosition());
                    Toast.makeText(mcontext, music.getTenBaiHat(),Toast.LENGTH_LONG).show();
                }
            });
        }

    }

}
