def Factorial(n):
    if(n==1):
        return 1
    else:
        return n*Factorial(n-1)


print("Enter a number")
a = int(input())
print("Factorial of the number "+str(a)+" is : "+str(Factorial(a)))