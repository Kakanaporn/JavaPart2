package com.bub.string;

public class CompareString {
  public static void main(String[] args) {
    String check = "String";
    String myString = " FirstString";
    String compareString_1 = " You and Me";
    String compareString_2 = " you and me";
    // CompareString
    if (compareString_1.equals(compareString_1))
      System.out.println("Equal");
    else
      System.out.println("Not Equal");
    if (compareString_1.equals(compareString_2))
      System.out.println("Equal");
    else
      System.out.println("Not Equal");
    // finding a word is contain
    if (myString.contains(check))
      System.out.println("True");
    else
      System.out.println("False");
    // word length
    System.out.println("Word 1 length : " + compareString_1.length());
    System.out.println("Word 2 length : " + compareString_2.length());
    //
    String word = "Java is fun!";
    // System.out.println(word.substring(0, 4));
    System.out.println(word.substring(4));
    //
    String mySpaceWord = " space shuttle ";
    System.out.println(mySpaceWord + " length: " + mySpaceWord.length());
    String trimWord = mySpaceWord.trim();
    System.out.println(trimWord + " length: " + trimWord.length());
    //
    System.out.println(trimWord.toUpperCase());
    //
    System.out.println(mySpaceWord.replaceAll("\\s", "").toUpperCase());
  }
}
