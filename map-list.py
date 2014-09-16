lloyd = {
    "name": "Lloyd",
    "homework": [90.0, 97.0, 75.0, 92.0],
    "quizzes": [88.0, 40.0, 94.0],
    "tests": [75.0, 90.0]
}
alice = {
    "name": "Alice",
    "homework": [100.0, 92.0, 98.0, 100.0],
    "quizzes": [82.0, 83.0, 91.0],
    "tests": [89.0, 97.0]
}
tyler = {
    "name": "Tyler",
    "homework": [0.0, 87.0, 75.0, 22.0],
    "quizzes": [0.0, 75.0, 78.0],
    "tests": [100.0, 100.0]
}

# Add your function below!
student=[lloyd,tyler,alice]
def average(lit):
    sum=0
    k=0
    for it in lit:
        sum+=it
        k+=1
    return sum/k

def get_average(student):
    for i in student:
        return 0.1*average(i["homework"])+0.3*average(i["quizzes"])+0.6*average(i["tests"])
    
print get_average(student)    