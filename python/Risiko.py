# https://edabit.com/challenge/TY2mJcZR8LBWepu7T
def risiko(attacker, defender):
    attacker.sort(reverse=True)
    defender.sort(reverse=True)
    size = len(attacker) if len(attacker) <= len(defender) else len(defender)
    results = ""
    num_losses = 0
    for i in range(0, size):
        results += f"Comparison {i}:\n"
        results += f"ATT({attacker[i]}) vs. DEF({defender[i]}): DEF loses an army.\n" if attacker[i] > defender[i] else f"ATT({attacker[i]}) vs. DEF({defender[i]}): ATT loses an army.\n"
        num_losses += 1 if attacker[i] > defender[i] else 0
    print(results)
    return num_losses
            


if __name__ == "__main__":
    print(risiko([3, 6, 4], [2, 5, 4]))
    print(risiko([3, 6], [6, 4, 4]))