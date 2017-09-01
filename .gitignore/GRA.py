import xlrd
from xlrd import open_workbook,cellname
import xlsxwriter

def open(x):
	book = open_workbook(x)
	sheet = book.sheet_by_index(0)
	return sheet

def minimum(x):
	m=x[0]
	
	for i in x:
		if m>x[i]:
			m=x[i]
	return m

def maximum(x):
	m=x[0];
	
	for i in x:
		if m<x[i]:
			m=x[i]
	return m	


# normalize batsmen

def normalize(x,y):
	
	d = {}
	g = {}
	h = {}
	i = {}
	j = {}
	workbook = xlsxwriter.Workbook(y)
	o = workbook.add_worksheet()
	sheet = open(x)
	o.write(0,0,"Player")
	o.write(0,1,"Runs")	
	o.write(0,2,"AVG")
	o.write(0,3,"SR")
	o.write(0,4,"50's")
	o.write(0,5,"100's")
	count=0
	for row_index in range(1,sheet.nrows):
			if (float(sheet.cell(row_index,7).value) >= 82.00
					and sheet.cell(row_index,2).value >= 250
					and sheet.cell(row_index,3).value >= 250
					and sheet.cell(row_index,1).value >= 5):		
				d[count]=int(sheet.cell(row_index,3).value)
				g[count]=float(sheet.cell(row_index,6).value)
				h[count]=float(sheet.cell(row_index,7).value)
				i[count]=int(sheet.cell(row_index,8).value)
				j[count]=int(sheet.cell(row_index,9).value)
				o.write(count+1,0,sheet.cell(row_index,0).value)	
				count+=1

	d1=minimum(d)
	g1=minimum(g)
	h1=minimum(h)
	i1=minimum(i)
	j1=minimum(j)
	d2=maximum(d)	
	g2=maximum(g)
	h2=maximum(h)
	i2=maximum(i)
	j2=maximum(j)

	for row_index in range(1,count+1):
					
				o.write(row_index,1,(d[row_index-1]-d1)/(d2-d1))
				o.write(row_index,2,(g[row_index-1]-g1)/(g2-g1))
				o.write(row_index,3,(h[row_index-1]-h1)/(h2-h1))
				o.write(row_index,4,(i[row_index-1]-i1)/(i2-i1))
				o.write(row_index,5,(j[row_index-1]-j1)/(j2-j1))
	
	workbook.close()

normalize("bat2011.xls","nbat2011.xls")
normalize("bat2012.xls","nbat2012.xls")
normalize("bat2013.xls","nbat2013.xls")
normalize("bat2014.xls","nbat2014.xls")


# finding batsmen grey relational coefficient

def cgrey(x,y):

	workbook = xlsxwriter.Workbook(y)
	o = workbook.add_worksheet()
	sheet = open(x)
	o.write(0,0,"Player")
	o.write(0,1,"Runs")	
	o.write(0,2,"AVG")
	o.write(0,3,"SR")
	o.write(0,4,"50's")
	o.write(0,5,"100's")

	for row_index in range(1,sheet.nrows):
				

				o.write(row_index,0,sheet.cell(row_index,0).value)		
				o.write(row_index,1,1/(2-float(sheet.cell(row_index,1).value)))
				o.write(row_index,2,1/(2-float(sheet.cell(row_index,2).value)))
				o.write(row_index,3,1/(2-float(sheet.cell(row_index,3).value)))
				o.write(row_index,4,1/(2-float(sheet.cell(row_index,4).value)))
				o.write(row_index,5,1/(2-float(sheet.cell(row_index,5).value)))
	workbook.close()
cgrey("nbat2011.xls","cbat2011.xls")
cgrey("nbat2012.xls","cbat2012.xls")
cgrey("nbat2013.xls","cbat2013.xls")
cgrey("nbat2014.xls","cbat2014.xls")


# finding batsmen grey relational grade

def ggrey(x,y):
	
	workbook = xlsxwriter.Workbook(y)
	o = workbook.add_worksheet()
	sheet = open(x)
	o.write(0,0,"Player")
	o.write(0,1,"Grade")
	for row_index in range(1,sheet.nrows):
				o.write(row_index,0,sheet.cell(row_index,0).value)		
				o.write(row_index,1,(35*float(sheet.cell(row_index,1).value)+
							25*float(sheet.cell(row_index,2).value)+
							15*float(sheet.cell(row_index,3).value)+
							10*float(sheet.cell(row_index,4).value)+
							15*float(sheet.cell(row_index,5).value)))
	workbook.close()
