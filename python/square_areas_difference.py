# https://edabit.com/challenge/NNhkGocuPMcryW7GP

import math

def square_areas_difference(radius):
    return round((3 * math.pow(radius, 2)) - math.pow(radius, 2))

if __name__ == "__main__":
    print(square_areas_difference(5))
    print(square_areas_difference(6))
    print(square_areas_difference(7))