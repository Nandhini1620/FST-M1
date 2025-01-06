class Car:
    'This is the class'

    def __init__(self, manufactor,model,transmission,color):
       self.manufactor = manufactor
       self.model = model
       self.transmission = transmission
       self.color = color
    def accelarate(self):
        print(self.manufactor + " " + self.model +  "has moving")
    def stop(self):
        print(self.manufactor + " " + self.model +  "has stopping")

c1 = Car("Toyato", "Corolla", "Manual"," White")
c2 = Car("Honda", "City", "Manual", "Red")
c3 = Car("MAruti", "800", "Automatic","Blue")

c1.accelarate()
c1.stop

