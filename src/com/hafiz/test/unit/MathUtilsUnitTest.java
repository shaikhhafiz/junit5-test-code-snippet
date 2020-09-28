package com.hafiz.test.unit;

import com.hafiz.utility.MathUtils;
import org.junit.jupiter.api.*;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsUnitTest {

  private static Logger logger;
  private MathUtils mathUtils;

  @BeforeAll
  public void setUp(){
    logger = LoggerFactory.getLogger(MathUtilsUnitTest.class);
    this.mathUtils = new MathUtils();
    logger.info( () -> "Logger and target class instantiation completed");
  }

  @BeforeEach
  public void init() {
    logger.info( () -> "Do something which is need before each test call");
  }

  @Test
  public void Add_Zero_plus_Zero_Returns_Zero(){
    int actual = mathUtils.add(0,0);
    int expected = 0;
    //Probably lambda function instead of using string is invoked lazily when error occured
    Assertions.assertEquals(expected, actual, () -> "Add of zero plus zero return zero");
  }

  @Test
  public void Add_Zero_plus_One_Returns_One(){
    int actual = mathUtils.add(0,1);
    int expected = 1;
    Assertions.assertEquals(expected, actual, "Add of zero plus one return one");
  }

  @Test
  public void Divide_One_By_Zero_Returns_Arithmetic_Exception(){
    int a = 1, b = 0;
    /*If Assumptions false then test code should not run.
    Basically some logic placed here on what things we don't have control
     */
    Assumptions.assumeTrue(b == 0);
    Assertions.assertThrows(ArithmeticException.class,
        () -> mathUtils.divide(a, b),
        "One devided by zero should throws exception");
  }

}
