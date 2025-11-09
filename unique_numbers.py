numbers = [1,2,2,3,4,3,5,6,5,6,7,8,8,1,9]
new_list = []
for number in numbers:
	if number not in new_list:
		new_list.append(number)
print(new_list)