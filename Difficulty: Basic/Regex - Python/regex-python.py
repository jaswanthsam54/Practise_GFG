import re

def numberMatcher(str):
    # \d+ matches one or more consecutive digits (0-9)
    pat = r'\d+'
    
    match = re.findall(pat, str) ##find all finds all the matched texts and returns a list
    if(match):
        for i in match:
            print(i, end=" ")
    else:
        print(-1, end="")