
n=int(raw_input())

L = [map(lambda m: int(m,16), raw_input()) for _ in xrange(n)]

Lt = map(list,zip(*L))

comb = L+Lt

for row in comb:
	if len(row)>len(set(row)):
		print 'No'
		break
else:
	if [L[0],Lt[0]]== [range(n)]*2:
		print 'Reduced'
	else:
		print 'Not Reduced'

