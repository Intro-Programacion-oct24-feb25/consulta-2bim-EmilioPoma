def factorial_recursivo(n):
    if n == 1:
        return 1
    else:
        return n * factorial_recursivo(n - 1)

def main():
    num = int(input("Introduzca un número: "))
    resultado = factorial_recursivo(num)
    print(f"El factorial de {num} es {resultado}")

main()