import pytest

@pytest.fixture
def wallet_amount():
    amount= 0
    return amount

@pytest.mark.parametrize("earned,spent,expected", [(30,20,10), (40,30,10)],)
def test_parametrize(wallet_amount,earned,spent,expected):
    wallet_amount += earned

    wallet_amount -= spent

    assert wallet_amount == expected


    