public class Square extends Figure {
    protected double hight, wide;


    Square (double h, double w) {
        hight = h;
        wide = w;
    }

    @Override
    public String getName () {
        return super.getName() + "Square";
    }

    @Override
    public final double getSq () {
        return (hight * wide);
    }

}