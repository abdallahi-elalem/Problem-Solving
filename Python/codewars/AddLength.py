#What if we need the length of the words separated by a space to be added at the end of that same word and have it returned as an array?
#"apple ban" --> ["apple 5", "ban 3"]


def add_length(str_):
    
    r=[]
    s=str_.split()
    for i in s:
       r.append(i+" "+ str(len(i)))
    return r

      

print(add_length("apple ban"))


