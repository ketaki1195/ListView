package com.example.customview11;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.Gravity;

/**
 * Created by ketaki on 2/6/17.
 */

class Ourview extends AppCompatEditText {
    private Paint paint;

    public Ourview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
        // xml
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.RED);
        canvas.drawCircle(100, 100, 60, paint);
        paint.setColor(Color.BLACK);
        canvas.drawLine(100, 100, 300, 300, paint);

        paint.setColor(Color.RED);
        canvas.drawCircle(500, 500, 60, paint);
        paint.setColor(Color.BLACK);
        canvas.drawLine(500, 500, 800, 800, paint);
    }

    private void initPaint() {
        paint = new Paint();
        paint.setStrokeWidth(3.5f);
        paint.setColor(Color.RED);

        setGravity(Gravity.LEFT | Gravity.BOTTOM);
    }
}
