class Solution {
    public int[] merge(int a[],int b[]){
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        int ans[] = new int[n + m];
        int k = 0;
        while(i < n && j < m){
            if(a[i] < b[j]){
                ans[k] = a[i];
                i++;
            }
            else{
                ans[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < n){
            ans[k] = a[i];
            i++;
            k++;
        }

        while(j < m){
            ans[k] = b[j];
            j++;
            k++;
        }

        return ans;
    }
    public int[] sortArrayUtil(int nums[],int i,int j){
        if(i == j) return new int[]{nums[i]};
        int mid = (j + i) / 2;
        int arr1[] = sortArrayUtil(nums,i,mid);
        int arr2[] = sortArrayUtil(nums,mid+1,j);
        return merge(arr1,arr2);
    }
    public int[] sortArray(int[] nums) {
        return sortArrayUtil(nums,0,nums.length - 1);
    }
}