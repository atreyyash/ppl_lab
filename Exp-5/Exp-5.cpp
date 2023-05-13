// Exp - 5.cpp
#include <iostream>
#include <iomanip>
using namespace std;

class Time {
private:
	int hh, mm, ss;

public:
	Time(int h = 0, int m = 0, int s = 0) { // parameterized constructor
		hh = h;
		mm = m;
		ss = s;
	}

	void add(Time t1, Time t2) { // member function to add two time objects
		ss = t1.ss + t2.ss;
		mm = t1.mm + t2.mm + (ss / 60);
		hh = t1.hh + t2.hh + (mm / 60);
		ss %= 60;
		mm %= 60;
		hh %= 24;
	}

	Time diff(Time t) { // member function to find the difference in time
		int s1 = hh * 3600 + mm * 60 + ss;
		int s2 = t.hh * 3600 + t.mm * 60 + t.ss;
		int seconds = abs(s1 - s2);
		int h = seconds / 3600;
		int m = (seconds % 3600) / 60;
		int s = seconds % 60;
		Time diffTime(h, m, s);
		return diffTime;
	}

	void showTime() { // member function to show the time
		cout << setw(2) << setfill('0') << hh << ":"
		     << setw(2) << setfill('0') << mm << ":"
		     << setw(2) << setfill('0') << ss << endl;
	}

	void showHour() { // member function to show the hour
		cout << "\tHour: " << hh << endl;
	}

	void showMin() { // member function to show the minutes
		cout << "\tMinute: " << mm << endl;
	}

	void showSec() { // member function to show the seconds
		cout << "\tSecond: " << ss << endl;
	}
};

int main() {
	Time t1(2, 30, 45); // create a time object t1 with 2 hours, 30 minutes, and 45 seconds
	Time t2(1, 15, 30); // create a time object t2 with 1 hour, 15 minutes, and 30 seconds
	Time t3; // create a time object t3 to hold the sum of t1 and t2
	t3.add(t1, t2); // add t1 and t2 and assign to t3
	Time diffTime = t1.diff(t2); // find the difference between t1 and t2 and assign to diffTime
	cout << "Time 1: ";
	t1.showTime();
	// cout << endl;
	t1.showHour(); // show the hour of t1
	t1.showMin(); // show the minutes of t1
	t1.showSec(); // show the seconds of t1
	cout << "Time 2: ";
	t2.showTime();
	// cout << endl;
	t2.showHour(); // show the hour of t2
	t2.showMin(); // show the minutes of t2
	t2.showSec(); // show the seconds of t2
	cout << "Time 3 (sum of Time 1 and Time 2): ";
	t3.showTime();
	// cout << endl;
	t3.showHour(); // show the hour of t3
	t3.showMin(); // show the minutes of t3
	t3.showSec(); // show the seconds of t3
	cout << "Difference between Time 1 and Time 2: ";
	diffTime.showTime();
	cout << endl;
}