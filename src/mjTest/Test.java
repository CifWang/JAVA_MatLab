package mjTest;

import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWException;
import com.mathworks.toolbox.javabuilder.MWNumericArray;

import java.lang.Integer;

import mySum.mySumtestMatlab;

public class Test {
	public static void main(String[] args) throws MWException{
		MWNumericArray a=null;
		MWNumericArray b=null;
		
		a=new MWNumericArray(Double.valueOf(1),MWClassID.DOUBLE);
		b=new MWNumericArray(Double.valueOf(2),MWClassID.DOUBLE);
		
		MWNumericArray[] in={a,b};
		
		mySumtestMatlab myadd=new mySumtestMatlab();
		Object[] result=myadd.mySum(1, in);
		System.out.println(result[0]);
		//Object[] result=myadd.mySum(1,a,b);
		
		/**
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
		*/
	}

}