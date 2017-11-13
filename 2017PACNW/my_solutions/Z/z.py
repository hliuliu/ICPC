
getNext = lambda n: n+1 if n%10<9 else getNext(n/10)*10+1

n= int(raw_input())
print getNext(n)
