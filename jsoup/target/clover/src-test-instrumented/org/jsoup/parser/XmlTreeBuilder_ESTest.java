/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 29 03:57:34 GMT 2018
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.CData token_CData0 = new Token.CData("");
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_CData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("value", "[%s^=%s]");
      Token.Comment token_Comment0 = new Token.Comment();
      xmlTreeBuilder0.insert(token_Comment0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Parser parser0 = new Parser(xmlTreeBuilder0);
      xmlTreeBuilder0.parseFragment("", "?", parser0);
      Tokeniser tokeniser0 = xmlTreeBuilder0.tokeniser;
      Token.Character token_Character0 = tokeniser0.charPending;
      xmlTreeBuilder0.insert(token_Character0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      StringReader stringReader0 = new StringReader("w\u0002cq{:l B@X");
      Parser parser0 = new Parser(xmlTreeBuilder0);
      xmlTreeBuilder0.initialiseParse(stringReader0, "w\u0002cq{:l B@X", parser0);
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Parser parser0 = new Parser(xmlTreeBuilder0);
      xmlTreeBuilder0.parseFragment("", "?", parser0);
      Token.Doctype token_Doctype0 = new Token.Doctype();
      boolean boolean0 = xmlTreeBuilder0.process(token_Doctype0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Parser parser0 = new Parser(xmlTreeBuilder0);
      xmlTreeBuilder0.parseFragment("", "?", parser0);
      Token.Doctype token_Doctype0 = new Token.Doctype();
      xmlTreeBuilder0.insert(token_Doctype0);
      assertEquals("", token_Doctype0.getSystemIdentifier());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("w\u0002cq{:l B@X", "w\u0002cq{:l B@X");
      Token.Comment token_Comment0 = new Token.Comment();
      boolean boolean0 = xmlTreeBuilder0.process(token_Comment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse("", "");
      assertEquals("", document0.location());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      StringReader stringReader0 = new StringReader("#)6'QSA");
      xmlTreeBuilder0.parse(stringReader0, "L #<ch)NwHlJ");
      Document document0 = xmlTreeBuilder0.parse(stringReader0, "#)6'QSA");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
      assertNotNull(parseSettings0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_StartTag0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      CharacterReader characterReader0 = new CharacterReader("");
      ParseErrorList parseErrorList0 = new ParseErrorList(245, 245);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.Character token_Character0 = tokeniser0.charPending;
      Token.TokenType token_TokenType0 = Token.TokenType.Doctype;
      token_Character0.type = token_TokenType0;
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_Character0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$Character cannot be cast to org.jsoup.parser.Token$Doctype
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Tag tag0 = Tag.valueOf("gEju23H");
      CDataNode cDataNode0 = new CDataNode("");
      Attributes attributes0 = cDataNode0.attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "gEju23H", attributes0);
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parseFragment("C>", pseudoTextElement0, "", (Parser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Parser parser0 = Parser.htmlParser();
      Document document0 = parser0.parseInput("1q5", "O%9'Ar.:|[");
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parseFragment("1q5", document0, (String) null, parser0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BaseURI must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parseFragment("sR", "B ?'UL96@U", (Parser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Parser parser0 = Parser.htmlParser();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parseFragment("org.jsoup.parser.XmlTreeBuilder$1", (String) null, parser0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BaseURI must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parse((String) null, "#data");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parse("org.jsoup.parser.XmlTreeBuilder$1", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BaseURI must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      StringReader stringReader0 = new StringReader("w\u0002cq{:l B@X");
      stringReader0.close();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parse(stringReader0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Stream closed
         //
         verifyException("org.jsoup.parser.CharacterReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parse(pipedReader0, "G68K[}qMR(nfU&tF(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert((Token.StartTag) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.XmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_StartTag0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      StringReader stringReader0 = new StringReader("T/)+sD3L~bHd\"");
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.initialiseParse(stringReader0, "T/)+sD3L~bHd\"", (Parser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      Parser parser0 = Parser.htmlParser();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.initialiseParse(pipedReader0, "", parser0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("w\u0002cq{:l B@X", "w\u0002cq{:l B@X");
      xmlTreeBuilder0.processStartTag("#6'QSA");
      boolean boolean0 = xmlTreeBuilder0.processEndTag("#6'QSA");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("w\u0002cq{:l B@X", "w\u0002cq{:l B@X");
      boolean boolean0 = xmlTreeBuilder0.processEndTag("#6'QSA");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      Token.Comment token_Comment0 = tokeniser0.commentPending;
      token_Comment0.bogus = true;
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_Comment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("^xjVV`DfdfLndl0Tk", "^xjVV`DfdfLndl0Tk");
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.selfClosing = true;
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("org.jsoup.nodes.Entities$CoreCharset", attributes0);
      Element element0 = xmlTreeBuilder0.insert(token_StartTag1);
      assertEquals(0, element0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("^xjVV`DfdfLndl0Tk", "^xjVV`DfdfLndl0Tk");
      boolean boolean0 = xmlTreeBuilder0.processStartTag("^xjVV`DfdfLndl0Tk");
      assertTrue(boolean0);
      
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("org.jsoup.nodes.Entities$CoreCharset", attributes0);
      Element element0 = xmlTreeBuilder0.insert(token_StartTag1);
      assertEquals(0, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.Doctype token_Doctype0 = new Token.Doctype();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_Doctype0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.XmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert((Token.Doctype) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.XmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse("w\u0002cq{:l B@X", "w\u0002cq{:l B@X");
      Parser parser0 = xmlTreeBuilder0.parser;
      xmlTreeBuilder0.parseFragment("w\u0002cq{:l B@X", document0, "w\u0002cq{:l B@X", parser0);
  }
}