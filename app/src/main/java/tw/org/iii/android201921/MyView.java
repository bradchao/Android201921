package tw.org.iii.android201921;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {
    private Bitmap bitmap;
    private Resources resources;
    private Paint paint;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        resources = context.getResources();
        paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        bitmap = BitmapFactory.decodeResource(resources, R.drawable.brad);
        canvas.drawBitmap(bitmap, 0, 0, null);
        canvas.drawLine(0,0,100,100, paint);


    }
}
