package DataBuffer;

import java.util.Date;
/**
 * ��ΪҪʵ�ֶ�ConsumInfo���������������ConsunInfo����Ҫʵ��Comparable�ӿڣ�Ҳ����Ҫʵ��compareTo()����
 * ����ıȽϲ��գ����ΰ���price��uid���е�������
 * @author breeze
 *
 */
public class ConsumInfo implements Comparable<ConsumInfo> {
    private int uid;
    private String name;
    private double price;
    private Date datetime;
    
    public ConsumInfo() {
        // TODO Auto-generated constructor stub
    }
    
    public ConsumInfo(int uid,String name,double price,Date datetime){
        this.uid = uid;
        this.name = name;
        this.price = price;
        this.datetime = datetime;
                
    }
    
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    

    @Override
    public String toString() {
        return "ConsumInfo [uid=" + uid + ", name=" + name + ", price=" + price
                + ", datetime=" + datetime + "]";
    }
    /**
     * ����Ƚϵ���ʲô, Collections.sort����ʵ�ֵľ��ǰ��մ˱ȽϵĶ�������
     * ˳�򣨴�С���󣩣�
     * if(price < o.price){
            return -1;
        }
        if(price > o.price){
            return 1;
        }
     * ���򣨴Ӵ�С����
     * if(price < o.price){
            return 1;
        }
        if(price > o.price){
            return -1;
        }
     * 
     */
    @Override
    public int compareTo(ConsumInfo o) {
        //���ȱȽ�price�����price��ͬ����Ƚ�uid
        if(price < o.price){
            return -1;
        }
        if(price > o.price){
            return 1;
        }
        
        if(price == o.price){
            if(uid < o.uid){
                return -1;
            }
            if(uid > o.uid){
                return 1;
            }
        }
        return 0;
    }
    
    
}