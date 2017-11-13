from math import sqrt

k,p,x = map(int ,raw_input().split())

m = int(sqrt(k*p/float(x)))
f=lambda m: (m*x+(k*p)/float(m))
print '%.3f'%min(f(m),f(m+1))

