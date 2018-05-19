package Thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test5 {

private static int maxMoney = 0;//�����ֵ
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = Integer.valueOf(sc.nextLine());
String next = sc.nextLine();
String next2 = sc.nextLine();
String[] range = next.split(" ");
String[] money = next2.split(" ");
int[] rangeInt = new int[range.length];// ����
int[] moneyInt = new int[money.length];// Ǯ
for (int i = 0; i < rangeInt.length; i++) {
rangeInt[i] = Integer.valueOf(range[i]);
}
for (int i = 0; i < money.length; i++) {
moneyInt[i] = Integer.valueOf(money[i]);
}
Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
ArrayList<Integer> list = new ArrayList<>();// �������λ��
dfs(rangeInt, moneyInt, 0, total, 0, 0, map, list);
ArrayList<Integer> arrayList = map.get(maxMoney);
for (int i = 0; i < arrayList.size() - 1; i++) {
  System.out.print(arrayList.get(i) + 1 + " ");
}
  System.out.print(arrayList.get(arrayList.size() - 1) + 1);
}
public static void dfs(int[] rangeInt, int[] moneyInt, int index,
int total, int thisTotal, int money,
Map<Integer, ArrayList<Integer>> map, ArrayList<Integer> list) {
if (index >= rangeInt.length || thisTotal + rangeInt[index] > total) {
maxMoney = Math.max(money, maxMoney);
if (!map.containsKey(money))
map.put(money, new ArrayList<>(list));
return;
}
for (int i = index; i < moneyInt.length; i++) {
if (thisTotal + rangeInt[i] > total)
return;
money = money + moneyInt[i];
thisTotal = thisTotal + rangeInt[i];
list.add(i);
dfs(rangeInt, moneyInt, i + 1, total, thisTotal, money, map, list);
money = money - moneyInt[i];
thisTotal = thisTotal - rangeInt[i];
list.remove(list.size() - 1);
}
}

}
