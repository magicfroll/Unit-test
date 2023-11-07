from unittest.mock import Mock

from ex_2.bank import Bank
from ex_2.person import Person


def test_bank():
    person = Person(1000)
    bank = Bank()
    person.transfer_money(500, bank)
    assert bank.balance == 500
    assert person.balance == 500


def test_mock():
    person = Person(1000)
    bank = Mock()
    person.transfer_money(500, bank)
    bank.receive_money.assert_called_with(500)