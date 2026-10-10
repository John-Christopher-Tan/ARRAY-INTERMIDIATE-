/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.intermidiate;


public class ARRAYINTERMIDIATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 65, 88, 95, 72};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int i = 0; i < scores.length; i++) {

            sum += scores[i];

            if (scores[i] > high) {
                high = scores[i];
            }

            if (scores[i] < low) {
                low = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + high);
        System.out.println("Lowest Score: " + low); 
    }
    
}
