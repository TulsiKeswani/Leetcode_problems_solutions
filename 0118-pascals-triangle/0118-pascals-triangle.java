class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();

        // for(int i = 1; i <= n; i++){
        //     list.add(new ArrayList<>());
        // }

        // list.get(0).add(1);

        // // for(int i =1; i < n; i++){
        // //     for(int j = 0; j <= i; j++){
        // //         int val1 = j == i ? 0 : list.get(i-1).get(j);
        // //         int val2 = j == 0 ? 0 : list.get(i-1).get(j-1);
        // //         list.get(i).add(val1+val2);
        // //     }
        // // }

        // for(int i = 1; i < n; i++){
        //     List<Integer> l = list.get(i-1);

        //     for(int j = 0; j <= l.size(); j++){
        //         int val1 = j == 0 ? 0 : l.get(j-1);
        //         int val2 = j == l.size() ? 0 : l.get(j);
        //         list.get(i).add(val1 + val2);
        //     }
        // }

        // return list;
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            int val = 1;
            list.get(i).add(val);
            for(int j = 1; j <= i; j++){
                val = val * (i - j + 1) / j;
                list.get(i).add(val);
                
            }
        }

        return list;
    }
}