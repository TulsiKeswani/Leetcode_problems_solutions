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

            String str = i % 3 == 0 ? "Fizz" : "";
            str += (i % 5 == 0 ? "Buzz" : "");

            ans.add(str.equals("") ? str + i : str);
        }

        return  ans;
    }
}