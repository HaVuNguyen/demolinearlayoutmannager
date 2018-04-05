package com.example.dell.demolinearlayoutmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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
        mmusic.add(new Music("Bài hát : Người ấy", "Ca sĩ : Trịnh Thăng Bình","Hôm qua anh thấy ôi người ấy , đang trong tay với cô nào đấy"));
        mmusic.add(new Music("Bài hát : Tâm sự tuổi 30", "Ca sĩ : Trịnh Thăng Bình","Từng ngày mệt nhoài, muộn phiền trôi qua Giật mình nhìn lại thấy anh đã già "));
        mmusic.add(new Music("Bài hát : Đừng ai nhắc về anh ấy", "Ca sĩ : Trà Mi Idol","Ngày xưa anh nhớ không anh? Anh hứa là:Ngày thành đôi sẽ không xa đâu em àh "));
        mmusic.add(new Music("Bài hát : Cùng anh", "Ca sĩ : Ngọc Dolil","Cùng anh băng qua bao đại dương, cùng anh ...."));
        mmusic.add(new Music("Bài hát : Buông", "Ca sĩ : Bùi Anh Tuấn","Và dù lòng biết như thết là khờ dại,..."));
        mmusic.add(new Music("Bài hát : Nơi tình yêu bắt đầu", "Ca sĩ : Bùi Anh Tuấn","Ta quên nhau đã bao lâu rồi hỡi ..."));
        mmusic.add(new Music("Bài hát : Ánh nắng của anh", "Ca sĩ : Đức Phúc","Sẽ luôn thật gần bên em, sẽ luôn là vòng tay ấm êm...."));
        mmusic.add(new Music("Bài hát : Người ta nói", "Ca sĩ : Ưng Hoàng Phúc","Người ta cứ nói, đừng quá yêu ,...."));
        mmusic.add(new Music("Bài hát : Let her go", "Ca sĩ : Passenger","Well you only need the light when it's burning low Only miss the sun when it starts to snow "));
        mmusic.add(new Music("Bài hát : I DO", "Ca sĩ : 911","My whole world changed from the moment I met you And it would never be the same Felt like I knew that I’d always love you From the moment I heard your name "));
        mmusic.add(new Music("Bài hát : Payphone", "Ca sĩ : Maroon 5","I'm in the phone booth trying to call home All the money I used to call you All the moments are far away, baby All wrong, where are my plans for where to go?"));
        mmusic.add(new Music("Bài hát : What do you mean ?", "Ca sĩ : Justin Bieber","What do you mean? When you nod your head yes But you wanna say no What do you mean? ..... "));
        mmusic.add(new Music("Bài hát : Why not me ? ", "Ca sĩ : Enrique Iglesias","Escaping nights without you with shadows on the wall My mind is running wild tryin hard not to fall ..."));
        mmusic.add(new Music("Bài hát : Faded", "Ca sĩ : Alan Walker","You were the shadow to my light Did You Feel Us Another start you fade away Afraid our aim is out of sight ..."));
        mmusic.add(new Music("Bài hát : Do not let me down", "Ca sĩ : The Chainsmokers , Daya","I need you, I need you , I need you right now Yeah, I need you right now so do not let me, do not let me, do not let me down ..."));
        mmusic.add(new Music("Bài hát : Shape of you", "Ca sĩ : Ed Sheeran","The club is not the best place to find a lover So the bar is where I go Me and my friends at the table doing shots ..."));
        mmusic.add(new Music("Bài hát : We don't talk anymore", "Ca sĩ :  Charlie Puth , Selena Gomez","We do not talk anymore We do not talk anymore We do not talk anymore Like we used to ..."));
        mmusic.add(new Music("Bài hát : Despacito (Remix) ", "Ca sĩ : Luis Fonsi , Daddy Yankee , Justin Bieber","Come and move that in my direction So thankful for that, it's such a blessin', yeah Turn every situation into Heaven, yeah ..."));
        mmusic.add(new Music("Bài hát : Until you", "Ca sĩ : Shayne Ward","Baby life was good to me But you just made it better I love the way you stand by me throught any kind of weather ..."));
        mmusic.add(new Music("Bài hát : My love", "Ca sĩ : Westlife","And all my love, I'm holding on forever Reaching for the love That Seems so far ..."));
        mMusicAdapter = new MusicApdapter(this, mmusic);
        rvMusic.setAdapter(mMusicAdapter);

        //etgiatri = (EditText) findViewById(R.id.ketqua);
        int[] idButton = {R.id.lh, R.id.lv, R.id.sh, R.id.sv, R.id.gh, R.id.gv};
        for (int id:idButton){
            View v = (View)findViewById(id);
            v.setOnClickListener(this);
        }

}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lh :
                LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
                rvMusic.setLayoutManager(linearLayoutManager1);
                break;

            case R.id.lv :
                LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
                rvMusic.setLayoutManager(linearLayoutManager2);
                break;

            case R.id.sh :
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.HORIZONTAL);
                rvMusic.setLayoutManager(staggeredGridLayoutManager2);
                break;

            case R.id.sv :
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
                rvMusic.setLayoutManager(staggeredGridLayoutManager);
                break;

            case R.id.gh:
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this,10,GridLayoutManager.HORIZONTAL,false);
                rvMusic.setLayoutManager(gridLayoutManager);
                break;

            case R.id.gv:
                GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this,3,GridLayoutManager.VERTICAL,false);
                rvMusic.setLayoutManager(gridLayoutManager2);
                break;
        }

    }
}

