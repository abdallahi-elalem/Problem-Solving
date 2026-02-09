# Complete the solution so that it reverses all of the words within the string passed in.

# Words are separated by exactly one space and there are no leading or trailing spaces.


def reverse_words_easy(s):
    list = s.split(' ')
    reverse_list  =list[::-1]
    result = " ".join(reverse_list)
    return result



def reverse_words(s):
    
    return " ".join(s.split(' ')[::-1])




if __name__ == '__main__':
    n = int(input().strip())
if n % 2==0:
    print("Not Weird")
else:
    print("Weird")
