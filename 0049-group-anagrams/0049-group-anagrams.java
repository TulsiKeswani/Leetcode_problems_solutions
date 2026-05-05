class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans= new ArrayList<>();

        for(int i = 0; i < strs.length; i++){
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else{
                map.put(s,new ArrayList<>());
                map.get(s).add(strs[i]);
            }   
        }

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}