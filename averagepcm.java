// Program to calculate Sam's average marks in PCM
class AveragePCM {
    public static void main(String[] args) {

        // Creating variables
        String name = "Sam";
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        // Calculating average
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3.0;

        // Display result
        System.out.println(name + "'s average mark in PCM is " + averageMarks);
    }
}