package com.utunan;

import org.junit.Test;

import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 链表节点
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    /**
     * 1 . 两数之和
     *
     * @param nums   : 整数数组
     * @param target : 目标值
     * @return
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};

    }

    /**
     * 2. 两数相加
     *
     * @param l1 : 非空的链表1
     * @param l2 : 非空的链表2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode l1Copy = l1, l2Copy = l2, resultCopy = result;
        int carry = 0;

        while (l1Copy != null || l2Copy != null) {
            int a = l1Copy == null ? 0 : l1Copy.val;
            int b = l2Copy == null ? 0 : l2Copy.val;

            int add = a + b + carry;
            if (add / 10 == 1) {
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode temp = new ListNode(add % 10);
            resultCopy.next = temp;
            resultCopy = resultCopy.next;
            if (l1Copy != null) {
                l1Copy = l1Copy.next;
            }
            if (l2Copy != null) {
                l2Copy = l2Copy.next;
            }
        }
        if (carry > 0) {
            resultCopy.next = new ListNode(carry);
        }
        return result.next;

    }

    /**
     * 3. 无重复字符的最长子串
     *
     * @param s :待操作字符串
     * @return :返回最长长度
     */
    public int lengthOfLongestSubstring(String s) {

        int start=0;
        int end=0;

        char []chars=s.toCharArray();

        int length=chars.length;
        int maxLength=0;

        Map<Character, Integer> map = new HashMap<>();

        for(;end<length;end++){
            if(map.containsKey(chars[end])){
                start=Math.max(map.get(chars[end]),start);
            }
            maxLength=Math.max(maxLength,end-start+1);
            map.put(s.charAt(end),end+1);
        }

        return maxLength;
    }

    /**
     * 4. 寻找两个有序数组的中位数
     *
     * @param nums1 : 有序数组1
     * @param nums2 : 有序数组2
     * @return : 中位数
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //没看懂
        return 0;
    }


    /**
     * 5. 最长回文子串
     *
     * @param s : 待求字符串
     * @return
     */
    public String longestPalindrome(String s) {
        char [] chars =s.toCharArray();
        int length=chars.length;
        int maxLength=0;


        for(int i=0;i<length;i++){

        }
        return "";
    }


    /**
     * 反转字符串
     * 使用双指针
     *
     * @param s :待反转字符串
     */
    public void reverseString(char[] s) {

        int length = s.length;

        if (length <= 1) {
            return;
        }

        for (int start = 0, end = s.length - 1; start < end; start++, end--) {
            char c = s[end];
            s[end] = s[start];
            s[start] = c;
        }

    }

}
