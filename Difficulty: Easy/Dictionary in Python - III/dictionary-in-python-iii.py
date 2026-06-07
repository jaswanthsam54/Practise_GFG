# insert into dictionary
def insert_dict(query, dict):
    # query[1] is the student name, query[2] is the marks
    dict[query[1]] = int(query[2])

# deleting from dictionary
def del_dict(query, dict):
    # query[1] contains the key to delete
    key = query[1]
    if key in dict:
        del dict[key]
        return True
    return False

# print marks of required name
def print_dict(key, dict):
    # Note: The driver code passes the direct string 'key' here instead of 'query'
    if key in dict:
        print(f"Marks of {key} is {dict[key]}")
        return True
    return False