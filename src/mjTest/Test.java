package mjTest;

import com.mathworks.toolbox.javabuilder.MWException;
import java.lang.Integer;

import mySum.mySumtestMatlab;

public class Test {
	public static void main(String[] args) throws MWException{
		//String a="a";
		//String b="b";
		//int a=1;
		Integer a=new Integer(1);
		Integer b=new Integer(2);
		//String[] in={"a","b"};
		Integer[] in={a,b};
		mySumtestMatlab m=new mySumtestMatlab();
		//object[] result_wrong=m.mySum(1,1,2);
		Object[] result=m.mySum(1,in);
		System.out.println(result[0]);
	}

}