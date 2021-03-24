# https://edabit.com/challenge/mHLAmj4vmRuXrT8Nb


def consecutive_combo(lst1, lst2):
    combined_lists = lst1 + lst2
    combined_lists.sort()
    for x in range(0, len(combined_lists)):
        if x + 1 == len(combined_lists):
            break
        elif combined_lists[x + 1] == combined_lists[x] + 1:
            continue
        else:
            return False
    return True



if __name__ == "__main__":
    print(consecutive_combo([7, 4, 5, 1], [2, 3, 6]))
    print(consecutive_combo([1, 4, 6, 5], [2, 7, 8, 9]))
    print(consecutive_combo([44, 46], [45]))
