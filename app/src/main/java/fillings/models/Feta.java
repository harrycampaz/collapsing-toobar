package fillings.models;

import com.dezzapps.collapasingtoolbar.R;

import fillings.Cheese;
import fillings.Filling;

public class Feta extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Feta";
    }

    @Override
    public int getImage() {
        return R.drawable.feta;
    }

    @Override
    public int getKCal() {
        return 110;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 1.1f;
    }
}