ggrey("cbat2011.xls","gbat2011.xls")
ggrey("cbat2012.xls","gbat2012.xls")
ggrey("cbat2013.xls","gbat2013.xls")
ggrey("cbat2014.xls","gbat2014.xls")


# normalizing bowlers
def normalizeb(x,y):
	
	d = {}
	g = {}
	h = {}
	i = {}
	j = {}
	workbook = xlsxwriter.Workbook(y)
	o = workbook.add_worksheet()
	sheet = open(x)
	o.write(0,0,"Player")
	o.write(0,1,"Wickets")
	o.write(0,2,"Balls")	
	o.write(0,3,"AVG")
	o.write(0,4,"Economy")
	o.write(0,5,"SR")
	count=0
	for row_index in range(1,sheet.nrows):
			if (sheet.cell(row_index,1).value >= 5
					and sheet.cell(row_index,2).value >= 300
					and float(sheet.cell(row_index,5).value) <= 35.00
					and sheet.cell(row_index,4).value >= 5):	
							
				d[count]=int(sheet.cell(row_index,2).value)
				g[count]=int(sheet.cell(row_index,4).value)
				h[count]=float(sheet.cell(row_index,5).value)
				i[count]=float(sheet.cell(row_index,6).value)
				j[count]=float(sheet.cell(row_index,7).value)
				o.write(count+1,0,sheet.cell(row_index,0).value)	
				count+=1

	d1=minimum(d)
	g1=minimum(g)
	h1=minimum(h)
	i1=minimum(i)
	j1=minimum(j)
	d2=maximum(d)	
	g2=maximum(g)
	h2=maximum(h)
	i2=maximum(i)
	j2=maximum(j)

	for row_index in range(1,count+1):
					
				o.write(row_index,1,(d[row_index-1]-d1)/(d2-d1))
				o.write(row_index,2,(g[row_index-1]-g1)/(g2-g1))
				o.write(row_index,3,(h[row_index-1]-h1)/(h2-h1))
				o.write(row_index,4,(i[row_index-1]-i1)/(i2-i1))
				o.write(row_index,5,(j[row_index-1]-j1)/(j2-j1))

	workbook.close()

normalizeb("ball2011.xls","nball2011.xls")
normalizeb("ball2012.xls","nball2012.xls")
normalizeb("ball2013.xls","nball2013.xls")
normalizeb("ball2014.xls","nball2014.xls")


# finding bowler grey relational coefficient

def cgreyb(x,y):

	workbook = xlsxwriter.Workbook(y)
	o = workbook.add_worksheet()
	sheet = open(x)
	o.write(0,0,"Player")
	o.write(0,1,"Balls")	
	o.write(0,2,"Wickets")
	o.write(0,3,"AVG")
	o.write(0,4,"Economy")
	o.write(0,5,"SR")

	for row_index in range(1,sheet.nrows):
				

				o.write(row_index,0,sheet.cell(row_index,0).value)		
				o.write(row_index,1,1/(2-float(sheet.cell(row_index,1).value)))
				o.write(row_index,2,1/(2-float(sheet.cell(row_index,2).value)))
				o.write(row_index,3,1/(1+float(sheet.cell(row_index,3).value)))
				o.write(row_index,4,1/(1+float(sheet.cell(row_index,4).value)))
				o.write(row_index,5,1/(1+float(sheet.cell(row_index,5).value)))
	workbook.close()
cgreyb("nball2011.xls","cball2011.xls")
cgreyb("nball2012.xls","cball2012.xls")
cgreyb("nball2013.xls","cball2013.xls")
cgreyb("nball2014.xls","cball2014.xls")


# finding bowler grey relational grade
def ggreyb(x,y):
	
	workbook = xlsxwriter.Workbook(y)
	o = workbook.add_worksheet()
	sheet = open(x)
	o.write(0,0,"Player")
	o.write(0,1,"Grade")
	for row_index in range(1,sheet.nrows):
				o.write(row_index,0,sheet.cell(row_index,0).value)		
				o.write(row_index,1,(15*float(sheet.cell(row_index,1).value)+
							30*float(sheet.cell(row_index,2).value)+
							20*float(sheet.cell(row_index,3).value)+
							15*float(sheet.cell(row_index,4).value)+
							20*float(sheet.cell(row_index,5).value)))
	workbook.close()
ggreyb("cball2011.xls","gball2011.xls")
ggreyb("cball2012.xls","gball2012.xls")
ggreyb("cball2013.xls","gball2013.xls")
ggreyb("cball2014.xls","gball2014.xls")


# rate bowlers

