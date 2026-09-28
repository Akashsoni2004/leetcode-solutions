class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sort_strs = new String(chars);

            if(!map.containsKey(sort_strs)){
                map.put(sort_strs, new ArrayList<>());
            }

            map.get(sort_strs).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}