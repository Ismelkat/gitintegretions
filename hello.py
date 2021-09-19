print ("hello")
print ("how are you")
print ("I am fine ")

def saludara() : 
  print ("saludar cada que te saluden")

saludara()

nombre = "Ismelka"
apellido="Tejada"

def saludar (nombre, apellido) :
  print("Buenos dias : " +apellido+ nombre)


saludar(nombre, apellido)   
a=2
b=3



# Determinar cual de los dos valores es el mayor y escribirlo. 

#Inicio 
# Inicializar Variable a=0, b=0
A= 0 
B= 0

# Entradas de valores 
print ("ingrese dos numeros ")



try: 
  A= int(input("Primer numero"))  
  B= int(input("Segundo numero"))

  #si A=B entonces vuelve al paso 3 por que los valores deben ser distinto 
  def sonigules(A, B):
    if A == B :
        print("son iguales los nuemro")
    elif A > B: 
            print("El primer numero es mayor")
    else: 
        print("El segundo numero es mayor")
  print(sonigules(A,B))
except EOFError as e : 
    print(end="error EOF no se igreso ningun numero ")