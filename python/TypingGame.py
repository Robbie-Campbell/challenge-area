# https://edabit.com/challenge/DQy6FL26FeNDecqNr

def correct_stream(user, correct):
    arr = []
    for x in range(0, len(user)):
        arr.append(1) if user[x] == correct[x] else arr.append(-1)
    return arr

if __name__ == "__main__":
    print(correct_stream(["it", "is", "find"], ["it", "is", "fine"]))