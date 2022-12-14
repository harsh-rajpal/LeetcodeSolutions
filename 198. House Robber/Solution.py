class Solution:
    def rob(self, nums: List[int]) -> int:
        sec = pre = 0
        for n in nums:
            sec, pre = pre, max(n+sec, pre)
        return pre
