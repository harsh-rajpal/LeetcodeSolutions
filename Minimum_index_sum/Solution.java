package Minimum_index_sum;
// Given two arrays of strings list1 and list2,find the common strings with the least index sum.

// A common string is a string that appeared in both list1 and list2.

// A common string with the least index sum is a common string such that if it appeared at list1[i]and list2[j]then i+j should be the minimum value among all the other common strings.

// Return all the common strings with the least index sum.Return the answer in any order.

// Example 1:

// Input:list1=["Shogun","Tapioca Express","Burger King","KFC"],list2=["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]Output:["Shogun"]Explanation:The only common string is"Shogun".Example 2:

// Input:list1=["Shogun","Tapioca Express","Burger King","KFC"],list2=["KFC","Shogun","Burger King"]Output:["Shogun"]Explanation:The common string with the least index sum is"Shogun"with index sum=(0+1)=1. Example 3:

// Input:list1=["happy","sad","good"],list2=["sad","happy","good"]Output:["sad","happy"]Explanation:There are three common strings:"happy"with index sum=(0+1)=1."sad"with index sum=(1+0)=1."good"with index sum=(2+2)=4. The strings with the least index sum are"sad"and"happy".

// Constraints:

// 1<=list1.length,list2.length<=1000 1<=list1[i].length,list2[i].length<=30 list1[i]and list2[i]consist of spaces' 'and English letters.All the strings of list1 are unique.All the strings of list2 are unique.

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (i + j < min) {
                        res.clear();
                        res.add(list1[i]);
                        min = i + j;
                    } else if (i + j == min) {
                        res.add(list1[i]);
                    }
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
    
}

//Algorithm:

// 1. Create a list to store the result.
// 2. Create a variable to store the minimum index sum.
// 3. Traverse the list1 and list2.
// 4. If the element of list1 is equal to the element of list2, then check if the index sum is less than the minimum index sum.
// 5. If the index sum is less than the minimum index sum, then clear the list and add the element to the list.
// 6. If the index sum is equal to the minimum index sum, then add the element to the list.
// 7. Return the list as an array.

//Time Complexity: O(n^2) where n is the length of the list1 and list2.
//Space Complexity: O(n) where n is the length of the list1 and list2.
