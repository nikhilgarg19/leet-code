class Solution:
    def minLength(self, s: str) -> int:
        for i in range(len(s)-1):
            if s[i:i+2] == "AB" or s[i:i+2] == "CD":  
                s = s[:i] + s[i+2:]
                return self.minLength(s)
        return len(s)