package lab1;

public class Money {
	//判断是否符合要求的方法
	public static String doYouHaveMoney (int target){
		//初始化对应钞票或硬币的个数
		int fifty = 1;
		int twenty = 1;
		int five = 2;
		int one = 3;
		//根据钞票张数，进行对目标钱数的有限次数减法
		for(int i = 0 ; i < 7 ; i++){
			//如果目标钱数减至0，说明满足要求
			if(target == 0)
				return "Yes";
			//当钞票张数不为0且目标钱数大于等于钞票面值时进行减法
			else if(fifty > 0 && target >= 50){
				fifty--;
				target -= 50;
				continue;
			}
			else if(twenty > 0 && target >= 20){
				twenty--;
				target -= 20;
				continue;
			}
			else if(five > 0 && target >= 5){
				five--;
				target -= 5;
				continue;
			}
			else if(one > 0 && target >= 1){
				one--;
				target -= 1;
				continue;
			}
			//没有正好达到目标钱数，说明不满足要求
			else if(target > 0)
				return "No";
			else
			{}
		}
		//使用完所有钞票，判断目标钱数是否为0，从而决定是否满足要求
	    if(target == 0)
	    	return "Yes";
	    else
	    	return "No";
	}
}
