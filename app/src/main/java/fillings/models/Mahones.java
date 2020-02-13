package fillings.models;

import com.dezzapps.collapasingtoolbar.R;

import fillings.Cheese;
import fillings.Filling;

public class Mahones extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Mahones";
    }

    @Override
    public int getImage() {
        return R.drawable.mahones;
    }

    @Override
    public int getKCal() {
        return 150;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 2.0f;
    }
}
