class Solution:
    def reverseRows(self, arr):
        # Slice the array with a step of -1 along the first axis (rows)
        return arr[::-1]