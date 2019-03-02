# Cadastro de Disciplinas
Sistema de cadastro de disciplinas em Java e conectado a um Banco de Dados MySQL. 

O sistema consiste em uma janela simples de Cadastro, Exclusão e Listagem das disciplinas cadastradas em um banco de dados. 

![gestaoacademica](https://user-images.githubusercontent.com/33738953/48316589-ea317900-e5cc-11e8-9ce5-f301d0d560ad.png)

O cadastro é feito por um formulário, onde o usuário insere informações como Nome da Disciplina, Carga Horária, a qual Curso a mesma pertence, quantas Vagas são oferecidas e o Período em que as aulas serão (ou foram) ministradas (matutino, vespertino ou noturno).

![cadastroform](https://user-images.githubusercontent.com/33738953/48316632-7774cd80-e5cd-11e8-910a-0536fd88e966.png)

Ao ser efetuado um cadastro, o sistema exibe uma mensagem de Sucesso!

![cadastroconcluido](https://user-images.githubusercontent.com/33738953/48316675-20bbc380-e5ce-11e8-8c5b-9ae55d5c25a6.png)

Caso um ou mais campos do formulário estejam em branco, o sistema exibe uma mensagem de erro!

![errocadastro](https://user-images.githubusercontent.com/33738953/48316709-7ee8a680-e5ce-11e8-958a-3137f56a9b68.png)

A interface de exclusão de dados exibe uma ComboBox que, conectada ao banco de dados, mostra todos os dados cadastrados. 

![exclusao](https://user-images.githubusercontent.com/33738953/48316737-c838f600-e5ce-11e8-9bde-b0491f5d024a.png)

![exclusaolist](https://user-images.githubusercontent.com/33738953/48316781-15b56300-e5cf-11e8-8758-c7fd5ad26540.png)

Os dados cadastrados no banco são exibidos em uma tabela com os campos ID, Disciplina, Carga Horária, Vagas, Curso e Período

![list](https://user-images.githubusercontent.com/33738953/48316812-7c3a8100-e5cf-11e8-96ba-fea277b580a5.png)

Em todas as janelas os botões "Voltar" voltam para a janela anterior e, na primeira janela, o botão "Sair" fecha a aplicação.  
