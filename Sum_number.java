package myfirst;
import java.util.Random;
public class Sum_number {

	public static void main(String[] args) {
		int nFaceValue;
		int nCount =0;
		int nSum=0;
		Random generator =new Random();
		while(nSum<100) {
			nFaceValue=generator.nextInt(6)+1;
			nSum+=nFaceValue;
			nCount++;}
		System.out.println(nCount);
	}//main()

}//Sum_number class
