package com.hafiz.utility;

public class StringUtility {

  public static String reverseStr(String input) {
    if(input == null || input.equals("")) return input;
    char[] inputArr = input.toCharArray();
    int len = input.length();

    for(int index = 0; index < len / 2; index++){
      char temp = inputArr[index];
      inputArr[index] = inputArr[len - index - 1];
      inputArr[len - index - 1] = temp;
    }

    return new String(inputArr);
  }

}
