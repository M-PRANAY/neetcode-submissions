class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;int r = matrix.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(matrix[mid][0] < target && mid != matrix.length-1 && matrix[mid+1][0] > target){
                int l1 = 0;int r1 = matrix[l1].length-1;
                while(l1<=r1){
                    int mid1 =l1 + (r1-l1)/2;
                    if(matrix[mid][mid1] > target){
                        r1 = mid1-1;
                    } else if(matrix[mid][mid1] < target){
                        l1 = mid1+1;
                    } else {
                        return true;
                    }
                }
                return false;
            } else if(matrix[mid][0] < target && mid == matrix.length-1){
                int l1 = 0;int r1 = matrix[l1].length-1;
                while(l1<=r1){
                    int mid1 =l1 + (r1-l1)/2;
                    if(matrix[mid][mid1] > target){
                        r1 = mid1-1;
                    } else if(matrix[mid][mid1] < target){
                        l1 = mid1+1;
                    } else {
                        return true;
                    }
                }
                return false;
            } else if(matrix[mid][0] > target){
                r = mid-1;
            } else if(matrix[mid][0] < target){
                l = mid+1;
            } else{
                return true;
            }
        }
        return false;
    }
}
