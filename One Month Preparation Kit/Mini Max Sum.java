public static void miniMaxSum(List<Integer> arr) {
    
       int n=arr.size();
       long maxsum=0;
       long minsum=0;
       Collections.sort(arr);
       for(int i=0;i<n-1;i++){
       minsum=minsum+arr.get(i);
       }
       for(int j=1;j<n;j++){
         maxsum=maxsum+arr.get(j);
           
       }
       System.out.println(minsum+" "+maxsum);
       
       
    }

}
