package com.example.customviewjavademo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by PC on 29/03/2018.
 */

public class CodekulView extends android.support.v7.widget.AppCompatEditText {
    private Paint paint;
    public CodekulView(Context context){
        super(context);
        initPaint();
    }
    /**public CodekulView(Context context){
        //crete view using code
        initPaint();
    }**/
    public CodekulView(Context context, AttributeSet set){
        super(context,set);
        //creat view using xml
        initPaint();
    }
    private void initPaint(){
        paint=new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //canvas.drawCircle(20,20,30,paint);
        for (int i=1;i<100; i++){
            canvas.drawLine(10,10,1000,10,paint);
        }
    }
    public void Draw(Canvas canvas){
        super.draw(canvas);
        //super.Draw(canvas);
    }
}
