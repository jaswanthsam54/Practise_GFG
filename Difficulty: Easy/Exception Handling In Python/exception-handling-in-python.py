def find_minimum(a, b):
    # Initialize a list with the results of safe operations
    results = [a + b, a - b, a * b]
    
    # Use exception handling for floor division
    try:
        results.append(a // b)
    except ZeroDivisionError:
        # If division by zero occurs, we simply pass and exclude it
        pass
        
    # Return the minimum value from the valid operations
    return min(results)