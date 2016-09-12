

def cal_possible_values():
    t = int(raw_input())

    for t in range(t):
        n = int(raw_input())
        a = int(raw_input())
        b = int(raw_input())

        sum_pairs = []

        # possible combinations of a and b
        for i in range(n):
            for j in range(n):
                if i+j == n-1:
                    sum_pairs.append([i, j])

        last_stone = []
        # possible last stone values
        for k in sum_pairs:
            last_stone.append(a*k[0]+b*k[1])

        unique_values = sorted(list(set(last_stone)))

        print " ".join(map(str,unique_values))

    return


cal_possible_values()