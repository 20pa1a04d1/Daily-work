s=s.replaceAll(" ","");
    s=s.toLowerCase();
     TreeSet<Character> ts=new TreeSet<>();
    for(int i=0;i<s.length();i++)
    {
        ts.add(s.charAt(i));
    }
     if(ts.size()==26)
     
     {
         return "pangram";
     }
      else
      {
          return "not pangram";
      }
