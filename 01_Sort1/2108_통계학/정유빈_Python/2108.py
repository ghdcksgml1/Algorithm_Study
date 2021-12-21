import sys, collections
from collections import Counter

b = int(input())
list = []

for i in range(b):
    number = int(sys.stdin.readline())
    list.append(number)

list.sort()

# 평균
# 평균
a = sum(list) / b


def roundUp(num):
    if num == 0:
        return 0

    if (num < 0):

        if (num - int(num)) <= - 0.5:
            return int(num) - 1
        else:
            return int(num)

    if (num > 0):
        if (num - int(num)) >= 0.5:
            return int(num) + 1
        else:
            return int(num)


print(roundUp(a))

# 중앙값
print(list[int((b - 1) / 2)])

# 최빈값
cnt = Counter(list)

sorted_by_value = sorted(cnt.items(), key=lambda x: x[1], reverse=True)

if b == 1:
    print(list[0])
else:
    if sorted_by_value[0][1] == sorted_by_value[1][1]:
        print(sorted_by_value[1][0])
    else:
        print(sorted_by_value[0][0])

# 최댓값과 최솟값 차이

if b == 1:
    print("0")
else:
    smallest = list[0]
    biggest = list[0]

    for i in list:
        if i < smallest:
            smallest = i

    for j in list:
        if j > biggest:
            biggest = j

    print(biggest - smallest)
