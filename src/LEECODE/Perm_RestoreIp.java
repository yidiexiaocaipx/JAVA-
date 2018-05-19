package LEECODE;

import java.util.ArrayList;

public class Perm_RestoreIp {


public static ArrayList<String> restoreIpAddresses(String s) {
	ArrayList<String> res = new ArrayList<>();
	ArrayList<String> ip = new ArrayList<>(); //����м���
	dfs(s, res, ip, 0);
	return res;
}
private static void dfs(String s, ArrayList<String> res, ArrayList<String> ip, int start){
	//��������
	if(ip.size() == 4 && start == s.length()){//�ҵ�һ���Ϸ���
		res.add(ip.get(0) + '.' + ip.get(1) + '.' + ip.get(2) + '.' + ip.get(3));
		return;
	}
	//ʣ���ַ�������
	if(s.length() - start > 3 * (4 - ip.size())) //��֦
		return;
	if(s.length() - start < (4 - ip.size())) //��֦
		return;
	int num = 0;
	for(int i = start; i < start + 3 && i < s.length(); i++){
		num = num * 10 + (s.charAt(i) - '0');
		System.out.println(i+" "+num);
		if(num < 0 || num > 255)//  ���Ϸ� ��֦
			continue;
		//�Ϸ�
		ip.add(s.substring(start, i + 1));
		for(int j=0;j<ip.size();j++)
		   System.out.print(ip.get(j)+" ");
		System.out.println();
		dfs(s, res, ip, i + 1);
		ip.remove(ip.size() - 1);  //���ص�ǰ�ڵ�
		if(num == 0)//������ǰ׺0
			break;
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="25525511135";
       ArrayList<String> arr=restoreIpAddresses(s);
//       for(int i=0;i<arr.size();i++) {
//    	   System.out.println(arr.get(i));
//       }
	}

}
