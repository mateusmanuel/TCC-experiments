/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 29 03:56:17 GMT 2018
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseSettings_ESTest extends ParseSettings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      String string0 = parseSettings0.normalizeTag("gchnyV=,7_^8");
      assertEquals("gchnyv=,7_^8", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = parseSettings0.htmlDefault.normalizeAttributes(attributes0);
      assertSame(attributes0, attributes1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("limitedQuirks", "", attributes0);
      attributes0.put(attribute0);
      Attributes attributes1 = parseSettings0.normalizeAttributes(attributes0);
      assertSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      String string0 = parseSettings0.preserveCase.normalizeAttribute("gchnyV=,7_^8");
      assertEquals("gchnyV=,7_^8", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      // Undeclared exception!
      try { 
        parseSettings0.normalizeTag((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.ParseSettings", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      // Undeclared exception!
      try { 
        parseSettings0.normalizeAttribute((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.ParseSettings", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Attributes attributes0 = parseSettings0.preserveCase.normalizeAttributes((Attributes) null);
      assertNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      String string0 = parseSettings0.preserveCase.normalizeAttribute("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      String string0 = parseSettings0.preserveCase.normalizeTag("");
      assertEquals("", string0);
  }
}