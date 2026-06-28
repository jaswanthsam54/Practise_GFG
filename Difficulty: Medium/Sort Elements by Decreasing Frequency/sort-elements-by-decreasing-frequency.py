from collections import Counter

class Solution:
    # Function to sort the array according to frequency of elements.
    def sortByFreq(self, arr):
        # Step 1: Count the frequency of each element
        freq_map = Counter(arr)
        
        # Step 2: Sort based on decreasing frequency, then increasing value
        arr.sort(key=lambda x: (-freq_map[x], x))
        
        return arr