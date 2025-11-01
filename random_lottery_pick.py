import random

lottery_numbers_list = []
for count in range(100):
	lottery_numbers = (random.randrange(1000000000, 9999999999))
	lottery_numbers_list.append(lottery_numbers)


print(lottery_numbers_list)
lucky_numbers = random.sample(lottery_numbers_list ,2)
print("Winning numbers: ",lucky_numbers)