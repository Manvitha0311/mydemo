class Bank:
    def __init__(self):
        self.__balance = 0
    def deposit(self, amount):
        self.__balance += amount
    def withdraw(self, amount):
        if amount > self.__balance:
            print("Insufficient balance")
        else:
            if amount < 0:
                print("Invalid amount")       
            self.__balance -= amount
    def get_balance(self):
        return self.__balance
b=Bank()
b.deposit(1000)
b.deposit(1200)
b.withdraw(-100)
b.withdraw(2300)
print(b.get_balance())