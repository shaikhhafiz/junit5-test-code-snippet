package com.hafiz.test.unit;

import com.hafiz.utility.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsUnitTest {

  @Test
  public void Reverse_Of_Empty_String_Return_Empty_String(){
    String input = "";
    String actual = StringUtils.reverseStr(input);
    String expected = "";
    Assertions.assertEquals(expected, actual, "Empty String return empty string successful");
  }

  @Test
  public void Reverse_Of_Null_String_Return_Null_String(){
    String input = null;
    String actual = StringUtils.reverseStr(input);
    String expected = null;
    Assertions.assertEquals(expected, actual, "Null String return null string successful");
  }

  @Test
  public void Reverse_Of_a_String_Return_a_String() {
    String input = "a";
    String actual = StringUtils.reverseStr(input);
    String expected = "a";
    Assertions.assertEquals(expected, actual, "String of a return string a");
  }

  @Test
  public void Reverse_Of_ab_String_Return_ab_String() {
    String input = "ab";
    String actual = StringUtils.reverseStr(input);
    String expected = "ba";
    Assertions.assertEquals(expected, actual, "String of a return string a");
  }

  @Test
  public void Reverse_Of_asd_String_Return_dsa_String() {
    String input = "asd";
    String actual = StringUtils.reverseStr(input);
    String expected = "dsa";
    Assertions.assertEquals(expected, actual, "String of asd return string dsa");
  }

}
