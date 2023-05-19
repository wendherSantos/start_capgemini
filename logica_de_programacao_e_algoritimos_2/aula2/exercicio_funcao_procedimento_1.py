def verificar_triangulo(a, b, c):
    if a + b > c and a + c > b and b + c > a:
        if a == b == c:
            return "equilátero"
        elif a != b and a != c and b != c:
            return "escaleno"
        else:
            return "isósceles"
    else:
        return None

def exibir_resultado_triangulo(a, b, c):
    tipo_triangulo = verificar_triangulo(a, b, c)
    if tipo_triangulo:
        print(f"As medidas {a}, {b} e {c} podem formar um triângulo {tipo_triangulo}.")
    else:
        print(f"As medidas {a}, {b} e {c} não podem formar um triângulo.")

# Solicitar as medidas dos lados do triângulo ao usuário
lado_a = float(input("Digite a medida do lado A: "))
lado_b = float(input("Digite a medida do lado B: "))
lado_c = float(input("Digite a medida do lado C: "))

# Chamar a função para exibir o resultado
exibir_resultado_triangulo(lado_a, lado_b, lado_c)
