#write a python program to print all odd numbers between 1 and 100. 
for num in range(1, 101):
    if num % 2 != 0:
        print(num)  

    
# the range function can also be used to generate odd numbers directly
for num in range(1, 101, 2):
    print(num)

#apart from for loop, the range function can also be used with while loop to print odd numbers
num = 1
while num < 101:
    print(num)
    num += 2    

# we can also use list comprehension to generate a list of odd numbers between 1 and 100
odd_numbers = [num for num in range(1, 101,2)]
print(odd_numbers)
# we can also use filter function to filter out odd numbers from a list of numbers between 1 and 100
numbers = list(range(1, 101))
odd_numbers = list(filter(lambda x: x % 2 != 0, numbers))
print(odd_numbers)


