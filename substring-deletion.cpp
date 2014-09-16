#include <iostream>
#include<vector>
#include<cstring>
#include<cstdio>
#include"MyUtility.h"
using namespace std;

int main() {
    int k=0;
	vector<int> positions=SubstringCheck("yuyiuABCyiuyiuyABCp","ABC");

	for(int i=0;i<strlen("yuyiuABCyiuyiuyABCp");i++)
	{
		if(i==positions[k])
		{
            for(int j=0;j<strlen("ABC");j++)
            {    printf("*");
                    i++;
            }
            k++;
            i--;
        }
		else
            printf("%c","yuyiuABCyiuyiuyABCp"[i]);
    }
	return 0;
}
/*
uSING <ALGORITHM>
string s="asdfghnABCsdfghjABC";
s.replace(s.find("ABC"),3,"***");
s.replace(s.find("ABC"),3,"***");
cout<<s;
*/
