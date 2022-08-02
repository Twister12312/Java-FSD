package DSA;

class LIS_generator{
public int LIS(int []nums) {
	int [] tail=new int[nums.length]; 
    int len=1;
    tail[0]=nums[0];
    
    for(int i=1;i<nums.length;i++){
        if(nums[i]>tail[len-1]){
            tail[len]=nums[i];
            len++;
        }
        else{
            int c= ceil(tail,0,len-1,nums[i]);
            tail[c]= nums[i];
        }
        
    }
    return len;
}

private int ceil(int [] tail, int l, int r, int x){
    while(r>l){
        int m= l+ (r-l)/2;
        if(tail[m]>=x) r=m;
        else l=m+1;
    }
    return r; 
}
	
}


public class Longest_Increasing_Subsequence {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LIS_generator gen= new LIS_generator();
		int[] arr= {0,8,4,12,2,10,6,14,1,9,5,
			     13,3,11,7,15};
		int len= gen.LIS(arr);
		System.out.println("The LIS of the given array is: "+ len);

	}

}
