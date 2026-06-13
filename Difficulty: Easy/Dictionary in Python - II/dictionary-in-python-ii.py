def pair_sum(arr, sum):
    # Create an empty set to store numbers we have seen so far
    seen = set()
    
    for num in arr:
        # Calculate the required complement to reach the target sum
        complement = sum - num
        
        # If the complement is already in the set, we found a pair
        if complement in seen:
            return True
        
        # Otherwise, add the current number to the set
        seen.add(num)
        
    # If we loop through the entire array and find no such pair
    return False