import java.util.*;
public class Practice {
    public static Set<TreeSet<String>> groups = new HashSet<>();
    public static boolean validate(HashMap<String,TreeSet<String>> map){

        ArrayList<String> visited = new ArrayList<>();
        for (Map.Entry<String,TreeSet<String>> element : map.entrySet()) {
            TreeSet<String> set = new TreeSet<>();
            set=map.get(element.getKey());
            set.add(element.getKey());
            if(!groups.contains(set)) {
                groups.add(set);
            }
            visited.add(element.getKey());
            for(String key:set){
                if(!visited.contains(key)){
                    if(map.containsKey(key)){
                        TreeSet<String> set1 = map.get(key);
                        set1.add(key);
                        visited.add(key);
                        if(!set.equals(set1)){
                            return false;
                        }
                    }
                }
            }

        }
        return true;

    }
    public static void main(String[] args){
        HashMap<String,TreeSet<String>> map = new HashMap<>();
        map.put("A",new TreeSet<>(Arrays.asList("B","C")));
        map.put("B",new TreeSet<>(Arrays.asList("A","C")));
        map.put("C",new TreeSet<>(Arrays.asList("A","B")));
        map.put("D",new TreeSet<>(Arrays.asList("E")));
        map.put("E",new TreeSet<>(Arrays.asList("D")));
        int sum=0;
        System.out.println(map);
        System.out.println(validate(map));
        System.out.println("Groups:"+groups);

    }
}
