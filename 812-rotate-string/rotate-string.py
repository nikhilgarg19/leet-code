class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if len(s) != len(goal):
            return False
        s1=s+s
        print(s1)
        if goal in s1:
            return True
        return False