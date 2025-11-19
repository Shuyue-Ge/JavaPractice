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


public class PartC {


// Unique Elements: Remove duplicates, keep first occurrences
public static int[] uniqueElements(int[] nums) {
LinkedHashSet<Integer> set = new LinkedHashSet<>();
for (int num : nums) {
set.add(num);
}
int[] result = new int[set.size()];
int i = 0;
for (int num : set) {
result[i++] = num;
}
return result;
}


// Top-K Elements using linear passes (no sorting)
public static int[] topKElements(int[] nums, int k) {
int[] result = new int[k];
boolean[] selected = new boolean[nums.length];


for (int i = 0; i < k; i++) {
int max = Integer.MIN_VALUE;
int maxIndex = -1;
for (int j = 0; j < nums.length; j++) {
if (!selected[j] && nums[j] > max) {
max = nums[j];
maxIndex = j;
}
}
result[i] = max;
selected[maxIndex] = true;
}
return result;
}


// Two-sum for sorted array (two-pointer approach)
public static int[] twoSumSorted(int[] nums, int target) {
int left = 0, right = nums.length - 1;
while (left < right) {
int sum = nums[left] + nums[right];
if (sum == target) {
return new int[]{left, right};
} else if (sum < target) {
left++;
} else {
right--;
}
}
return new int[]{-1, -1}; // not found
}


// Optional main() for demo testing
public static void main(String[] args) {
int[] nums = {1, 3, 3, 2, 4, 1, 5};
System.out.println("Unique: " + Arrays.toString(uniqueElements(nums)));


System.out.println("Top 3: " + Arrays.toString(topKElements(nums, 3)));


int[] sorted = {1, 2, 3, 4, 6, 8};
int target = 10;
System.out.println("Two Sum Indices: " + Arrays.toString(twoSumSorted(sorted, target)));
}
}