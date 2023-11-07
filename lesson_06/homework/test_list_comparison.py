import pytest

from homework.list_comparison import ListComparison


@pytest.mark.parametrize('list, expected', [
    ([10, 20, 30, 40, 50], 30),
    ([], 0),
    ([5], 5)
])
def test_find_average(list, expected):
    assert ListComparison.find_average(list) == expected


def test_find_average_typeerror():
    with pytest.raises(TypeError):
        ListComparison.find_average('')


@pytest.mark.parametrize('lst1, lst2, expected', [
    ([10, 20, 30, 40, 50], [5, 10, 15, 20, 30], 'Первый список имеет большее среднее значение'),
    ([5, 10, 15, 20, 30], [10, 20, 30, 40, 50], 'Второй список имеет большее среднее значение'),
    ([10, 20, 30, 40, 50], [10, 20, 30, 40, 50], 'Средние значения равны'),
])
def test_compare(lst1, lst2, expected):
    assert ListComparison.compare(lst1, lst2) == expected


def test_compare_typeerror():
    with pytest.raises(TypeError):
        ListComparison.compare('', [])
        ListComparison.compare([], '')
        ListComparison.compare('', '')