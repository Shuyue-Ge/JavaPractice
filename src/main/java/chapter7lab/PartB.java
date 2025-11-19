/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter7lab;

/**
 *
 * @author win
 */



import java.util.*;

public class PartB {

// B1. Even–Odd Split
public static int[] evenOddSplit(int[] nums) {
List<Integer> even = new ArrayList<>();
List<Integer> odd = new ArrayList<>();
for (int num : nums) {
if (num % 2 == 0) even.add(num);
else odd.add(num);
}
even.addAll(odd);
return even.stream().mapToInt(i -> i).toArray();
}


// B2. Frequency Counter
public static void frequencyCounter(int[] nums) {
int[] freq = new int[10];
for (int num : nums) {
if (num >= 0 && num <= 9)
freq[num]++;
}
for (int i = 0; i < freq.length; i++) {
System.out.print(i + ": ");
for (int j = 0; j < freq[i]; j++) System.out.print("*");
System.out.println();
}
}


// B3. Second Largest Number
public static void secondLargest(int[] nums) {
Integer max = null, second = null;
for (int num : nums) {
if (max == null || num > max) {
second = max;
max = num;
} else if (num < max && (second == null || num > second)) {
second = num;
}
}
if (second == null)
System.out.println("No second largest");
else
System.out.println("Second largest: " + second);
}


// B4. Running Average
public static double[] runningAverage(int[] nums) {
double[] result = new double[nums.length];
int sum = 0;
for (int i = 0; i < nums.length; i++) {
sum += nums[i];
result[i] = (double) sum / (i + 1);
}
return result;
}


// B5. Rotate Right by k
public static int[] rotateRight(int[] nums, int k) {
int n = nums.length;
int[] result = new int[n];
for (int i = 0; i < n; i++) {
result[(i + k) % n] = nums[i];
}
return result;
}


// B6. Count Vowels in Strings
public static int[] countVowels(String[] words) {
int[] counts = new int[words.length];
for (int i = 0; i < words.length; i++) {
int count = 0;
for (char c : words[i].toLowerCase().toCharArray()) {
if ("aeiou".indexOf(c) != -1) count++;
}
counts[i] = count;
}
return counts;
}


// B7. Find First Palindrome
public static String findFirstPalindrome(String[] words) {
for (String word : words) {
String rev = new StringBuilder(word).reverse().toString();
if (word.equalsIgnoreCase(rev)) return word;
}
return "NONE";
}


// B8. Merge Two Sorted Arrays
public static int[] mergeSorted(int[] a, int[] b) {
int[] result = new int[a.length + b.length];
int i = 0, j = 0, k = 0;
while (i < a.length && j < b.length) {
if (a[i] < b[j]) result[k++] = a[i++];
else result[k++] = b[j++];
}
while (i < a.length) result[k++] = a[i++];
while (j < b.length) result[k++] = b[j++];
return result;
}
}

