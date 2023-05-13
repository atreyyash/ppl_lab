// Exp - 6.cpp
#include <iostream>
using namespace std;

class Complex {
private:
	double real, imag;

public:
	Complex(double r = 0.0, double i = 0.0) { // constructor
		real = r;
		imag = i;
	}

	Complex operator+(Complex const &obj) { // overloaded + operator
		Complex res;
		res.real = real + obj.real;
		res.imag = imag + obj.imag;
		return res;
	}

	friend Complex operator*(Complex const &obj1, Complex const &obj2); // overloaded * operator as a friend function

	void display() { // member function to display complex number
		cout << real << " + " << imag << "i" << endl;
	}
};

Complex operator*(Complex const &obj1, Complex const &obj2) { // overloaded * operator as a friend function
	Complex res;
	res.real = (obj1.real * obj2.real) - (obj1.imag * obj2.imag);
	res.imag = (obj1.real * obj2.imag) + (obj2.real * obj1.imag);
	return res;
}

int main() {
	Complex c1(2.3, 4.5); // create a complex number c1 with real part 2.3 and imaginary part 4.5
	Complex c2(1.2, 3.4); // create a complex number c2 with real part 1.2 and imaginary part 3.4
	Complex c3 = c1 + c2; // add c1 and c2 and assign to c3
	Complex c4 = c1 * c2; // multiply c1 and c2 and assign to c4
	cout << "c1 = ";
	c1.display(); // display c1
	cout << "c2 = ";
	c2.display(); // display c2
	cout << "c1 + c2 = ";
	c3.display(); // display the sum of c1 and c2
	cout << "c1 * c2 = ";
	c4.display(); // display the product of c1 and c2
	return 0;
}
