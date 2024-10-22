package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ExampleUnitTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取 ImageView
        ImageView imageView = findViewById(R.id.imageView);
        // 加载图片
        imageView.setImageResource(R.drawable.example_image); // 根据图片名称选择合适的资源
    }
}
