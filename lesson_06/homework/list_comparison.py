class ListComparison():

    @classmethod
    def find_average(self, numbers):
        if type(numbers) != list:
            raise TypeError("Тип входящих данных должен быть список.")
        if not numbers:
            return 0
        return sum(numbers) / len(numbers)

    @classmethod
    def compare(self, lst1, lst2):
        if type(lst1) != list or type(lst2) != list:
            raise TypeError("Тип входящих данных должен быть список.")
        avg1 = self.find_average(lst1)
        avg2 = self.find_average(lst2)
        if avg1 > avg2:
            return 'Первый список имеет большее среднее значение'
        elif avg1 < avg2:
            return 'Второй список имеет большее среднее значение'
        else:
            return 'Средние значения равны'
