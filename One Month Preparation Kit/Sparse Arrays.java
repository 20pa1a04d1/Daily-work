public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
         ArrayList <Integer>result=new ArrayList<Integer>();
        
           HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<strings.size();i++)
        {
        if(map.containsKey(strings.get(i))) 
            {
                map.put(strings.get(i), map.get(strings.get(i))+1);
            } 
              else 
              {
                map.put(strings.get(i),1);
            }
        } 
        for(int i=0;i<queries.size();i++)
        {
            if(map.containsKey(queries.get(i)))
            {
                result.add(map.get(queries.get(i)));
            }
            else
            {
              result.add(0);   
            }
           }
        return result;

    }
        }
