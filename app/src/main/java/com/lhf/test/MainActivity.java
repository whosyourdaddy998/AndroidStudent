package com.lhf.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerClickListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private GridView grid_photo;
    private BaseAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        mContext = MainActivity.this;
//        grid_photo = (GridView) findViewById(R.id.grid_photo);


        // 网络图片
        List images = new ArrayList();
        images.add("http://kwimg2.kuwo.cn/star/upload/66/85/1575256374021_.jpg");
        images.add("http://kwimg2.kuwo.cn/star/upload/71/68/1575818166158_.jpg");
        images.add("http://kwimg1.kuwo.cn/star/upload/68/54/1575429173078_.jpg");
        images.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1015613717,2953594052&fm=26&gp=0.jpg");
//        images.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1741431004,2509692489&fm=26&gp=0.jpg");
//        images.add("http://kwimg2.kuwo.cn/star/upload/66/85/1575256374021_.jpg");
//        images.add("http://kwimg2.kuwo.cn/star/upload/71/68/1575818166158_.jpg");
//        images.add("http://kwimg1.kuwo.cn/star/upload/68/54/1575429173078_.jpg");
//        images.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1015613717,2953594052&fm=26&gp=0.jpg");
//        images.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1741431004,2509692489&fm=26&gp=0.jpg");


        ImageView imageView_0 = (ImageView)findViewById(R.id.image_0);
        ImageView imageView_1 = (ImageView)findViewById(R.id.image_1);
        Glide.with(this).load(images.get(0)).into(imageView_0);
        Glide.with(this).load(images.get(1)).into(imageView_1);



        ImageView imageView_2 = (ImageView)findViewById(R.id.image_2);
        File file_1 = new File("/storage/self/primary/Pictures","image_1.jpg");
        Glide.with(this).load(file_1).into(imageView_2);



//        for (int i = 0 ; i < images.size() ; i++){
//            String url = "R.id.image_"+i;
//            Glide.with(this).load(images.get(i)).into(url);
//        }

//        Banner banner = (Banner) findViewById(R.id.banner);
//        //设置图片加载器
//        banner.setImageLoader(new GlideImageLoader());
//        //设置图片集合
//        banner.setImages(images);
//        banner.start();
//        banner.setDelayTime(300);
//
//        //增加点击事件
//        banner.setOnBannerClickListener(new OnBannerClickListener() {
//            @Override
//            public void OnBannerClick(int position) {
//                Toast.makeText(MainActivity.this, "position" + position, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}

