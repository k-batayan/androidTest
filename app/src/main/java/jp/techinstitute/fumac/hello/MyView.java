package jp.techinstitute.fumac.hello;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by fumiki on 16/04/18.
 */
public class MyView extends View{
    int mX = 100;
    int mY = 100;
    int mVX = 2;
    int mVY = 2;

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.argb(255,80,116,62));
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawCircle(mX,mY,100,paint);
        if (mX > this.getWidth()-100){
            mVX = -mVX;
        } else if (mX < 100) {
            mVX = -mVX;
        }
        if (mY > this.getHeight()-100){
            mVY = -mVY;
        } else if (mY < 100) {
            mVY = -mVY;
        }
        mX += mVX;
        mY += mVY;
        invalidate();
    }
}
