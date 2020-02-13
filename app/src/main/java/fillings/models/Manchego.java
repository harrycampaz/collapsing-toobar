package fillings.models;

import com.dezzapps.collapasingtoolbar.R;

import fillings.Cheese;
import fillings.Filling;

public class Manchego extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Manchego";
    }

    @Override
    public int getImage() {
        return R.drawable.manchego;
    }

    @Override
    public int getKCal() {
        return 130;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.2f;
    }
}
