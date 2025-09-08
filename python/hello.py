#Royal Challengers Bangalore
rcbPlayers={"Faf du Plessis","Virat Kohli","Shivam Dube","Shivam Dube","Dinesh Karthik","Anuj Rawat","Mahipal Lomror","Wanindu Hasaranga","Josh Hazlewood","Harshal Patel","Mohammed Siraj","Yuzvendra Chahal"}
print("Welcome to Royal Challengers Bangalore")
try:
    printa("Here is the list of players in RCB")
except NameError as e:
    print("There is an error in the code:", e)
else:
    print(rcbPlayers)