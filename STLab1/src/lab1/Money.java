package lab1;

public class Money {
	//�ж��Ƿ����Ҫ��ķ���
	public static String doYouHaveMoney (int target){
		//��ʼ����Ӧ��Ʊ��Ӳ�ҵĸ���
		int fifty = 1;
		int twenty = 1;
		int five = 2;
		int one = 3;
		//���ݳ�Ʊ���������ж�Ŀ��Ǯ�������޴�������
		for(int i = 0 ; i < 7 ; i++){
			//���Ŀ��Ǯ������0��˵������Ҫ��
			if(target == 0)
				return "Yes";
			//����Ʊ������Ϊ0��Ŀ��Ǯ�����ڵ��ڳ�Ʊ��ֵʱ���м���
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
			//û�����ôﵽĿ��Ǯ����˵��������Ҫ��
			else if(target > 0)
				return "No";
			else
			{}
		}
		//ʹ�������г�Ʊ���ж�Ŀ��Ǯ���Ƿ�Ϊ0���Ӷ������Ƿ�����Ҫ��
	    if(target == 0)
	    	return "Yes";
	    else
	    	return "No";
	}
}