def ballrate(w,x,y,z,a):
	workbook = xlsxwriter.Workbook(a)
	o = workbook.add_worksheet()
	o.write(0,0,"Player")
	o.write(0,1,"Rating")
	k=open(w)
	l=open(x)
	m=open(y)
	n=open(z)
	b={}
	c={}
	d={}
	e={}
	
	for i in range(1,l.nrows):
		batsmen=l.cell(i,0).value
		b[batsmen]=1.4*l.cell(i,1).value

	for i in range(1,m.nrows):
		batsmen=m.cell(i,0).value
		c[batsmen]=1.6*m.cell(i,1).value

	for i in range(1,n.nrows):
		batsmen=n.cell(i,0).value
		d[batsmen]=1.8*n.cell(i,1).value

	for i in range(1,k.nrows):
		batsmen=k.cell(i,0).value
		e[batsmen]=1.2*k.cell(i,1).value

	for i in b:
		count=1
		r=len(e)
		for j in e:
			if i==j:
				e[j]=e[j]+b[i]
				break
			elif count==r:
				e[i]=b[i]
				break
			count+=1 
	for i in c:
		count=1
		r=len(e)
		for j in e:
			if i==j:
				e[j]=e[j]+c[i]
				break
			elif count==r:
				e[i]=c[i]
				break
			count+=1
	for i in d:
		count=1
		r=len(e)
		for j in e:
			if i==j:
				e[j]=e[j]+d[i]
				break
			elif count==r:
				e[i]=d[i]
				break
			count+=1	
	o.write(0,0,"Player")
	o.write(0,1,"Rating")
	count=1
	for i in e:
		o.write(count,0,i)
		o.write(count,1,e[i])
		count+=1			
	workbook.close()
ballrate("gball2011.xls","gball2012.xls","gball2013.xls","gball2014.xls","rball.xls")


# rate batsmen

def batrate(w,x,y,z,a):
	workbook = xlsxwriter.Workbook(a)
	o = workbook.add_worksheet()
	o.write(0,0,"Player")
	o.write(0,1,"Rating")
	k=open(w)
	l=open(x)
	m=open(y)
	n=open(z)
	b={}
	c={}
	d={}
	e={}
	
	for i in range(1,l.nrows):
		batsmen=l.cell(i,0).value
		b[batsmen]=1.4*l.cell(i,1).value

	for i in range(1,m.nrows):
		batsmen=m.cell(i,0).value
		c[batsmen]=1.6*m.cell(i,1).value

	for i in range(1,n.nrows):
		batsmen=n.cell(i,0).value
		d[batsmen]=1.8*n.cell(i,1).value

	for i in range(1,k.nrows):
		batsmen=k.cell(i,0).value
		e[batsmen]=1.2*k.cell(i,1).value

	for i in b:
		count=1
		r=len(e)
		for j in e:
			if i==j:
				e[j]=e[j]+b[i]
				break
			elif count==r:
				e[i]=b[i]
				break
			count+=1 
	for i in c:
		count=1
		r=len(e)
		for j in e:
			if i==j:
				e[j]=e[j]+c[i]
				break
			elif count==r:
				e[i]=c[i]
				break
			count+=1
	for i in d:
		count=1
		r=len(e)
		for j in e:
			if i==j:
				e[j]=e[j]+d[i]
				break
			elif count==r:
				e[i]=d[i]
				break
			count+=1	
	o.write(0,0,"Player")
	o.write(0,1,"Rating")
	count=1
	for i in e:
		o.write(count,0,i)
		o.write(count,1,e[i])
		count+=1			
	workbook.close()
batrate("gbat2011.xls","gbat2012.xls","gbat2013.xls","gbat2014.xls","rbat.xls")

# Gives key with maximum value

def maximum_key(x):
	m=0
	g=1
	for i in x:
		if m<x[i]:
			m=x[i]
			g=i
	return g

#Sorts given excel sheet by value and eliminate player who didnot play in 2014
def sorting(x,y,z):
	workbook = xlsxwriter.Workbook(y)
	o = workbook.add_worksheet()
	o.write(0,0,"player")
	o.write(0,1,"rating")
	m=open(x)
	n=open(z)
	a={}
	b={}
	for i in range(1,n.nrows):
		player=n.cell(i,0).value
		b[player]=player
	for i in range(1,m.nrows):
		player=m.cell(i,0).value
		if player in b.keys():
			a[player]=m.cell(i,1).value
	for i in range(1,len(a)+1):
		o.write(i,0,maximum_key(a))
		o.write(i,1,a[maximum_key(a)])
		del a[maximum_key(a)]
	workbook.close()
sorting("rbat.xls","rbats.xls","bat2014.xls")
sorting("rball.xls","rballs.xls","ball2014.xls")

#Gives team to play on batting pitch

