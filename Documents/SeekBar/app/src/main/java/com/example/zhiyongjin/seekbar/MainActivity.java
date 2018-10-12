package com.example.zhiyongjin.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        seekBar = findViewById(R.id.sb);
//        最大进度值
        seekBar.setMax(100);
//        当前进度值
        seekBar.setProgress(30);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
//            参数:
//            1. 当前绑定的seekBar对象
//            2. 当前进度数值
//            3. 是否为用户手动触发
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

//                进度发生变化时触发
                Log.i("progress", seekBar.getProgress()+"");



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

//                开始拖拽进度条是触发
//                打印当前进度
                Log.i("progress, 开始", seekBar.getProgress() + "");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

//                结束拖拽进度条时触发
                Log.i("progress, 结束", seekBar.getProgress() + "");
            }
        });


    }
}
