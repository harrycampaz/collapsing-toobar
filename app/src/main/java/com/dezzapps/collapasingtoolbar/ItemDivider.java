package com.dezzapps.collapasingtoolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ItemDivider extends RecyclerView.ItemDecoration {

    private static final int[] ATTRS =new int[] {android.R.attr.listDivider} ;
    private Drawable divider;

    public ItemDivider(Context context) {

        final TypedArray styledAtt = context.obtainStyledAttributes(ATTRS);

        this.divider = styledAtt.getDrawable(0);
        styledAtt.recycle();
    }

    public ItemDivider(Context context, int resourceId){
        divider = ContextCompat.getDrawable(context, resourceId);
    }

    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent) {

        int leftStart = parent.getPaddingLeft();
        int rightEnd = parent.getWidth() - parent.getPaddingRight();

        int count = parent.getChildCount();

        for (int i = 0; i<count; i++){
            View child = parent.getChildAt(i);
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getTop() + params.bottomMargin;
            int bottom = top + divider.getIntrinsicHeight();

            divider.setBounds(leftStart, top, rightEnd, bottom);

            divider.draw(c);
        }

    }
}
