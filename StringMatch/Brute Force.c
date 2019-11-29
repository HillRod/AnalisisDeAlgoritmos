/*String Matching Brute Force*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char array[] = "ABDACDFABCBCFDABCABCABC";
    char arraycito[] = "ABC";
    int total=0,matches = 0;
    int i,j;

    for(i=0;i<strlen(array);i++){

        if(array[i]==arraycito[0]){
            matches=1;
            for(j=1;j<strlen(arraycito);j++){

                if(array[i+1]==arraycito[j]){
                    matches++;
                    i++;
                }

            }
            if(matches==strlen(arraycito))total++;
        }

    }
    printf("Matches: %i",total);

    return 0;
}
