// Program to convert kilometers to miles
class KmToMiles {
    public static void main(String[] args) {

        // Creating variables
        double distanceKm = 10.8;
        double kmToMilesFactor = 1.6;

        // Calculating miles
        double distanceMiles = distanceKm / kmToMilesFactor;

        // Display result
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}