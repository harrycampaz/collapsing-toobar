package fillings.models;

import com.dezzapps.collapasingtoolbar.R;

import fillings.Cheese;
import fillings.Filling;

public class Gorgonzola extends Cheese implements Filling {
    @Override
    public String getName() {
        return "Gorgonzola";
    }

    @Override
    public int getImage() {
        return R.drawable.gorgonzola;
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
        return 2.0f;
    }
}
