def censor(text,word):
    j=0
    m=''
    r=''
    text.split()
    for i in range(len(text)):
        if text[i]==' ':
            m=''
            while j<i:
                m+=text[j]
                j+=1
            j=i+1
            if m==word:
                for k in range(len(m)):
                    r+="*"
                r+=' '
            else:
                r+=m
                r+=' '
        i+=1
    else:
        m=''
        while j<i:
            m+=text[j]
            j+=1
        if m==word:
            for k in range(len(m)):
                r+="*"
        else:
            r+=m


    return r
        
        
        
#print censor("12 15 12","12")       
            
