package com.bub.array;

public class DimensionArray_2 {
  public static void main(String[] args) {
    int[][] twoD_Array = {{1, 2, 3}, {4, 58}, {4, 5, 6, 7}, {8, 9}};
    int sum = 0;
    for (int[] row : twoD_Array) {
      for (int element : row) {
        System.out.println(element);
      }
      System.out.println("---------");
    }

    for (int row = 0; row < twoD_Array.length; row++) {
      for (int element = 0; element < twoD_Array[row].length; element++) {
      }
      sum += twoD_Array[row][twoD_Array[row].length - 1];
    }
    System.out.println("Sum of the elements in the last columm  = " + sum);

  }

}
