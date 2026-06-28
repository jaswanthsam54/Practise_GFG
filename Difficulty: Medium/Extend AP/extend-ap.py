def extendAP(arr):
    # If the array has fewer than 2 elements, we cannot find a unique common difference.
    if len(arr) < 2:
        return arr
    
    # Calculate the common difference
    d = arr[1] - arr[0]
    
    # Get the last element of the current AP
    last_element = arr[-1]
    
    # Generate the next three terms
    next_three = [last_element + d, last_element + 2 * d, last_element + 3 * d]
    
    # Convert next_three to a tuple so it can concatenate with arr
    return arr + tuple(next_three)