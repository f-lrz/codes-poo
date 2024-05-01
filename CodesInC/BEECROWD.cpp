#include <stdio.h>

int main(){
    int a, b;
    int soma = 0;

    scanf("%d %d", &a, &b);
    
    for(int i = a; i <= b; i++) soma = soma + i;

    printf("%d\n", soma);

}