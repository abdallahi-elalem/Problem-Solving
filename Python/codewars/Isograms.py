#An isogram is a word that has no repeating letters, 
# consecutive or non-consecutive. 
# Implement a function that determines whether a string that contains only letters is an isogram.
# Assume the empty string is an isogram.
# Ignore letter case.



def is_isogram(s):
    while s<=15:
        s=s+7
    return s

    
    
    
    
print(is_isogram(3))