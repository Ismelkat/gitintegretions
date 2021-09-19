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


print("Ingrese dos numeo separado para calcular rectangulo perimetro xd")
width, height = map(int, input().split())
def rectanglePerimeter(width, height):
   return ((width + height)*2)
print(rectanglePerimeter(width, height))