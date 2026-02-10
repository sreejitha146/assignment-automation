class Student:
   def __init__(self, name, grade, age):
       self.name = name
       self.grade = grade
       self.age = age
   def display(self):
       print(self.name, self.grade, self.age)

class School(Student):
   def schoolStudentDisplay(self):
       print(self.name, self.grade, self.age)

s = Student("Sree", "A", 22)
s.display()
sc = School("Robert", "B", 21)
sc.schoolStudentDisplay()
