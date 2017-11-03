public class Triangle extends Figure {
    protected double hight;
    protected double wide;

    Triangle (double h, double w) {
        hight = h;
        wide = w;
    }

    @Override
    public String getName () {
        return super.getName() + "Triangle";
    }

    @Override
    final public double getSq () {
        return (0.5 * hight * wide);
    }

}