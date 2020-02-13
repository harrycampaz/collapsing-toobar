package fillings.models;

import com.dezzapps.collapasingtoolbar.R;

import fillings.Cheese;
import fillings.Filling;

public class Brie extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Brir";
    }

    @Override
    public int getImage() {
        return R.drawable.brie;
    }

    @Override
    public int getKCal() {
        return 120;
    }

    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public float getPrice() {
        return 0.3f;
    }
}
