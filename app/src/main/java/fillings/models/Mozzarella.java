package fillings.models;

import com.dezzapps.collapasingtoolbar.R;

import fillings.Cheese;
import fillings.Filling;

public class Mozzarella extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Mozzarella";
    }

    @Override
    public int getImage() {
        return R.drawable.mozzarella;
    }

    @Override
    public int getKCal() {
        return 200;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.8f;
    }
}
