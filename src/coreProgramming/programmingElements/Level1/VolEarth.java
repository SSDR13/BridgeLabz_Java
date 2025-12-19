package coreProgramming.programmingElements.Level1;//7.	To compute the volume of Earth in km^3 and miles^3

import java.lang.*;

public class VolEarth{
    public static void main(String[] args) {
        int radiusInKms =  6378;
        double radiusInMiles = radiusInKms * 0.621371;

        double volumeInKms = (4/3.0) * Math.PI * Math.pow(radiusInKms,3);
        double volumeInMiles = (4/3.0) * Math.PI * Math.pow(radiusInMiles,3);

        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f", volumeInKms, volumeInMiles);
    }
}
