class solution{
    public int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] <= target){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public int[] answerQueries(int[] nums, int[] queries){
        int[] answer = new int[queries.length];
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        for(int i = 0; i < queries.length; i++){
            int index = binarySearch(prefixSum, queries[i]);
            if(index == -1){
                answer[i] = 0;
            }else{
                answer[i] = index + 1;
            }
        }
        return answer;
    }
}