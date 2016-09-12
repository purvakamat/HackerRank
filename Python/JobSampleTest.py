
def staircase(n):
    for i in range(n):
        s = "#" * (i+1)
        print s.rjust(n)
    return

n = int(raw_input())
staircase(n)