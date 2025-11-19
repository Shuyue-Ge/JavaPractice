/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter7lab;




import java.util.Arrays;

public class ArrayGuide {
    public static void main(String[] args) {
        // fixed-size int array of length 5, defaults to 0s
        int[] scores = new int[5];

        // literal initialization
        String[] names = {"Ada", "Grace", "Linus", "Ken", "Guido"};

        // set & read
        scores[0] = 95;
        scores[1] = 88;
        System.out.println("Length: " + scores.length);
        System.out.println("First name: " + names[0]);
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Names: " + Arrays.toString(names));
        
        // classic for: use indexes
for (int i = 0; i < names.length; i++) {
    System.out.println("names[" + i + "] = " + names[i]);
}

// enhanced for: read-only traversal
for (int s : scores) {
    System.out.println("score = " + s);
}

int[] data = {7, 12, -3, 8, 0, 5};

int sum = 0;
int min = data[0];
int max = data[0];
for (int x : data) {
    sum += x;
    if (x < min) min = x;
    if (x > max) max = x;
}
double avg = (double) sum / data.length;

System.out.println("Data: " + Arrays.toString(data));
System.out.println("Sum=" + sum + ", Avg=" + avg + ", Min=" + min + ", Max=" + max);


int target = 8;
int foundIndex = -1;
for (int i = 0; i < data.length; i++) {
    if (data[i] == target) {
        foundIndex = i;
        break;
    }
}
System.out.println("Target " + target + " found at: " + foundIndex);


// reverse data in-place
for (int left = 0, right = data.length - 1; left < right; left++, right--) {
    int tmp = data[left];
    data[left] = data[right];
    data[right] = tmp;
}
System.out.println("Reversed: " + Arrays.toString(data));

int[] sorted = Arrays.copyOf(data, data.length);
Arrays.sort(sorted);
System.out.println("Sorted:   " + Arrays.toString(sorted));
System.out.println("Original: " + Arrays.toString(data)); // unchanged

    }
}

 
