package com.example.dell.demolinearlayoutmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMusic;
    private MusicApdapter mMusicAdapter;
    private List<Music> mmusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMusic = (RecyclerView) findViewById(R.id.recyclerview);

        mmusic = new ArrayList<>();
        mmusic = new ArrayList<>();
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mmusic.add(new Music("Bài hát : Khi người mình yêu khóc", "Ca sĩ : Phan Mạnh Quỳnh","Khi người mình yêu khóc, nắng khắp lối như mây găng kín lòng"));
        mmusic.add(new Music("Bài hát : Lỗi ở Yêu thương", "Ca sĩ : Thanh Duy","Tình yêu trước mắt mà cách xa ngàn phút giây"));
        mMusicAdapter = new MusicApdapter(this, mmusic);
        rvMusic.setAdapter(mMusicAdapter);

        //cuộn theo chiều ngang

       //LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
       //rvMusic.setLayoutManager(linearLayoutManager1);

        //cuộn theo chiều dọc

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvMusic.setLayoutManager(linearLayoutManager2);

        // cuộn theo dạng sole theo chiều dọc

        //StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        //rvMusic.setLayoutManager(staggeredGridLayoutManager);

        // cuộn theo dạng sole theo chiều ngang

        //StaggeredGridLayoutManager staggeredGridLayoutManager2 = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.HORIZONTAL);
        //rvMusic.setLayoutManager(staggeredGridLayoutManager2);

        // cuộn theo dạng lưới chiều ngang

        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this,10,GridLayoutManager.HORIZONTAL,false);
        //rvMusic.setLayoutManager(gridLayoutManager);

        // cuộn theo dạng lướt chiều dọc
        //GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this,3,GridLayoutManager.VERTICAL,false);
        //rvMusic.setLayoutManager(gridLayoutManager2);
}
}

