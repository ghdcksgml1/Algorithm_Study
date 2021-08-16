while(1):
    a,b = input().split()
    a = int(a)
    b = int(b)
    if a==0 and b==0 :
        break
    elif a>b:
        print("Yes")
    else:
        print("No")