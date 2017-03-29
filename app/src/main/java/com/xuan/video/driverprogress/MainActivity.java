package com.xuan.video.driverprogress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import com.xuan.driverprogress.view.DriverProgress;


public class MainActivity extends AppCompatActivity {
    private DriverProgress myView;

    private SeekBar seekbar_progress,seekbar_width,seekbar_radius
            ,seekbar_index,seekbar_num;

    private Button button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myView = (DriverProgress) findViewById(R.id.myview);
        button_start = (Button) findViewById(R.id.button_start);

        seekbar_progress = (SeekBar) findViewById(R.id.seekbar_progress);
        seekbar_width = (SeekBar) findViewById(R.id.seekbar_width);
        seekbar_radius = (SeekBar) findViewById(R.id.seekbar_radius);
        seekbar_index = (SeekBar) findViewById(R.id.seekbar_index);
        seekbar_num = (SeekBar) findViewById(R.id.seekbar_num);


        /**
         * 开始动画
         */
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myView.startAnimation();
            }
        });

        seekbar_progress.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekbar_width.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekbar_radius.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekbar_index.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekbar_num.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    /**
     * seekbar event
     */
    private SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            switch (seekBar.getId()){
                case R.id.seekbar_progress:
                    myView.setProgress(progress);
                    break;
                case R.id.seekbar_width:
                    myView.setPanelWidth(progress);
                    break;
                case R.id.seekbar_radius:
                    myView.setPanelRadius(progress);
                    break;
                case R.id.seekbar_index:
                    myView.setIndicatorRadius(progress);
                    break;
                case R.id.seekbar_num:
                    myView.setPanelDensity(progress);
                    break;
            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
