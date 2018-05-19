package LEECODE;

import java.util.ArrayList;
import java.util.Arrays;

public class DP_subsets1 {

	public static ArrayList<ArrayList<Integer>> subSets(int[] num){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		Arrays.sort(num);
		if(num==null || num.length==0) {
			return res;
		}
		dfs(res,list,0,num);
		return res;
	}
	public static void dfs(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list,int start,int[] num) {
		
		for(int i=start;i<num.length;i++) {
		//	if(i>start && num[i]==num[i-1])
		//		continue;
			list.add(num[i]);
			dfs(res,list,i+1,num);
			list.remove(list.size()-1);
		}
		res.add(new ArrayList<>(list));
//		 for(int j=0;j<list.size();j++) {
//    		 if(j!=list.size()-1)
//    		 System.out.print(list.get(j)+",");
//    		 else
//    			 System.out.print(list.get(j)+"]");
//    	 }
//		 System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a= {1,2,3,3};
         ArrayList<ArrayList<Integer>> arr=subSets(a);
         for(int i=0;i<arr.size();i++) {
        	 System.out.print("[");
        	 for(int j=0;j<arr.get(i).size();j++) {
        		 if(j!=arr.get(i).size()-1)
        		 System.out.print(arr.get(i).get(j)+",");
        		 else
        			 System.out.print(arr.get(i).get(j)+"]");
        	 }
        	 System.out.println();
         }
	}

}
