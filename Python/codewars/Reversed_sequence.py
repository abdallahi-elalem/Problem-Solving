# Build a function that returns an array of integers from n to 1 where n>0.
#Example : n=5 --> [5,4,3,2,1]


n=int(input("Enter a positive integer: "))

def reverse_seq(n):
    if n > 1:
        return list(range(n, 0, -1))
print(reverse_seq(n))    
    