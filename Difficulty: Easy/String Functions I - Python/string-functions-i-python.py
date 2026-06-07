def trim(str):
    # Removes any leading and trailing whitespaces from the string
    return str.strip()

def exists(str, x):
    # Returns the lowest index of substring x if it exists, otherwise returns -1
    return str.find(x)

def titleIt(str):
    # Converts the first character of each word to uppercase
    return str.title()

def casesSwap(str):
    # Swaps uppercase characters to lowercase and vice versa
    return str.swapcase()