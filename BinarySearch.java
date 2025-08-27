class BinarySearch{
	static int biSearch(int arr[],int n,int key){
		int lb=0;
		int ub=n-1;
		int mid=(lb+ub)/2;
		//while(lb<=ub){
			if(arr[mid]==key){
			return mid;
			}else if(key<arr[mid]){
				//ub=mid-1;
				lb=0;
				ub=mid;
				return biSearch(arr,mid+1,key);
			}else{
				//lb=mid+1;
				lb=mid;
				ub=n-1;
				return biSearch(arr,n,key);
			}
		//}
		//return mid;	
	}
	public static void main(String[] args){
		int arr[]={3,5,6,7,9,10,12,13};
		System.out.println(biSearch(arr,8,12));
	}
}