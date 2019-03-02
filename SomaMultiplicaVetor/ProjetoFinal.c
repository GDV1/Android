//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina: M2LPBA
//Programação de Computadores e Dispositivos Móveis
//Aluno: Gabriel Dias Vieira
//******************************************************

//BIBLIOTECAS
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*A BIBLIOTECA "locale.h" PERMITE QUE O PROGRAMA SEJA EXECUTADO NO IDIOMA LOCAL (PT-BR)*/
#include <locale.h>

int main(int argc, char **argv)
{
    //VARIÁVEIS
    setlocale(LC_ALL, "portuguese"); //CONFIGURA A BIBLIOTECA "locale.h" PARA O IDIOMA LOCAL
    int vetor[5];
    int contador;
    int soma = 0; //INICIALIZA A VARIAVEL COM O ELEMENTO NEUTRO DA SOMA
    int multiplica = 1; //INICIALIZA A VARIAVEL COM O ELEMENTO NEUTRO DA MULTIPLICACAO


    //LOOP PARA INSERCAO DOS VALORES NO VETOR
    printf("Informe os valores do vetor: \n");
    for(contador = 0; contador < 5; contador++){
        scanf("%d", &vetor[contador]);
    }


    //LOOP QUE REALIZA A SOMA DOS VALORES INFORMADOS E EXIBE O RESULTADO
    for(contador = 0; contador < 5; contador++){
        soma = soma + vetor[contador];
    }


    //EXIBE O RESULTADO DA SOMA
    printf("\nA soma dos valores do vetor é: %d", soma);


    //ESSA ESTRUTURA ANALISA SE O VALOR DA SOMA E POSITIVO, NEGATIVO OU NULO
    if(soma >= 0){
        printf("\nO valor da soma é positivo!\n");

    }else{
        printf("\nO valor da soma é negativo!\n");
    }


    //LOOP QUE REALIZA A MULTIPLICACAO DOS VALORES INFORMADOS
    for(contador = 0; contador < 5; contador++){
       multiplica = multiplica *(vetor[contador]);
    }


    //EXIBE O RESULTADO DA MULTIPLICACAO
    printf("\nA multiplicação dos valores é: %d", multiplica);


    //ESSA ESTRUTURA ANALISA SE O VALOR DA MULTIPLICACAO É POSITIVO OU NEGATIVO
    if(multiplica >= 0){
        printf("\nO valor da multiplicação é positivo!\n\n");

    }else{
        printf("\nO valor da multiplicação é negativo!\n\n");
    }


    system("PAUSE");
    return (0);
}



