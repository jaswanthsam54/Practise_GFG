# Function to create dictionary
# arr is list of tuple. tuple contain name and marks.
def create_dict(arr):
    dict = {}
    
    # Your code here
    # Loop through the list of tuples
    for name, marks in arr:
        dict[name] = marks  # Assign the key (name) and value (marks)
        
    return dict