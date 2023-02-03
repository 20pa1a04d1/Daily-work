 public static void plusMinus(List<Integer> arr) {
        double pos=0;
        double neg=0;
        double zero=0;
      int len=arr.size();
      for(int i :arr)
      {
          if(i>0)
          {
              pos=pos+1;
          }
              if(i<0)
              neg=neg+1;
              if(i==0)
              zero=zero+1;
          }
          System.out.println( String.format("%.6f",pos/len));
          System.out.println( String.format("%.6f",neg/len));
          System.out.println( String.format("%.6f",zero/len));
      }

    }
