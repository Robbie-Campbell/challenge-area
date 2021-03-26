

def no_intersecting_ones(values):
    col_count = {}
    for line in values:
        value_count = 0
        for y, value in enumerate(line):
            if value == 1:
                value_count += 1
                col_count[y] += 1
                print(col_count)
            if value_count > 1 or col_count[y] > 1:
                return False
    return True

if __name__ == "__main__":
    print(no_intersecting_ones([
        [0, 0, 0, 1],
        [0, 1, 0, 0],
        [0, 1, 0, 0]
    ]))
