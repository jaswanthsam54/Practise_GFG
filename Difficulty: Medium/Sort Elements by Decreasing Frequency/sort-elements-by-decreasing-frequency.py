from collections import Counter

class Solution:
    # Function to sort the array according to frequency of elements.
    def sortByFreq(self, arr):
        # Step 1: Count the frequency of each element
        freq_map = Counter(arr)
        
        # Step 2: Sort the array based on:
        # 1. Decreasing frequency (-freq_map[x])
        # 2. Increasing value (x) as a tie-breaker
        arr.sort(key=lambda x: (-freq_map[x], x))
        
        return arr