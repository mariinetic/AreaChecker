# 📐 AreaChecker

**AreaChecker** é um projeto Java desenvolvido para auxiliar professores no cálculo de áreas de figuras geométricas planas e espaciais. O sistema centraliza todos os cálculos por meio de uma única classe de acesso (`ShapeFactoryImpl`) e aplica conceitos de **orientação a objetos**, **polimorfismo**, **interfaces** e **organização modular em pacotes**.

---

## 🎯 Objetivo

Calcular a área das seguintes figuras:

- ✅ Quadrado  
- ✅ Retângulo  
- ✅ Círculo  
- ✅ Triângulo  
- ✅ Paralelogramo  
- ✅ Trapézio  
- ✅ Hexágono  
- ✅ Losango  
- ✅ Cubo *(área da superfície)*

Cada figura é representada por uma classe que implementa a interface `Calculable`.

---

## 🧱 Estrutura da Aplicação
```plaintext
area-checker/
├── src/
│   └── br/
│       └── com/
│           └── areachecker/
│               ├── ShapeFactoryImpl.java
│               ├── Main.java
│               ├── enums/
│               │   └── ShapeType.java
│               ├── interfaces/
│                   └── Calculable.java
│                   ├── Quadrado.java
│                   ├── Retangulo.java
│                   ├── Circulo.java
│                   ├── Triangulo.java
│                   ├── Paralelogramo.java
│                   ├── Trapezio.java
│                   ├── Hexagono.java
│                   ├── Losango.java
│                   └── Cubo.java
├── README.md

```
---

## 🧪 Testes

Todos os cenários de teste estão na classe `Main`, com pelo menos **um caso para cada figura**.

---

## 📦 Tecnologias Utilizadas

- Linguagem: **Java**
- Padrões aplicados:
  - Interface única (`Calculable`)
  - Enum (`ShapeType`)
  - Fábrica central (`ShapeFactoryImpl`)
  - Encapsulamento via pacotes
  - Polimorfismo

---

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/area-checker.git
cd area-checker
