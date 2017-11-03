public class Main {
    public static void main (String [] args) {

        Figure [] list = {
                new Circle (15.0),
                new Triangle (7.0, 3.0),
                new Square (5.0, 4.0) };


        for (Figure f: list) {
            StringBuilder sb = new StringBuilder ()
                    .append(f.getName())
                    .append(" : ")
                    .append(f.getSq());

            System.out.println (sb.toString());
        }

    }

}