#include <iostream>
#include <string.h>
using namespace std;

class veiculo{

    private:
        char placa[10];
        float preco;
        int ano;
        int veloc;
        int status;

    public:
        void criaveiculo(veiculo v){

            printf("Informe a placa do veiculo: ");
            scanf("%s", placa);
            printf("\n\n");
    
            printf("Informe o preco do veiculo: ");
            scanf("%f", preco);
            printf("\n\n");

            printf("Informe o ano do veiculo: ");
            scanf("%d", ano);
            printf("\n\n");

            printf("Informe a velocidade do veiculo: ");
            scanf("%d", veloc);
            printf("\n\n");

            printf("Informe se o veiculo esta ligado(1) ou desligado(0): ");
            scanf("%d", status);
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
};

int main(){

    veiculo vcl1;

    vcl1.criaveiculo(vcl1);

    return 0;
}