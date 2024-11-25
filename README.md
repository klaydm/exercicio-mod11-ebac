# Programa de Ordenação de Nomes e Separação por Sexo

Este programa em Java permite realizar duas tarefas principais:

1. **Ordenar uma lista de nomes inseridos pelo usuário**.
2. **Separar nomes por sexo (M/F)** com base em entradas no formato `Nome - Sexo`.

## Estrutura do Projeto

O programa é dividido em três classes principais:

- **`OrdenarNomes`**: Implementa a funcionalidade de ordenar nomes inseridos pelo usuário.
- **`SepararPorSexo`**: Implementa a funcionalidade de separar nomes por sexo e ordená-los.
- **`Main`**: Classe principal que gerencia o fluxo do programa e oferece um menu interativo para o usuário.

## Funcionalidades

### 1. Ordenar Nomes
O usuário pode inserir nomes separados por vírgulas. O programa:
- Divide os nomes com base no separador `,`.
- Remove espaços desnecessários.
- Ordena os nomes em ordem alfabética.
- Exibe os nomes ordenados no console.

**Exemplo de Entrada:**
Maria, João, Ana, Carlos

**Saída:**
Nomes ordenados: Ana Carlos João Maria

### 2. Separar Nomes por Sexo
O usuário pode inserir nomes no formato `Nome - Sexo` separados por vírgulas. O programa:
- Divide cada par `Nome - Sexo` com base no hífen `-`.
- Identifica o sexo (`M` para masculino e `F` para feminino).
- Agrupa os nomes em listas separadas.
- Ordena cada lista.
- Exibe os nomes agrupados e ordenados no console.

**Exemplo de Entrada:**
Kennedy - M, Maria - F, João - M, Ana - F

**Saída:**
Grupo Masculino: João Kennedy
Grupo Feminino: Ana Maria

### 3. Menu Interativo
O programa oferece um menu com as seguintes opções:
- `1`: Ordenar nomes.
- `2`: Separar por sexo.
- `0`: Sair do programa.

## Como Executar

1. **Pré-requisitos:**
   - Certifique-se de ter o [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado.
   - Configure a variável de ambiente `JAVA_HOME`.

2. **Compilar o Programa:**

   Navegue até o diretório do projeto e execute:
   javac Main.java
Executar o Programa: Após a compilação, execute:

java Main
Siga as instruções do menu interativo.

Estrutura de Arquivos

├── Main.java           # Classe principal
├── OrdenarNomes.java   # Lógica para ordenar nomes
├── SepararPorSexo.java # Lógica para separar nomes por sexo
├── README.md
