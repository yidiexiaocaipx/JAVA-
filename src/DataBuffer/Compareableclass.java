package DataBuffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Compareableclass {

	public static void main(String[] args) {
		ConsumInfo consumInfo1 = new ConsumInfo(100, "consumInfo1", 400.0,new Date());
        ConsumInfo consumInfo2 = new ConsumInfo(200, "consumInfo1", 200.0,new Date());
        ConsumInfo consumInfo3 = new ConsumInfo(300, "consumInfo1", 100.0,new Date());
        ConsumInfo consumInfo4 = new ConsumInfo(400, "consumInfo1", 700.0,new Date());
        ConsumInfo consumInfo5 = new ConsumInfo(500, "consumInfo1", 800.0,new Date());
        ConsumInfo consumInfo6 = new ConsumInfo(600, "consumInfo1", 300.0,new Date());
        ConsumInfo consumInfo7 = new ConsumInfo(700, "consumInfo1", 900.0,new Date());
        ConsumInfo consumInfo8 = new ConsumInfo(800, "consumInfo1", 400.0,new Date());
        
        List<ConsumInfo> list = new ArrayList<ConsumInfo>();
        list.add(consumInfo1);
        list.add(consumInfo2);
        list.add(consumInfo3);
        list.add(consumInfo4);
        list.add(consumInfo5);
        list.add(consumInfo6);
        list.add(consumInfo7);
        list.add(consumInfo8);
        System.out.println("≈≈–Ú«∞£∫");
        //≈≈–Ú«∞
        for(ConsumInfo consumInfo : list ){
            System.out.println(consumInfo);
        }
        
        Collections.sort(list);//≈≈–Ú
        System.out.println("≈≈–Ú∫Û£∫");
        //≈≈–Ú∫Û
        for(ConsumInfo consumInfo :list){
            System.out.println(consumInfo);
        }
		
		
	}

}
