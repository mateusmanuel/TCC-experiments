/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 28 23:03:09 GMT 2018
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.Company;
import tutorial.CurrentAccount;
import tutorial.Owner;
import tutorial.Person;
import tutorial.SavingsAccount;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BankAccount_ESTest extends BankAccount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Person person0 = new Person("", "");
      SavingsAccount savingsAccount0 = new SavingsAccount(person0);
      savingsAccount0.deposit(1);
      assertEquals(1, savingsAccount0.getBalance());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Person person0 = new Person("tutorial.Owner", "tutorial.Owner");
      CurrentAccount currentAccount0 = new CurrentAccount(person0, (-1269));
      currentAccount0.withdraw(0);
      assertEquals(0, currentAccount0.getBalance());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Company company0 = new Company("");
      SavingsAccount savingsAccount0 = new SavingsAccount(company0);
      boolean boolean0 = savingsAccount0.withdraw(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Company company0 = new Company("");
      CurrentAccount currentAccount0 = new CurrentAccount(company0, 796);
      Owner owner0 = currentAccount0.getOwner();
      assertEquals(0, currentAccount0.getBalance());
      assertNotNull(owner0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Person person0 = new Person((String) null, "tutorial.SavingsAccount");
      CurrentAccount currentAccount0 = new CurrentAccount(person0, 0);
      currentAccount0.deposit(3029);
      int int0 = currentAccount0.getBalance();
      assertEquals(3029, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Company company0 = new Company("");
      SavingsAccount savingsAccount0 = new SavingsAccount(company0);
      savingsAccount0.deposit((-2405));
      int int0 = savingsAccount0.getBalance();
      assertEquals((-2405), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CurrentAccount currentAccount0 = new CurrentAccount((Owner) null, 30);
      int int0 = currentAccount0.getBalance();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CurrentAccount currentAccount0 = new CurrentAccount((Owner) null, 30);
      currentAccount0.getOwner();
      assertEquals(0, currentAccount0.getBalance());
  }
}