class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        // int sorted[] = new int[n + m];

        // int i = 0;
        // int j = 0;
        // int k = 0;
        // while(i < n && j < m){
        //     if(a[i] <= b[j]){
        //         sorted[k] = a[i];
        //         i++;
        //     }
        //     else{
        //         sorted[k] = b[j];
        //         j++;
        //     }
        //     k++;
        // }

        // while(i < n){
        //     sorted[k] = a[i];
        //     i++;
        //     k++;
        // }
    
        // while(j < m){
        //     sorted[k] = b[j];
        //     j++;
        //     k++;
        // }
        // if((n + m) % 2 == 0){
        //     int val1 = sorted[(n+m) / 2];
        //     int val2 =  sorted[((n+m) / 2) - 1];
        //     return (val1 + val2) / 2.0;
        // }
        // else{
        //     return (double)sorted[(n+m) / 2];
        // }

        // solution 2 -> better
        if(m + n == 1) return  m == 0 ? a[0] : b[0]; 
        int i = 0;
        int j = 0;
        int k = 0;
        int val1 = 0;
        int val2 = 0;
        int val = 0;
        while(j < m && i < n){
            if(a[i] < b[j]){
                val = a[i];
                i++;
            }
            else{
                val = b[j];
                j++;
            }

            k++;

            if(k == (n + m + 1) / 2){
                val1 = val;
                break;
            }
            
        }
        while(k < (n + m + 1) / 2 && j < m){
            val = b[j];
            k++;
            j++;
            if(k == (n + m + 1) / 2){
                val1 = val;
                break;
            }
           
        }

        while(k < (n + m + 1) / 2 && i < n){
            val = a[i];
            k++;
            i++;
            if(k == (n + m + 1) / 2){
                val1 = val;
                break;
            }
        }
        if((n+m) % 2 == 0){
            val2 = (j == m) ? a[i] : (i == n) ? b[j] : Math.min(a[i],b[j]);
        }
        System.out.println(val1 + " " + val2);
        return (n + m) % 2 == 0 ? (double)(val1 + val2) / 2 : val1;
       
    }
}