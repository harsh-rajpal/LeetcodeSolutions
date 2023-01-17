
class Solution {
    public int[] constructRectangle(int area) {
        
        int[] result = new int[2];
        int sqrt = (int)Math.sqrt(area);
        for(int i = sqrt; i >= 1; i--){
            if(area % i == 0){
                result[0] = area / i;
                result[1] = i;
                break;
            }
        }
        return result;

    }
}

//Algorithm

//Find the square root of the area. This is the maximum possible length of the rectangle.

//Iterate from the square root to 1. For each iteration, check if the area is divisible by the current number. If it is, then the current number is the width of the rectangle and the area divided by the current number is the length of the rectangle. Return the length and width.

//Complexity Analysis