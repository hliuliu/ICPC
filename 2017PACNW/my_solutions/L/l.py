from math import sqrt

k,p,x = map(int ,raw_input().split())

m = round(sqrt(k*p/float(x)))

print '%.3f'%(m*x+(k*p)/m)

