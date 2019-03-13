package lab1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testMoney {
	//参数和期望值expected
	private int a;
	private String expected;

	
	public testMoney(int a , String expected){
		this.a = a;
		this.expected = expected;
	}
	//测试用例数据
	@Parameters
    public static Collection<Object[]> getData(){
    return Arrays.asList(new Object[][]{
    {-1,"No"},	
    {0,"Yes"},
    {1,"Yes"},
    {4,"No"},
    {8,"Yes"},
    {9,"No"},
    {13,"Yes"},
    {18,"No"},
    {54,"No"},
    {79,"No"},
    {83,"Yes"},
    {84,"No"}
    });
    }

	@Test
	public void test() {
		assertEquals(this.expected,Money.doYouHaveMoney(a));
	}

}
