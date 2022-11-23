package listeners;

import org.testng.ITestResult;

import frameWork.BasePageFrameWork;

public class Listeners extends BasePageFrameWork {

  public void onTestStart(ITestResult result) {
    try {
      System.out.println("Listener:New test is started");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void onTestSuccess(ITestResult result) {
    try {
      System.out.println("Listener:Test Success");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void onTestFailure(ITestResult result) {
    try {
      System.out.println("Listener:  Test Failure");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void onTestSkipped(ITestResult result) {
    try {
      System.out.println("Listener:  Test Skipped");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
