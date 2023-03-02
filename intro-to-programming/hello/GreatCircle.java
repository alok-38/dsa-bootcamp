/* *****************************************************************************
 *  Name:    Alokananda Y
 *
 *  Description:  Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2, and y2—the latitude and longitude (in degrees) of two points on the surface of the earth—and prints the great-circle distance (in kilometers) between them. Use the Haversine formula
 *
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double r = 6371.0;
        double x1 = Math.toRadians(a);
        double y1 = Math.toRadians(b);
        double x2 = Math.toRadians(c);
        double y2 = Math.toRadians(d);

        double distance = 2 * r * Math.asin(Math.sqrt(
                Math.pow(Math.sin((x2 - x1) / 2), 2) + Math.cos(x1) * Math.cos(x2) * Math
                        .pow(Math.sin((y2 - y1) / 2), 2)));

        System.out.println(distance + " kilometers");
    }
}