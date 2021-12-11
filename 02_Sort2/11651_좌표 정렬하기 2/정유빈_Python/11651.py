import sys

a = int(input())
data = []

for i in range(a):
    data.append(list(map(int, sys.stdin.readline().split())))

data.sort(key=lambda x: (x[1], x[0]))

for x, y in data:
    print(x, y)