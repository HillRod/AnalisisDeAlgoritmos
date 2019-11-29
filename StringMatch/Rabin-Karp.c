/*String Matching Rabin-Karp*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main()
{
    int hashtable[500000];
    char array[] = "AABCDACDFABCBCFDABCABCABCABC";
    char arraycito[] = "ABC";
    int total=0,matches = 0,rec=0;
    int i,j;
    int hashsote=0,hashcito=0,power=0;

    for(i=0;i<strlen(arraycito);i++){
        hashcito+=arraycito[i]*pow(7,i); // sub[0]*7^0 + sub[1]*7^1 + sub[2]*7^2 + ... + sub[n]*7^n
    }
    //printf("%i",hashcito);

    for(i=0;i<strlen(array)-strlen(arraycito)+1;i++){

        for(j=i;j<strlen(arraycito)+i;j++,power++){
            hashsote+=array[j]*pow(7,power);
        }
        if(hashsote==hashcito)rec++;
        power=0;
        //printf("%i\n",hashsote);
        hashtable[hashsote]++;
        hashsote=0;
    }
    //printf("Matches: %i",hashtable[hashcito]);
    printf("Matches: %i",rec);

    return 0;
}
