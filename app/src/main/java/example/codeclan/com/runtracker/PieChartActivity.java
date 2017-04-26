package example.codeclan.com.runtracker;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
    }

//    private void init() {
//        TextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        TextPaint.setColor(TextColor);
//        if (TextHeight == 0) {
//            TextHeight = TextPaint.getTextSize();
//        } else {
//            TextPaint.setTextSize(TextHeight);
//        }
//
//        PiePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        PiePaint.setStyle(Paint.Style.FILL);
//        PiePaint.setTextSize(mTextHeight);
//
//        ShadowPaint = new Paint(0);
//        ShadowPaint.setColor(0xff101010);
//        ShadowPaint.setMaskFilter(new BlurMaskFilter(8, BlurMaskFilter.Blur.NORMAL));
}
