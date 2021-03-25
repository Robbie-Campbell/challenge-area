# https://edabit.com/challenge/iRCwdDBkNcHM5QeAm

def hide_card(card):
    return ("*" * len(card[4:])) + card[-4:]

if __name__ == "__main__":
    print(hide_card(("1234123456785678")))