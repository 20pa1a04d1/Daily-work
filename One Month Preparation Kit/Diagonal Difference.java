int size=arr.get(0).size();
    int sum1=0;
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            if(i==j)
          {
              sum1=sum1+arr.get(i).get(j);
          }
        }
        
       }   
       int i=0;
       int j=size-1;
       int sum2=0;
        while (i<size&&j>-1)
        {
            
            sum2=sum2+arr.get(i).get(j);
            i=i+1;
            j=j-1;
        } 
        int ans=Math.abs(sum1-sum2);
        return ans;
