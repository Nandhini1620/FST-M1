import pytest


def test_add():
	a = 10
	b = 15
	sum = a + b
	assert sum ==25
	print(sum)
@pytest.mark.other
def test_sub():
	a = 20
	b = 15
	sub = a - b
	assert sub ==5	
	print(sub)
@pytest.mark.activity
def test_multi():
	a = 10
	b = 15
	m = a * b
	assert m ==150
	print(m)
@pytest.mark.activity
def test_div():
	a = 50
	b = 5
	div = a / b
	assert div ==10
	print(div)
