package one_bitandtwo_bitCharacters;

class Demo {
    public static boolean isOneBitCharacter(int[] bits) {
//    	boolean temp = true;
    	int b1= 0;
    	int i=0;
    	while(i<bits.length-1)
    	{
    		if (bits[i]==b1)  		
    			i++;
    		else
    			i=i+2;
    	}
    	if (i==bits.length-1)
           return true;
    	else
    		return false;
    }
    public static void main(String[] args) {
          int[] bits={1,0,0};
          boolean temp=isOneBitCharacter(bits);
          System.out.println(temp);
    }
}

