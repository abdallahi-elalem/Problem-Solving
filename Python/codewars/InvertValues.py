#Given a set of numbers, return the additive inverse of each. 
#Each positive becomes negatives, and the negatives become positives.



def invert(lst):
    
    invert=[]
    
    for n in lst:
        invert.append(-n)
        
    return invert        




print(invert([]))
print(invert([1, 2, 3, 4, 5]))
print(invert([1, -2, 3, -4, -5]))
