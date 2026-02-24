class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int sorted[] = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(a[i] <= b[j]){
                sorted[k] = a[i];
                i++;
            }
            else{
                sorted[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < n){
            sorted[k] = a[i];
            i++;
            k++;
        }
    
        while(j < m){
            sorted[k] = b[j];
            j++;
            k++;
        }
        if((n + m) % 2 == 0){
            int val1 = sorted[(n+m) / 2];
            int val2 =  sorted[((n+m) / 2) - 1];
            return (val1 + val2) / 2.0;
        }
        else{
            return (double)sorted[(n+m) / 2];
        }
       
    }
}