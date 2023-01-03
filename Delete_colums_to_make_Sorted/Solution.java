package Delete_colums_to_make_Sorted;
public class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0; // number of columns to delete
        for (int i = 0; i < strs[0].length(); i++)// loop through each column
         {
            for (int j = 0; j < strs.length - 1; j++)//// loop through each row
             {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) // compare the current column with the next column
                {
                    count++;// if the current column is not sorted, increment the count
                    break;
                }
            }
        }
        return count;// return the number of columns to delete

    }
    
}
