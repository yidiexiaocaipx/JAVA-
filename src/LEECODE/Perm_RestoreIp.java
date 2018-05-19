package LEECODE;

import java.util.ArrayList;

public class Perm_RestoreIp {


public static ArrayList<String> restoreIpAddresses(String s) {
	ArrayList<String> res = new ArrayList<>();
	ArrayList<String> ip = new ArrayList<>(); //存放中间结果
	dfs(s, res, ip, 0);
	return res;
}
private static void dfs(String s, ArrayList<String> res, ArrayList<String> ip, int start){
	//收敛条件
	if(ip.size() == 4 && start == s.length()){//找到一个合法解
		res.add(ip.get(0) + '.' + ip.get(1) + '.' + ip.get(2) + '.' + ip.get(3));
		return;
	}
	//剩下字符串长度
	if(s.length() - start > 3 * (4 - ip.size())) //剪枝
		return;
	if(s.length() - start < (4 - ip.size())) //剪枝
		return;
	int num = 0;
	for(int i = start; i < start + 3 && i < s.length(); i++){
		num = num * 10 + (s.charAt(i) - '0');
		System.out.println(i+" "+num);
		if(num < 0 || num > 255)//  不合法 剪枝
			continue;
		//合法
		ip.add(s.substring(start, i + 1));
		for(int j=0;j<ip.size();j++)
		   System.out.print(ip.get(j)+" ");
		System.out.println();
		dfs(s, res, ip, i + 1);
		ip.remove(ip.size() - 1);  //返回当前节点
		if(num == 0)//不允许前缀0
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
