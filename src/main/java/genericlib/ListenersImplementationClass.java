package genericlib;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementationClass implements ITestListener
{
public SeleniumUtility sutil=new SeleniumUtility();

@Override
public void onTestStart(ITestResult result) {
	String MethodName=result.getMethod().getMethodName();
	Reporter.log(MethodName+"execution starts!");
}

@Override
public void onTestSuccess(ITestResult result) {
	String MethodName=result.getMethod().getMethodName();
	Reporter.log(MethodName+"execution Pass!!");
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailure(result);
}

@Override
public void onTestSkipped(ITestResult result) {
	String MethodName=result.getMethod().getMethodName();
	Reporter.log(MethodName+"execution Skip!!");
}

}
