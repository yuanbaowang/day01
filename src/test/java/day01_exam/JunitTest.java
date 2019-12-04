/**
 * 
 */
package day01_exam;

import org.junit.Assert;
import org.junit.Test;



/**
 * @author 袁保旺
 *
 * 2019年12月2日 下午2:08:10 
 */
public class JunitTest {
	/**
	 * A加注释
	 * B加注释
	 */
	@Test
	public void day01() {

		//B修改一行

		//A修改一行

	}
	/**
	 * one分支修改test
	 */
	@Test
	public void day02() {
		//A工程师进行修改 一行
		//设置断言
		Assert.assertFalse(1==2);
		//B工程师进行修改一行
	}

}
