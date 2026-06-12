def access_element(arr, index):
    # 'index' is a tuple containing (x, y, z)
    # NumPy allows you to pass the tuple directly into the brackets, 
    # or unpack it using *index inside standard bracket indexing.
    return arr[index]