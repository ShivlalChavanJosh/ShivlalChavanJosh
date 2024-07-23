class MapSorting {
    public static void main(String[] args) {

       HashMap<String,Integer> unSortedMap = new HashMap<>();
       unSortedMap.put("apple",10); 
       unSortedMap.put("banana",20);  
       unSortedMap.put("chikoo",14); 
       unSortedMap.put("kiwi",24); 
       unSortedMap.put("guava",40); 
       unSortedMap.put("pears",55); 

       System.out.println("unSortedMap: "+unSortedMap);

       Map<String,Integer> sortedMap = sortMapByValue(unSortedMap);  

      System.out.println("SortedMap: "+sortedMap);  
    }

  
    public static Map<String,Integer> sortMapByValue(Map<String,Integer> unSortedMap){
  
     List<Map.Entry<String,Integer>> mapList = new ArrayList<>(unSortedMap.entrySet());

      for(int i=0;i<mapList.size();i++){
          for(int j=0;j<mapList.size() - i - 1;j++){
              if (mapList.get(j).getValue() > mapList.get(j + 1).getValue()) {
                    // Swap entries
                    Map.Entry<String, Integer> temp = mapList.get(j);
                    mapList.set(j, mapList.get(j + 1));
                    mapList.set(j + 1, temp);
                }
          }
      }  
      

      Map<String,Integer> sortedMap = new LinkedHashMap<>();
      for(Map.Entry<String, Integer>  map : mapList){
          sortedMap.put(map.getKey(), map.getValue());
      }     
     
     return sortedMap;   
    }
  
}
