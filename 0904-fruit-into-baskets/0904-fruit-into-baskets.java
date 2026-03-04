class Solution {
    public int totalFruit(int[] fruits) {
        // int i = 0;
        // int j = 0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int max = 0;
        // while(i < fruits.length && j < fruits.length){
        //     map.put(fruits[j],map.getOrDefault(fruits[j],0) + 1);

        //     while(map.size() > 2){
        //         int val = map.get(fruits[i]);

        //         if(val == 1){
        //             map.remove(fruits[i]);
        //         }else{
        //             map.put(fruits[i],val-1);
        //         }
        //         i++;
        //     }

        //     max = Math.max(max,j - i + 1);
        //     j++;
        // }

        // return max;

        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        HashMap <Integer,Integer> s = new HashMap<>();
        while(j < fruits.length){
           s.put(fruits[j],s.getOrDefault(fruits[j],0) + 1);
           if(s.size() > 2){
                while(s.size() != 2){
                    s.put(fruits[i],s.get(fruits[i]) - 1);

                    if(s.get(fruits[i]) == 0) s.remove(fruits[i]);
                    i++;
                }
           }
            max = Math.max(max,j - i + 1);
           j++;
        }

        return max;
    }
}