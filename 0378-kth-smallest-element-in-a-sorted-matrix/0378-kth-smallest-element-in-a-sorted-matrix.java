class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i = 0; i< matrix.length; i++){
            for(int j =0; j < matrix[i].length; j++){
                pq.add(matrix[i][j]);
            }
        }
        
        while(k-1 > 0){
            pq.remove();
            k--;
        }
        
        return pq.peek();
    }
}