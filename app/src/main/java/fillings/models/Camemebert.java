package fillings.models;

import com.dezzapps.collapasingtoolbar.R;

import fillings.Cheese;
import fillings.Filling;

public class Camemebert extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Camemebert";
    }

    @Override
    public int getImage() {
        return R.drawable.camembert;
    }

    @Override
    public int getKCal() {
        return 10;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.4f;
    }
}
