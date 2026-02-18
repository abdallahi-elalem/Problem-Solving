#Every budding hacker needs an alias! The Phantom Phreak, Acid Burn, Zero Cool and Crash Override are some notable examples from the film Hackers.

#Your task is to create a function that, given a proper first and last name, will return the correct alias.

#Notes:
#Two objects that return a one word name in response to the first letter of the first name and one for the first letter of the surname are already given. See the examples below for further details.

#If the first character of either of the names given to the function is not a letter from A - Z, you should return "Your name must start with a letter from A - Z."

#Sometimes people might forget to capitalize the first letter of their name so your function should accommodate for these grammatical errors.


from preloaded import FIRST_NAME, SURNAME

def alias_gen(f_name: str, l_name: str) -> str:
    # Check if first characters are letters
    if not (f_name and l_name) or not (f_name[0].isalpha() and l_name[0].isalpha()):
        return "Your name must start with a letter from A - Z."
    
    # Convert first letters to uppercase
    first_initial = f_name[0].upper()
    last_initial = l_name[0].upper()
    
    # Ensure they are within A-Z range
    if first_initial not in FIRST_NAME or last_initial not in SURNAME:
        return "Your name must start with a letter from A - Z."
    
    return f"{FIRST_NAME[first_initial]} {SURNAME[last_initial]}"
