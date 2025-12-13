n=int(input())
arr=list(map(int,input().split()))
a=[]
b=[]
a.append(arr[0])
b.append(arr[1])
for i in range(2,n):
    if(arr[i]<arr[0]):
        a.append(arr[i])
    elif(arr[i]<arr[1]):
        b.append(arr[i])
    else:
        if(len(a)>len(b)):
            a.append(arr[i])
        elif(len(a)==len(b)):
            a.append(arr[i])
        else:
            b.append(arr[i])
        
print(a)
print(b)