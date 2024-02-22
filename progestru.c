#include <stdio.h>
#include <string.h>

typedef struct{
    char placa[10];
    float preco;
    int ano;
    int veloc;
    int status;
}veiculo;

void criaveiculo(veiculo *v){

    printf("Informe a placa do veiculo: ");
    scanf("%s", &v->placa);
    printf("\n\n");
    
    printf("Informe o preco do veiculo: ");
    scanf("%f", &v->preco);
    printf("\n\n");

    printf("Informe o ano do veiculo: ");
    scanf("%d", &v->ano);
    printf("\n\n");

    printf("Informe a velocidade do veiculo: ");
    scanf("%d", &v->veloc);
    printf("\n\n");

    printf("Informe se o veiculo esta ligado(1) ou desligado(0): ");
    scanf("%d", &v->status);
    printf("\n\n");
}


void ligaveiculo(veiculo v){

}


void desligaveiculo(veiculo v){

}


void aceleraveiculo(veiculo v){

}


void desaceleraveiculo(veiculo v){

}


void printaveiculo(veiculo v){

}

int main(){

    veiculo vcl1;

    criaveiculo(&vcl1);

    return 0;
}