def finalbat(x,y,a):
	workbook = xlsxwriter.Workbook(a)
	o = workbook.add_worksheet()
	o.write(0,0,"Batsmen")
	o.write(0,1,"Allrounders")
	o.write(0,2,"Bowlers")
	m=open(x)
	n=open(y)
	b={}
	c={}
	d={}
	e={}
	f={}	
	bat={}
	ball={}	

	for i in range(1,m.nrows):
		b[i]=m.cell(i,0).value
		c[i]=m.cell(i,1).value
	for i in range(1,n.nrows):
		d[i]=n.cell(i,0).value
		e[i]=n.cell(i,1).value
	i=1
	print("BATSMEN")
	while i<6:
		o.write(i,0,b[i])
		bat[i]=b[i]
		i+=1
	print(bat)
	i=8
	print("BOWLERS")
	while i<=11:
		o.write(i-7,2,d[i-7])
		ball[i-7]=d[i-7]
		i+=1
	print(ball)
	k=1
	for i in range(6,m.nrows):
		l=5
		for j in range(5,n.nrows):
			if b[i]==d[j]:
				f[k]=b[i]	
				k+=1
			if k>2:
				break
			if l>40:
				break
			l+=1
	o.write(1,1,f[1])
	o.write(2,1,f[2])
	print("ALL_ROUNDERS")
	print(f)
	workbook.close()



#Gives team to play on bowling pitch

def finalball(x,y,a):
	workbook = xlsxwriter.Workbook(a)
	o = workbook.add_worksheet()
	o.write(0,0,"Batsmen")
	o.write(0,1,"Allrounders")
	o.write(0,2,"Bowlers")
	m=open(x)
	n=open(y)
	b={}
	c={}
	d={}
	e={}
	f={}	
	bat={}
	ball={}
	for i in range(1,m.nrows):
		b[i]=m.cell(i,0).value
		c[i]=m.cell(i,1).value
	for i in range(1,n.nrows):
		d[i]=n.cell(i,0).value
		e[i]=n.cell(i,1).value
	i=1
	print("BATSMEN")
	while i<7:
		o.write(i,0,b[i])
		bat[i]=b[i]
		i+=1
	print(bat)
	i=8
	print("BOWLERS")
	while i<=11:
		o.write(i-7,2,d[i-7])
		ball[i-7]=d[i-7]
		i+=1
	print(ball)
	k=1
	for i in range(7,m.nrows):
		l=5
		for j in range(5,n.nrows):
			if b[i]==d[j]:
				f[k]=b[i]	
				k+=1
			if k>1:
				break
			if l>40:
				break
			l+=1
	print("ALL_ROUNDER")
	print(f)
	o.write(1,1,f[1])
	workbook.close()



#Squad is selected based on the strategy

def final(x,y,a):
	workbook = xlsxwriter.Workbook(a)
	o = workbook.add_worksheet()
	o.write(0,0,"Batsmen")
	o.write(0,1,"Allrounders")
	o.write(0,2,"Bowlers")
	m=open(x)
	n=open(y)
	b={}
	c={}
	d={}
	e={}
	f={}	
	bat={}
	ball={}
	
	for i in range(1,m.nrows):
		b[i]=m.cell(i,0).value
		c[i]=m.cell(i,1).value
	for i in range(1,n.nrows):
		d[i]=n.cell(i,0).value
		e[i]=n.cell(i,1).value
	i=1
	print("BATSMEN")
	while i<8:
		o.write(i,0,b[i])
		bat[i]=b[i]
		i+=1
	print(bat)
	i=8
	print("BOWLERS")
	while i<13:
		o.write(i-7,2,d[i-7])
		ball[i-7]=d[i-7]
		i+=1
	print(ball)
	k=1
	for i in range(8,m.nrows):
		l=5
		for j in range(6,n.nrows):
			if b[i]==d[j]:
				f[k]=b[i]	
				k+=1
			if k>3:
				break
			if l>40:
				break
			l+=1
	o.write(1,1,f[1])
	print("ALL_ROUNDERS")
	print(f)
	o.write(2,1,f[2])
	o.write(3,1,f[3])
	workbook.close()
print("1.BATTING PITCH \n2.BOWLING PITCH \n3.SQUAD")
s=int(input("CHOOSE AN OPTION TO EXECUTE\n"))
if s==1:
	print("BATTING PITCH STRATEGY")
	finalbat("rbats.xls","rballs.xls","finalbat.xls")
elif s==2:
	print("BOWLING PITCH STRATEGY")
	finalball("rbats.xls","rballs.xls","finalball.xls")
elif s==3:
	print("SQUAD")
	final("rbats.xls","rballs.xls","finalsquad.xls")