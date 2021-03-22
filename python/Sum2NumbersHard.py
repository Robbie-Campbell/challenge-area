# https://edabit.com/challenge/aHGLnfW7xdMrhJZpo

import math

def reverse_value(word):
    return word[::-1]

def sum2(a, b):
    a_rev = reverse_value(a)
    b_rev = reverse_value(b)
    final_calc = ""
    longer = a_rev if len(a_rev) >= len(b_rev) else b_rev
    shorter = b_rev if len(a_rev) > len(b_rev) else a_rev
    carry_num = 0
    shorter = shorter[1:]
    for index, number in enumerate(longer):
        if len(shorter) >= index:
            current_num = int(number) + int(shorter[index - 1]) + carry_num
        else:  
            current_num = int(number) + carry_num
        carry_num = 0
        carry_num += math.floor(current_num / 10)
        final_calc += str(current_num % 10)
            
    return reverse_value(final_calc)
    
if __name__ == "__main__":
    print(sum2("6666666666666666666666666666", "99999999999999999999999"))