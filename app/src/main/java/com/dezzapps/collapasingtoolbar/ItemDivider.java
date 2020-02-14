package com.dezzapps.collapasingtoolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemDivider extends RecyclerView.ItemDecoration {

    private static final int[] ATTRS =new int[] {android.R.attr.listDivider} ;
    private Drawable divider;

    public ItemDivider(Context context) {

        final TypedArray styledAtt = context.obtainStyledAttributes(ATTRS);

        this.divider = styledAtt.getDrawable(0);
        styledAtt.recycle();
    }

    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent) {
        super.onDraw(c, parent);
    }
}
