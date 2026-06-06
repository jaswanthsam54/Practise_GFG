class Solution:
    def checkStatus(self, a: int, b: int, flag: bool) -> bool:
        # Condition 1: Either a or b (not both) is non-negative, and flag is False
        if ((a >= 0 and b < 0) or (a < 0 and b >= 0)) and not flag:
            return True
        
        # Condition 2: Both a and b are negative, and flag is True
        if (a < 0 and b < 0) and flag:
            return True
            
        return False