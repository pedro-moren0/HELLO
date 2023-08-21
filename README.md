# HELLO - Um compilador de Isilang para C

Humberto Turioni Marinho - RA 11201722439

Pedro Moreno Silva       - RA 11201722110

UFABC - Compiladores 2023.2

---

## Descrição

HELLO é um compilador de Isilang (Isi), pseudo-linguagem imperativa e não procedural sugerida em aula, para a linguagem C. Dado um arquivo .isi, ao submetê-lo ao HELLO, o programa é compilado para C usando a biblioteca ANTLR4. Para realizar esse processo, é necessário usar a IDE Eclipse com o plugin do ANTLR4, e adicionar o arquivo `antlr-4.13.0-complete.jar`.

## Instalação
1. Baixe o Eclipse IDE e siga as instruções do plugin do ANTLR4: https://github.com/jknack/antlr4ide
2. Clone o repositório no seu computador.
3. No Eclipse, clique em Open Projects from File System e selecione o repositório clonado.
4. Após adicionado, clique com o botão direito e Properties > Java Build Path > Libraries, adicione o .jar do ANTLR
5. Ainda em Properties, clique em ANTLR > Tool e adicione também o .jar

## Execução
1. Clique com o botão direito no arquivo .g4 e o compile.
2. Execute o arquivo MainClass como aplicação Java.
