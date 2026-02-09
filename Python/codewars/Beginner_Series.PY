#Clock shows h hours, m minutes and s seconds after midnight.

#Your task is to write a function which returns the time since midnight in milliseconds.

def past(h, m, s):
    if 0 <= h <= 23 and 0 <= m <= 59 and 0 <= s <= 59:
        x = h * 3600
        y = m * 60
        total = (x + y + s) * 1000
        
        return(total)
    else:
        return("Please input an hour between 0 and 23 and a minute or second inbetween 0 and 59.")
    
 