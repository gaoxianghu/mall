package com.macro.mall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeetCodeTest {

    @Test
    public void test(){
        System.out.println("test ----");

    }

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
//        return null;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int i=0;
        for (int j=1;j<nums.length;j++) {
            if (nums[j] == nums[i]) {
                continue;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                result++;
            }
        }
        return result;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public void deleteNode(ListNode node) {

    }

    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
}
