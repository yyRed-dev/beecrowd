# 🐝 beecrowd — Soluções em Java

Repositório com minhas soluções para os problemas da plataforma **[beecrowd](https://judge.beecrowd.com/pt)** (antigo URI Online Judge), todas escritas em **Java**.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![beecrowd](https://img.shields.io/badge/beecrowd-F7B500?style=for-the-badge&logoColor=black)

---

## 📂 Atalhos — Questões resolvidas

### Série 1XXX

| Intervalo | Pasta | Status |
| :-------: | :---: | :----: |
| 1000 ~ 1020 | [📁 1000-1020](./1000-1020) | ✅ |
| 1021 ~ 1040 | [📁 1021-1040](./1021-1040) | ✅ |
| 1041 ~ 1060 | — | ⏳ Em andamento |
| 1061 ~ 1080 | [📁 1061-1080](./1061-1080) | ✅ |

### Questões avulsas

| Questão | Pasta | Enunciado |
| :-----: | :---: | :-------: |
| 1548 | [📁 1548](./1548) | [🔗 beecrowd](https://judge.beecrowd.com/pt/problems/view/1548) |
| 2460 | [📁 2460](./2460) | [🔗 beecrowd](https://judge.beecrowd.com/pt/problems/view/2460) |
| 3520 | [📁 3520](./3520) | [🔗 beecrowd](https://judge.beecrowd.com/pt/problems/view/3520) |

> 💡 Para adicionar um novo atalho, basta copiar uma linha da tabela e trocar o intervalo e o caminho da pasta.

---

## 🗂️ Organização

### Estrutura atual

As questões são agrupadas em blocos de **20 em 20**, e questões fora da sequência ficam em pastas próprias com o número do problema:

```
beecrowd/
├── 1000-1020/
├── 1021-1040/
├── 1061-1080/
├── 1548/
├── 2460/
├── 3520/
└── README.md
```

### Estrutura planejada

Ao completar as primeiras mil questões, o repositório será reorganizado em pastas por milhar, mantendo os blocos de 20 dentro de cada uma:

```
beecrowd/
├── 1XXX/
│   ├── 1000-1020/
│   ├── 1021-1040/
│   └── ...
├── 2XXX/
│   └── ...
├── 3XXX/
│   └── ...
└── README.md
```

> 🔧 O repositório ainda vai passar por refatorações de organização, então a estrutura pode mudar um pouco até lá.

---

## ▶️ Como executar

Cada solução é um arquivo `.java` independente, no padrão exigido pelo beecrowd (classe `Main` lendo da entrada padrão).

```bash
# Compilar
javac Main.java

# Executar
java Main
```

Depois é só digitar a entrada do problema (ou redirecionar de um arquivo):

```bash
java Main < entrada.txt
```

---

## 📌 Sobre

- **Plataforma:** [beecrowd](https://judge.beecrowd.com/pt)
- **Linguagem:** Java
- **Objetivo:** praticar lógica de programação e algoritmos, e manter um histórico da minha evolução.

---

<p align="center">Feito por <a href="https://github.com/yyRed-dev">yyRed-dev</a> 🐝</p>