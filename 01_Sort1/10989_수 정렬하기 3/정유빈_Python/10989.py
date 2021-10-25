import sys

n = int(input())
check_list = [0]*10001

for i in range(n):
    input_num = int(sys.stdin.readline())
    check_list[input_num] += 1

for i in range(10001):
    if check_list[i] != 0:
        for j in range(check_list[i]):
            print(i)