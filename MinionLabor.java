package GoogleFoobar;

import java.util.Arrays;

public class MinionLabor {
	
	public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3 };
        int[] newArr = solution(intArray, 0);
        System.out.println("new array "+Arrays.toString(newArr));
    }
    
    public static int[] solution(int[] data, int n){
        int length = data.length;
       
        if(n==0) 
        	return new int[0];
        
        else if(length<100 && n>0){
            int count, i, j;
            for(i=0;i<length;i++){
                count=1;    
                for(j=i+1;j<length;j++){
                    if(data[i] == data[j]){
                        count++;
                        if(count>n){           	
                        	int key = data[i];
                        	data = Arrays.stream(data)
                            .filter(val -> val != key)
                            .toArray();
                        	length = data.length;
                        	i=i-1;
                            break;
                        }
                    }
                }
            }
            return data;
        }
        else{
            return data;
        }
    }
}
