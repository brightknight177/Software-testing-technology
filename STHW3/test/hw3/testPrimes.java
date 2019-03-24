package hw3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testPrimes {
	//参数和期望值expected
	private int n;
	private String expected;
	public PrintPrimes prime = new PrintPrimes();
	public testPrimes(int n , String expected){
		this.n = n;
		this.expected = expected;  
	}
	//测试用例数据
	@Parameters
    public static Collection<Object[]> getData(){
    return Arrays.asList(new Object[][]{
    {5,"Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\nPrime: 11\r\n"}
    });
    }
 
	@Test
	public void test() {
		assertEquals(this.expected,prime.printPrimes(n));
	}

}