class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            // String str = "";

            // if(i % 3 == 0){
            //     str += "Fizz";
            // }
            // if(i % 5 == 0){
            //     str += "Buzz";
            // }
            // if(i % 3 != 0 && i % 5 != 0){
            //     str+=i;
            // }
            // ans.add(str);

            StringBuilder sb = new StringBuilder(i % 3 == 0 ? "Fizz" : "");
            sb.append(i % 5 == 0 ? "Buzz" : "");

            ans.add((sb.length() == 0 ? sb.append(i) : sb).toString());
        }

        return  ans;
    }
}