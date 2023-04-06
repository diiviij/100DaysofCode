def decryptMessage(text,key):
    l=len(text)
    if(key > l):
        print("Invalid Input")
    else:
        for i in range(l):
            s=i+key
            if(s>=l):
                s-=l;
            print(text[s],end="")
text=input()
key=int(input())
decryptMessage(text, key)