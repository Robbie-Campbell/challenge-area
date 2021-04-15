# https://edabit.com/challenge/HyLkfdagDGc99ZhbF

def keyboard_shortcut(txt):
    new_str = ""
    copy = txt.split("Ctrl + C ")
    placeholder = []
    for i, word in enumerate(copy):
        if "Ctrl + V" in word and i > 0:
            placeholder.append("".join(copy[:i]))
            new_str += "".join(placeholder[:len(placeholder)])
        new_str += word
    return "".join(new_str.split(" Ctrl + V"))
    

if __name__ == "__main__":
    print(keyboard_shortcut("the egg and Ctrl + C Ctrl + V the spoon"))
    print(keyboard_shortcut("WARNING Ctrl + V Ctrl + C Ctrl + V"))
    print(keyboard_shortcut("The Ctrl + C Ctrl + V Town Ctrl + C Ctrl + V"))