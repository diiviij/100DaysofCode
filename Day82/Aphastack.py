def splitString(s,s1,s2):
    for i in s:
        if (i.isalpha()):
            s1.append(i)
        elif(i.isdigit()):
            s2.append(i)
        else:
            print("Invalid Input")
            exit()
    for i in s1:
        print(i,end="")
    print()
    for i in s2:
        print(i,end="")
s=input()
s1=[]
s2=[]
splitString(s,s1,s2)

#Input 1
#S1a2m345pl67e
#Output 1
#Sample
#1234567
